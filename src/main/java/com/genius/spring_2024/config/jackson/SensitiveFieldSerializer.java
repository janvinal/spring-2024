package com.genius.spring_2024.config.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class SensitiveFieldSerializer extends JsonSerializer<String>
//        implements ContextualSerializer
{

//    private final ThreadLocal<SensitiveFieldTypeEnum> type = new ThreadLocal<>();


    @Override
    public void serialize(String value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        log.info("serialize into..., value={}", value);
//        SensitiveFieldTypeEnum sensitiveFieldTypeEnum = type.get();
//        if (sensitiveFieldTypeEnum == null) {
//            return;
//        }
//        switch (sensitiveFieldTypeEnum) {
//            case COMMON:
//            case NAME:
//            case PHONE:
//            case ID_CARD:
//            case GENERATED_ID:
//            default:
//                log.info("SensitiveFieldSerializer serialize, type={}, value={}", sensitiveFieldTypeEnum, value);
                gen.writeString(value + " encrypted");
//        }
//        type.remove();
    }

//    @Override
//    public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property) throws JsonMappingException {
//        if (property != null) {
//            SensitiveField annotation = property.getAnnotation(SensitiveField.class);
//            SensitiveFieldTypeEnum sensitiveFieldTypeEnum = annotation.type();
//            type.set(sensitiveFieldTypeEnum);
//            return this;
//        }
//        return prov.findNullValueSerializer(null);
//    }
}
