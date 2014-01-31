/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Formularios;

import Ventanas.SplashScream;

/**
 *
 * @author robert
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new Thread(new SplashScream()).start();

    }

}
