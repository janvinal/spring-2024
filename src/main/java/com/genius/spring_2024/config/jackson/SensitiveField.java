package com.genius.spring_2024.config.jackson;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
public @interface SensitiveField {
    /**
     * 字段脱敏类型
     *
     * @return 字段脱敏类型
     */
    SensitiveFieldTypeEnum type() default SensitiveFieldTypeEnum.COMMON;

}
