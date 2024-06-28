package com.genius.spring_2024.config.jackson;

import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SensitiveFieldAnnotationIntrospector extends NopAnnotationIntrospector {
    @Override
    public Object findSerializer(Annotated am) {
        SensitiveField annotation = am.getAnnotation(SensitiveField.class);
        if (annotation != null) {
            log.info("SensitiveFieldAnnotationIntrospector use SensitiveField annotation.");
            return SensitiveFieldSerializer.class;
        }
        return super.findSerializer(am);
    }
}
