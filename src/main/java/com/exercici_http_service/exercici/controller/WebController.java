package com.exercici_http_service.exercici.controller;

import javax.validation.Valid;

import com.exercici_http_service.exercici.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Controller
public class WebController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/listar").setViewName("listar");
    }

    @GetMapping("/")
    public String showForm(Empleado empleado) {
        return "nuevo";
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid Empleado empleado, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "nuevo";
        }

        return "redirect:/listar";
    }
}
