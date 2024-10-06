/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author soyis
 */
class ProjectManager {
    private int hoursWatchingAnime = 16;
    private int hoursWorking = 8;
    private double salaryPerHour = 40;
    private int totalFines = 0;

    public void work() {
        for (int i = 0; i < hoursWatchingAnime; i += 0.5) {
            watchAnime();
            if (i % 1 == 0) {
                checkProgress();
            }
        }
        updateCounter();
    }

    private void watchAnime() {
        // Lógica para ver anime
    }

    private void checkProgress() {
        // Lógica para revisar el avance del proyecto
    }

    private void updateCounter() {
        // Lógica para actualizar el contador de días restantes
    }

    public void applyFine() {
        totalFines += 100;
    }

    public double calculateSalary() {
        return (hoursWatchingAnime + hoursWorking) * salaryPerHour - totalFines;
    }
}

