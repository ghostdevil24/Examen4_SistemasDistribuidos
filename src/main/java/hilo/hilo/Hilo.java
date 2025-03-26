/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hilo.hilo;

import java.io.FileWriter;
import java.io.IOException;

public class Hilo extends Thread {
    private long tiempoInicio, tiempoFin, tiempoTotal;

    public Hilo(String nombre) {
        super(nombre);
    }

    public void run() {
        tiempoInicio = System.nanoTime(); // Inicia tiempo
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración " + (i + 1) + " de " + getName());
        }
        tiempoFin = System.nanoTime(); // Termina tiempo
        tiempoTotal = tiempoFin - tiempoInicio;
        System.out.println("Termina el " + getName());
    }

    public long getTiempoTotal() {
        return tiempoTotal;
    }

    public static void main(String[] args) {
        String nombreArchivo = "resultados.csv";
        
        try (FileWriter escritor = new FileWriter(nombreArchivo)) {
            escritor.append("Ejecución,Hilo,Tiempo(ns)\n"); // Encabezados CSV

            for (int ejecucion = 1; ejecucion <= 5; ejecucion++) {
                System.out.println("\nEjecución #" + ejecucion);
                long inicioTotal = System.nanoTime();

                Hilo h1 = new Hilo("Hilo 1");
                Hilo h2 = new Hilo("Hilo 2");
                Hilo h3 = new Hilo("Hilo 3");

                h1.start();
                h2.start();
                h3.start();

                try {
                    h1.join();
                    h2.join();
                    h3.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                long finTotal = System.nanoTime();
                long tiempoTotalEjecucion = finTotal - inicioTotal;

                // Guardar datos en CSV
                escritor.append(ejecucion + ",Hilo 1," + h1.getTiempoTotal() + "\n");
                escritor.append(ejecucion + ",Hilo 2," + h2.getTiempoTotal() + "\n");
                escritor.append(ejecucion + ",Hilo 3," + h3.getTiempoTotal() + "\n");
                escritor.append(ejecucion + ",Total," + tiempoTotalEjecucion + "\n");
            }

            System.out.println("\nLos resultados fueron guardados en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
