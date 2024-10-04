/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Maria Daniela
 */
public class Drive {
    public Developer(int rol, String name, int dayDuration, int payPerHour, Semaphore mutex, Drive drive) {
        this.rol = rol;
        this.name = name;
        this.dayDuration = dayDuration;
        this.payPerHour = payPerHour;
        this.mutex = mutex;
        this.drive = drive;
    }
    
}
