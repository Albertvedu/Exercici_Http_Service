package com.exercici_http_service.exercici;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ExerciciApplication implements CommandLineRunner {

    @Autowired
    private JdbcTemplate template;

    public static void main(String[] args) {
        SpringApplication.run(ExerciciApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Inserción de 3 elementos de prueba
        template.execute("DROP TABLE Empleado IF EXISTS ");
        template.execute("CREATE TABLE Empleado(id INTEGER(11) PRIMARY KEY auto_increment, " +
                "fullName VARCHAR (255), phone VARCHAR (16), categoria ENUM ('ENGINEER','MANAGER','SALESMAN'), salary DOUBLE );");

        for (int i = 0; i < 3; i++) {
            template.update("INSERT INTO Empleado(fullName, phone, categoria, salary)values('Persona 000"+i+"', '932118833', 'SALESMAN', 50000);");
        }
    }
}

//    @Override
//    public void run(String... args) throws Exception {
//        // Inserción de 3 elementos de prueba
//        template.execute("DROP TABLE Empleado IF EXISTS ");
//        template.execute("CREATE TABLE Empleado(id INTEGER(11) PRIMARY KEY auto_increment, " +
//                "fullName VARCHAR (255), phone VARCHAR (16), categoria ENUM  ENGINEER('Engineer', 30000),\n" +
//                "     MANAGER('Manager', 40000),\n" +
//                "     SALESMAN('Salesman', 50000),  salary DOUBLE )");
//
//        for (int i = 0; i < 3; i++) {
//            template.update("INSERT INTO Empleado(fullName, phone, categoria, salary)values('Persona 000"+i+"', '932118833', 'Salesman, 22000')");
//        }
//    }
