/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptechprojetos.testelocal;

import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Clara
 */
public class ConexaoLocal {

    private JdbcTemplate conexaoDoBanco;

    DataSource dataSource = new DriverManagerDataSource() {
        {
            setDriverClassName("com.mysql.cj.jdbc.Driver");
            setUrl("jdbc:mysql://localhost:3306/renderwatch?serverTimezone=UTC");
            setUsername("rw");
            setPassword("urubu100");
        }
    };

    public ConexaoLocal() {
        this.conexaoDoBanco = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConexaoBanco() {
        return conexaoDoBanco;
    }
    
    public List<Map<String, Object>> query(String sql) {
    return conexaoDoBanco.queryForList(sql);
}


}
