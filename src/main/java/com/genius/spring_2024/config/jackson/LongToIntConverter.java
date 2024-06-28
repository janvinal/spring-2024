package com.genius.spring_2024.config.jackson;

import com.fasterxml.jackson.databind.util.StdConverter;

public class LongToIntConverter extends StdConverter<Long, Integer> {

    @Override
    public Integer convert(Long value) {
        return Math.toIntExact(LongEncoder.decode48(value));
    }

}
