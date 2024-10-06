/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author soyis
 */
class Simulation {
    private ProjectManager pm;
    private Director director;

    public void startSimulation() {
        pm = new ProjectManager();
        director = new Director();

        Thread pmThread = new Thread(() -> {
            while (true) {
                pm.work();
                // Lógica para pausar el hilo si es necesario
            }
        });

        Thread directorThread = new Thread(() -> {
            while (true) {
                int daysRemaining = 0;
                director.work(daysRemaining);
                // Lógica para pausar el hilo si es necesario
            }
        });

        pmThread.start();
        directorThread.start();
    }
}

