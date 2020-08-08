package com.exercici_http_service.exercici.service;


import com.exercici_http_service.exercici.model.Empleado;
import com.exercici_http_service.exercici.repository.IEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService implements IEmpleadoService{

    @Autowired
    private IEmpleado repo;

    @Override
    public List<Empleado> listar() {
        return repo.listar();
    }

    @Override
    public Empleado listById(int id) {

        return repo.listById(id);
    }

    @Override
    public int insertar(Empleado empleado) {

        repo.insertar(empleado);
        return 0;
    }

    @Override
    public int editar(Empleado empleado) {
        repo.editar(empleado);
        return 0;
    }

    @Override
    public void delete(int id) {
        repo.delete(id);
    }
}
