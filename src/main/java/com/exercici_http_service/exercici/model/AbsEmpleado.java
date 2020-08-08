//package com.exercici_http_service.exercici.model;
//;
//
//public abstract class AbsEmpleado {
//
//    private int id;
//    private String fullName;
//    private String phone;
//    private double salary = 0;
//
//    public AbsEmpleado( String fullName, String phone, double salary) throws Exception {
//        if (fullName.equals(""))
//            throw new Exception();
//        if (phone.equals(""))
//            throw new Exception();
//
//
//        this.fullName = fullName;
//        this.phone = phone;
//        this.salary = salary;
//    }
//    public abstract void pay();
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//}
