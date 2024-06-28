package com.genius.spring_2024.config.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class SensitiveIdSerializer extends JsonSerializer<Long> {

    @Override
    public void serialize(Long value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        log.info("serialize into..., value={}", value);
        try {
            gen.writeNumber(LongEncoder.encode48(value));
        } catch (Throwable e) {
            log.error("serialize failed, value={}", value, e);
        }
    }
}
