/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilo.hilo;

/**
 *
 * @author richa
 */
public class HiloR implements Runnable {

    
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración " + (i + 1) + " de " +
                    Thread.currentThread().getName());
        }
        System.out.println("Termina el " + Thread.currentThread().getName());
    }

}
