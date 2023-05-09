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
public class ConexaoAzure {
    
    private JdbcTemplate conexaoDoBanco;

    public ConexaoAzure() {

        BasicDataSource dataSource = new BasicDataSource();
        this.conexaoDoBanco = new JdbcTemplate(dataSource);

        /* SLQ SERVER NUVEM = AZURE */
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://svr-grupo6.database.windows.net:1433;"
                + "database=render_watch;user=adm-render-watch@svr-grupo6;password={#Gfgrupo6};"
                + "encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;");
        dataSource.setUsername("adm-render-watch");
        dataSource.setPassword("#Gfgrupo6");

    }

    public JdbcTemplate getConexaoDoBanco() {
        return conexaoDoBanco;
    }
}
