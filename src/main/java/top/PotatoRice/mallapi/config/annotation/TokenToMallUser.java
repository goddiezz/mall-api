package top.PotatoRice.mallapi.config.annotation;

import java.lang.annotation.*;

/**
 * @author loorzve
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TokenToMallUser {
    /**
     * 当前用户在request中的名字
     * * @return String
     */
    String value() default "user";
}