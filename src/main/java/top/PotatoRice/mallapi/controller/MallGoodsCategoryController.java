package top.PotatoRice.mallapi.controller;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.PotatoRice.mallapi.common.MallException;
import top.PotatoRice.mallapi.common.ServiceResultEnum;
import top.PotatoRice.mallapi.controller.vo.MallIndexCategoryVO;
import top.PotatoRice.mallapi.service.MallGoodsCategoryService;
import top.PotatoRice.mallapi.util.Result;
import top.PotatoRice.mallapi.util.ResultGenerator;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author PotatoRice
 * @description
 * @date 2021/4/26 7:24 下午
 */
@RestController
@Api(value = "v1", tags = "4.楼楼商城分类页面接口")
@RequestMapping("/api/v1")
public class MallGoodsCategoryController {
    @Resource
    private MallGoodsCategoryService mallGoodsCategoryService;

    @GetMapping("/categories")
    @ApiOperation(value = "获取分类数据", notes = "分类页面使用")
    public Result getCategories() {
        List<MallIndexCategoryVO> categories = mallGoodsCategoryService.getCategoriesForIndex();
        if (CollectionUtils.isEmpty(categories)) {
            MallException.fail(ServiceResultEnum.DATA_NOT_EXIST.getResult());
        }
        return ResultGenerator.genSuccessResult(categories);
    }
}