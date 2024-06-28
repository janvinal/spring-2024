package com.genius.spring_2024.config.jackson;

import com.fasterxml.jackson.databind.util.StdConverter;

public class IntToLongConverter extends StdConverter<Integer, Long> {

    @Override
    public Long convert(Integer value) {
        return LongEncoder.encode48(value);
    }

}
