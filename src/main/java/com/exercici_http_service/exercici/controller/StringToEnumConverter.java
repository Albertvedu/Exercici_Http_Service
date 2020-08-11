package com.exercici_http_service.exercici.controller;

import com.exercici_http_service.exercici.model.Categorias;
import org.springframework.core.convert.converter.Converter;

public class StringToEnumConverter implements Converter<String, Categorias> {
    @Override
    public Categorias convert(String source) {
        try {
            return Categorias.valueOf(source.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
