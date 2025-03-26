/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hilo.hilo;

import static hilo.hilo.EjThreadGroup.listarHilos;

public class Hilo extends Thread {

    public Hilo(String nombre) {
        super(nombre);
    }

    
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración " + (i + 1) + " de " + getName());
        }
        System.out.println("Termina el " + getName());
    }

    public static void main(String[] args) {
        /*new Hilo("Primer hilo").start();
        new Hilo("Segundo Hilo").start();
        System.out.println("Termina el hilo principal");*/
        /*new Thread(new HiloR(), "Primer hilo").start();
        new Thread(new HiloR(), "Segundo Hilo").start();
        System.out.println("Termina el hilo principal 1");*/
    /*ThreadGroup grupoHilos = new ThreadGroup("Grupo con prioridad normal");
    Thread hilo1 = new EjThreadGroup(grupoHilos, "Hilo 1 con prioridad máxima");
    Thread hilo2 = new EjThreadGroup(grupoHilos, "Hilo 2 con prioridad normal");
    Thread hilo3 = new EjThreadGroup(grupoHilos, "Hilo 3 con prioridad normal");
    Thread hilo4 = new EjThreadGroup(grupoHilos, "Hilo 4 con prioridad normal");
    Thread hilo5 = new EjThreadGroup(grupoHilos, "Hilo 5 con prioridad normal");

    hilo1.setPriority(Thread.MAX_PRIORITY);
    grupoHilos.setMaxPriority(Thread.NORM_PRIORITY);

    System.out.println("Prioridad del grupo = " + grupoHilos.getMaxPriority());
    System.out.println("Prioridad del Thread = " + hilo1.getPriority());
    System.out.println("Prioridad del Thread = " + hilo2.getPriority());
    System.out.println("Prioridad del Thread = " + hilo3.getPriority());
    System.out.println("Prioridad del Thread = " + hilo4.getPriority());
    System.out.println("Prioridad del Thread = " + hilo5.getPriority());
    hilo1.start();
    hilo2.start();
    hilo3.start();
    hilo4.start();
    hilo5.start();
    listarHilos(grupoHilos);*/
    
    /*new Cuenta("Acceso 1").start();
        new Cuenta("Acceso 2").start();
        new Cuenta("Deposito 1").start();
        new Cuenta("Deposito 2").start();
        System.out.println("Termina el hilo principal");*/
    }
}