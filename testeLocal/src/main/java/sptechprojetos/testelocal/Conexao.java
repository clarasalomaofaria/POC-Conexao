/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptechprojetos.testelocal;

/**
 *
 * @author Clara
 */

import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;


public class Conexao {
    public static void main(String[] args) {
    
DataSource dataSource = new DriverManagerDataSource() {{
    setDriverClassName("com.mysql.cj.jdbc.Driver");
    setUrl("jdbc:mysql://localhost:3306/renderwatch?serverTimezone=UTC");
    setUsername("rw");
    setPassword("urubu100");
}};

JdbcTemplate jdbcTemplate = new JdbcTemplate();
jdbcTemplate.setDataSource(dataSource);

String sql = "SELECT * FROM maquina";
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
for (Map<String, Object> row : rows) {
    System.out.println(row.get("nome"));
}


    }
    
}
