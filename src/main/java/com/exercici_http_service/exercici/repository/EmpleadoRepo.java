package com.exercici_http_service.exercici.repository;

import com.exercici_http_service.exercici.model.Categorias;
import com.exercici_http_service.exercici.model.Empleado;
import org.apache.commons.lang3.EnumUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@Repository
public class EmpleadoRepo implements IEmpleado{

    @Autowired
    private JdbcTemplate template;

    @Override
    public List<Empleado> listar() {
        String sql = "SELECT * FROM EMPLEADO";
        List<Empleado> empleados= template.query(sql, (rs, rowNum) ->
                new Empleado(
                        rs.getInt("id"),
                        rs.getString("fullName"),
                        rs.getString("phone"),
                        rs.getDouble("salary"),
                        Categorias.valueOf(rs.getString("categoria")))
        );

        return empleados;
    }



    @Override
    public Empleado listById(int id) {
        String sql = "SELECT * FROM empleado WHERE id=?";
        Empleado e = template.queryForObject(sql, new Object[]{id}, (rs, rowNum) ->
                new Empleado(
                        rs.getInt("id"),
                        rs.getString("fullName"),
                        rs.getString("phone"),
                        rs.getDouble("salary"),
                        Categorias.valueOf(rs.getString("categoria")))
                );
        return e;
    }
    @Override
    public int insertar(Empleado empleado) {
        String sql = "INSERT INTO empleado(fullName, phone, categoria, salary) VALUES(?,?,?,?)";
        int respuesta = template.update(sql, empleado.getFullName(), empleado.getPhone(), empleado.getCategoria().getValue(), empleado.getCategoria().getSalario());
        return respuesta;
    }

    @Override
    public int editar(Empleado empleado) {

        String sql ="UPDATE empleado set fullName=?, phone =?, categoria=?, salary=? WHERE id=?";
        int resposta = template.update(sql, empleado.getFullName(), empleado.getPhone(), empleado.getCategoria().getValue(), empleado.getCategoria().getSalario(), empleado.getId() );
        return resposta;
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE  FROM empleado WHERE id=?";
        template.update(sql, id);
    }
}
