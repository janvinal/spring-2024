package com.genius.spring_2024.config.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class SensitiveIdDeserializer extends JsonDeserializer<Long> {

    @Override
    public Long deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        log.info("deserialize into..., p={}", p);
        if (p == null || p.getText() == null) {
            return null;
        }
        try {
            long value = p.getLongValue();
            return LongEncoder.decode48(value);
        } catch (Throwable e) {
            log.error("deserialize failed, p={}", p, e);
        }
        return 0L;
    }
}
