package com.genius.spring_2024.config.jackson;

import com.fasterxml.jackson.databind.util.StdConverter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LongToIntConverter extends StdConverter<Long, Integer> {

    @Override
    public Integer convert(Long value) {
        log.info("convert value={}", value);
        return Math.toIntExact(LongEncoder.decode48(value));
    }

}
