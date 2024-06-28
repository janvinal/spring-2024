package com.genius.spring_2024.config.jackson;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Slf4j
@Configuration
public class JacksonConfig {

    @Bean
    @Primary
    public ObjectMapper objectMapper(Jackson2ObjectMapperBuilder builder, SensitiveFieldAnnotationIntrospector introspector) {
        log.info("objectMapper into..., introspector={}", introspector);
        ObjectMapper objectMapper = builder.createXmlMapper(false).build();
        AnnotationIntrospector annotationIntrospector = objectMapper.getSerializationConfig().getAnnotationIntrospector();
        AnnotationIntrospector pair = AnnotationIntrospectorPair.pair(annotationIntrospector, introspector);
        objectMapper.setAnnotationIntrospector(pair);
        return objectMapper;
    }

    @Bean
    public SensitiveFieldAnnotationIntrospector sensitiveFieldAnnotationIntrospector() {
        return new SensitiveFieldAnnotationIntrospector();
    }

    @Bean
    public SensitiveFieldSerializer sensitiveFieldSerializer() {
        return new SensitiveFieldSerializer();
    }

}
