package hilo.hilo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author richa
 */
public class EjThreadGroup extends Thread {

    public EjThreadGroup(ThreadGroup g, String n) {
        super(g, n);
    }


    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(getName() + " ");
        }
        System.out.println(); // Salto de línea después del bucle
    }

    public static void listarHilos(ThreadGroup grupoActual) {
        int numHilos;
        Thread[] listaDeHilos;

        numHilos = grupoActual.activeCount();
        listaDeHilos = new Thread[numHilos];
        grupoActual.enumerate(listaDeHilos);

        System.out.println("\nNúmero de hilos activos = " + numHilos + "\n");
        for (int i = 0; i < numHilos; i++) {
            System.out.println("Hilo activo " + (i + 1) + " = " + listaDeHilos[i].getName());
        }
    }

}