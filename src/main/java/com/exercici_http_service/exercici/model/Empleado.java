package com.exercici_http_service.exercici.model;

public class Empleado  {


    private int id;
    private String fullName;
    private String phone;
    private Categorias categoria;
    private double salary;


    public Empleado() {
    }

    public Empleado(int id, String fullName, String phone, double salary, Categorias categoria) {
        this.categoria = categoria;
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.salary = salary;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
