/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author soyis
 */
class Director {
    private double salaryPerHour = 60;

    public void work(int daysRemaining) {
        if (daysRemaining == 0) {
            sendComputers();
        } else {
            administrativeTasks();
            checkPM();
        }
    }

    private void sendComputers() {
        // Lógica para enviar computadoras
    }

    private void administrativeTasks() {
        // Lógica para tareas administrativas
    }

    private void checkPM() {
        // Lógica para revisar lo que está haciendo el PM
        if (isWatchingAnime()) {
            applyFineToPM();
        }
    }

    private boolean isWatchingAnime() {
        // Lógica para determinar si el PM está viendo anime
        return false; // Cambia esto según tu lógica
    }

    private void applyFineToPM() {
        // Aplicar multa al PM
    }
}
