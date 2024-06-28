package com.genius.spring_2024.vo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.genius.spring_2024.config.jackson.IntToLongConverter;
import com.genius.spring_2024.config.jackson.LongToIntConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {

//    @JsonSerialize(converter = IntToLongConverter.class)
    @JsonDeserialize(converter = LongToIntConverter.class)
    private Integer id;

    private String name;

    private String idCardNo;
}
