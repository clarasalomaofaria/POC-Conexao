/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Clara
 */
public class Conexao {

    private JdbcTemplate conexaoBanco;

    public Conexao() {
        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://EC2_INSTANCE_IP:3306/DATABASE_NAME");
        dataSource.setUsername("root");
        dataSource.setPassword("#Gfteste");

        this.conexaoBanco = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConexaoBanco() {
        return conexaoBanco;
    }

}
