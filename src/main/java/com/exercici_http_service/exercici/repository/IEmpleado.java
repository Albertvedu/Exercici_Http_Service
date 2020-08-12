package com.exercici_http_service.exercici.repository;


import com.exercici_http_service.exercici.model.Categorias;
import com.exercici_http_service.exercici.model.Empleado;

import java.util.List;

public interface IEmpleado {
    List<Empleado> listar();
    Empleado listById(int id);
    int insertar ( Empleado empleado);
    int editar ( Empleado empleado);
    List<Empleado> listByCategory(String categoria);
    void delete ( int id);

}
