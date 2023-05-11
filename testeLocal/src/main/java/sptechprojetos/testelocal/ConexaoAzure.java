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
public class ConexaoAzure {
    
    private JdbcTemplate conexaoDoBanco;

    DataSource dataSource = new DriverManagerDataSource() {
        {
        setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        setUrl("jdbc:sqlserver://svr-grupo6.database.windows.net:1433;"
                + "database=render_watch;user=adm-render-watch@svr-grupo6;password={#Gfgrupo6};"
                + "encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;");
        setUsername("adm-render-watch");
        setPassword("#Gfgrupo6");
        }
    };

    public ConexaoAzure() {
        this.conexaoDoBanco = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConexaoBanco() {
        return conexaoDoBanco;
    }
    
    public List<Map<String, Object>> query(String sql) {
    return conexaoDoBanco.queryForList(sql);
}

}
