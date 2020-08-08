package com.exercici_http_service.exercici.controller;


import com.exercici_http_service.exercici.model.Categorias;
import com.exercici_http_service.exercici.model.Empleado;
import com.exercici_http_service.exercici.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class EmpleadoController {

    @Autowired
    private IEmpleadoService service;

    @GetMapping("/listar")
    public String listar (Model model) {
        List<Empleado> empleados = service.listar();
        model.addAttribute("empleado", empleados);
        return "index";
    }
    @GetMapping("/nuevo")
    public String nuevo(Empleado empleado){

        return "insertar";
    }

    @PostMapping("/insertar")
    public String insertar(  Empleado empleado){

        service.insertar(empleado);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Empleado empleado = service.listById(id);
        model.addAttribute("empleado", empleado);
        return "editar";
    }

    @PostMapping("/actualizar")
    public String actualizar(@Validated Empleado empleado){
        service.editar(empleado);
        return "redirect:/listar";
    }
    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id ){
        service.delete(id);
        return "redirect:/listar";
    }
}
