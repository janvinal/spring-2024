package com.genius.spring_2024.config.jackson;

import com.fasterxml.jackson.databind.util.StdConverter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SensitiveIdConverter extends StdConverter<String, Integer> {
    @Override
    public Integer convert(String value) {
        log.info("convert into..., value={}", value);
        return (int) LongEncoder.decode48(Long.parseLong(value));
    }
}
