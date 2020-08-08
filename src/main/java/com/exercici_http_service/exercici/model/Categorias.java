package com.exercici_http_service.exercici.model;

import org.springframework.beans.factory.annotation.Autowired;

//
//public enum Categorias {
//    ENGINEER,
//     MANAGER,
//     SALESMAN
//}




public enum Categorias {
    ENGINEER("Engineer", 30000),
    MANAGER("Manager", 40000),
    SALESMAN("Salesman", 50000);

    private final String value;
    private final int salario;

    Categorias(String value, int salario) {
        this.value = value;
        this.salario = salario;
    }

    public String getValue() {
        return value;
    }

    public int getSalario() {
        return salario;
    }
}
