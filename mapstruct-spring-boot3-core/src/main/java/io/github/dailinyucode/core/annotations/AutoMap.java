package io.github.dailinyucode.core.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoMap {

    /**
     * 返回值类型
     * @return
     */
    Class<?> targetType();

    Class<?>[] uses() default {};

}