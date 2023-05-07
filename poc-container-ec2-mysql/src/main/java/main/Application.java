/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Timer;
import java.util.TimerTask;
import repository.UsuarioRepository;

/**
 *
 * @author Clara
 */
public class Application {

    public static void main(String[] args) {

        UsuarioRepository usuarioRepository = new UsuarioRepository();

        new Timer().scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                usuarioRepository.inserirDadosUsuario();
            }
        }, 0, 3000);
    }

}
