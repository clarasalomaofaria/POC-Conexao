/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import database.ConexaoAzure;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Clara
 */
public class UsuarioRepository {

    ConexaoAzure conexaoAzure = new ConexaoAzure();
    JdbcTemplate conAzure = conexaoAzure.getConexaoDoBanco();

    public void inserirDadosUsuarioAzure() {
        conAzure.update("INSERT INTO usuario VALUES (null, ?)",
                "Clara");
    }

}
