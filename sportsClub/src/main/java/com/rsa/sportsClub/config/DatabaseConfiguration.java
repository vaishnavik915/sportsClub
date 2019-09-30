package com.rsa.sportsClub.config;


import io.github.jhipster.domain.util.JSR310DateConverters;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.core.convert.CustomConversions;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableMongoRepositories("com.rsa.sportsClub.repositories")
@Import(value = MongoAutoConfiguration.class)
public class DatabaseConfiguration {


   @Bean
    public CustomConversions customConversions() {
        List<Converter<?, ?>> converters = new ArrayList<>();
        converters.add(JSR310DateConverters.DateToZonedDateTimeConverter.INSTANCE);
        converters.add(JSR310DateConverters.ZonedDateTimeToDateConverter.INSTANCE);
        return new CustomConversions(converters);
    }

}
