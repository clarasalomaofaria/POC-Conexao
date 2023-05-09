/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import database.Conexao;
import database.ConexaoAzure;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Clara
 */
public class UsuarioRepository {

    Conexao conexao = new Conexao();
    JdbcTemplate con = conexao.getConexaoBanco();

    ConexaoAzure conexaoAzure = new ConexaoAzure();
    JdbcTemplate conAzure = conexaoAzure.getConexaoDoBanco();

    public void inserirDadosUsuario() {

        con.update("INSERT INTO usuario VALUES (null, ?)",
                "Clara");

    }

    public void inserirDadosUsuarioAzure() {
        conAzure.update("INSERT INTO usuario VALUES (null, ?)",
                "Clara");
    }

}
