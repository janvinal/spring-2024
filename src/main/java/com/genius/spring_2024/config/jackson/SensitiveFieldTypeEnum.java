package com.genius.spring_2024.config.jackson;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SensitiveFieldTypeEnum {

    COMMON("通用脱敏（根据长度自动计算隐藏位数）"),

    ID_CARD("身份证"),

    NAME("姓名"),

    PHONE("手机号"),

    GENERATED_ID("自增的ID");

    /**
     * 描述
     */
    private final String description;
}
