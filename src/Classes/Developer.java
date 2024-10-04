package Classes;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Maria Daniela
 */
public class Developer extends Thread {

    private int rol;
    private int salary;
    private Semaphore mutex;

    public Developer(int rol, int salary, Semaphore m) {
        this.rol = rol;
        this.salary=salary;
        this.mutex = m;
    }
    
    @Override
    public void run(){
        while (true){
            System.out.println("Trabajadores "+ this.rol + "Salario"+ this.salary);
            try {
                sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    
    
    

}
