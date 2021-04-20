package top.PotatoRice.mallapi.common;

/**
 * @author PotatoRice
 * @description：
 * @date 2021/4/20 4:40 下午
 */
public class MallException extends RuntimeException{
    public MallException() {

    }

    public MallException(String message) {
        super(message);
    }

    /**
     * 抛出异常
     */
    public static void fail(String message) {
        throw new MallException(message);
    }
}

