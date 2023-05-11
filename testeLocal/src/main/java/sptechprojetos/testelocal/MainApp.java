/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptechprojetos.testelocal;

import java.util.List;
import java.util.Map;
import sptechprojetos.testelocal.ConexaoAzure;
import sptechprojetos.testelocal.ConexaoLocal;

/**
 *
 * @author Clara
 */
public class MainApp {

    public static void main(String[] args) {

        ConexaoLocal conLocal = new ConexaoLocal();
        List<Map<String, Object>> resultLocal = conLocal.query("SELECT * FROM maquina");
        for (Map<String, Object> row : resultLocal) {
            System.out.println(row);
        }

        ConexaoAzure conAzure = new ConexaoAzure();
        List<Map<String, Object>> resultAzure = conAzure.query("SELECT * FROM maquina");
        for (Map<String, Object> row : resultAzure) {
            System.out.println(row);
        }

    }
}
