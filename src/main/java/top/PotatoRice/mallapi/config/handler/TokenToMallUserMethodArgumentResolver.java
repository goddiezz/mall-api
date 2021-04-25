package top.PotatoRice.mallapi.config.handler;

import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import top.PotatoRice.mallapi.common.Constants;
import top.PotatoRice.mallapi.common.MallException;
import top.PotatoRice.mallapi.common.ServiceResultEnum;
import top.PotatoRice.mallapi.config.annotation.TokenToMallUser;
import top.PotatoRice.mallapi.entity.MallUser;
import top.PotatoRice.mallapi.entity.MallUserToken;
import top.PotatoRice.mallapi.mapper.MallUserMapper;
import top.PotatoRice.mallapi.mapper.MallUserTokenMapper;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author PotatoRice
 * @description
 * @date 2021/4/21 8:33 下午
 */
@Component
public
class TokenToMallUserMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Resource
    private MallUserMapper mallUserMapper;
    @Resource
    private MallUserTokenMapper mallUserTokenMapper;

    public TokenToMallUserMethodArgumentResolver() {
    }

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(TokenToMallUser.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) {
        if (parameter.getParameterAnnotation(TokenToMallUser.class) != null) {
            MallUser mallUser;
            String token = webRequest.getHeader("token");
            if (null != token && !"".equals(token) && token.length() == Constants.TOKEN_LENGTH) {
                Map<String, Object> map = new HashMap<>();
                map.put("token", token);
                List<MallUserToken> tokens = mallUserTokenMapper.selectByMap(map);
                if (tokens != null) {
                    MallUserToken mallUserToken = tokens.get(0);
                    if (mallUserToken == null || mallUserToken.getExpireTime().getTime() <= System.currentTimeMillis()) {
                        MallException.fail(ServiceResultEnum.TOKEN_EXPIRE_ERROR.getResult());
                    }
                    mallUser = mallUserMapper.selectById(mallUserToken.getUserId());
                    if (mallUser == null) {
                        MallException.fail(ServiceResultEnum.USER_NULL_ERROR.getResult());
                    }
                    if (mallUser.getLockedFlag().intValue() == 1) {
                        MallException.fail(ServiceResultEnum.LOGIN_USER_LOCKED_ERROR.getResult());
                    }
                    return mallUser;
                }
            } else {
                MallException.fail(ServiceResultEnum.NOT_LOGIN_ERROR.getResult());
            }
        }
        return null;
    }

    public static byte[] getRequestPostBytes(HttpServletRequest request) throws IOException {
        int contentLength = request.getContentLength();
        if (contentLength < 0) {
            return null;
        }
        byte[] buffer = new byte[contentLength];
        for (int i = 0; i < contentLength; ) {
            int len = request.getInputStream().read(buffer, i, contentLength - i);
            if (len == -1) {
                break;
            }
            i += len;
        }
        return buffer;
    }
}