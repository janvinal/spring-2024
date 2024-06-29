package com.genius.spring_2024.config.jackson;

import com.fasterxml.jackson.databind.util.StdConverter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IntToLongConverter extends StdConverter<Integer, Long> {

    @Override
    public Long convert(Integer value) {
        log.info("convert value={}", value);
        return LongEncoder.decode64(value);
    }

}
