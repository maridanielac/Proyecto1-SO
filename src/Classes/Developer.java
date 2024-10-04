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
    private String name;
    private int dayDuration;
    private int payPerHour;
    private Drive drive;
    private int WorkDay;
    private int ToWorkDay;
    private int accSalary;
    private int content;
    private int CantDeveloper;

    public Developer(int rol, String name, int dayDuration, int payPerHour, Semaphore mutex, Drive drive) {
        this.rol = rol;
        this.name = name;
        this.dayDuration = dayDuration;
        this.payPerHour = payPerHour;
        this.mutex = mutex;
        this.drive = drive;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Trabajadores " + this.rol + "Salario" + this.salary);
            try {
                sleep(dayDuration);
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void Work() {
        setWorkDay(getWorkDay()+1);
        if (getWorkDay() >= getToWorkDay()){
            setWorkDay(0);
        }
    }
    
    public void Funcion(){
        setWorkDay(getWorkDay()+1);
        if (getWorkDay() >= getToWorkDay()){
            try{
                getMutex().acquire();
                getMutex().release();
                
            }catch(InterruptedException ex){
                System.out.println(Err);
            }
        } 
        salaryWorker();
    }

    public void salaryWorker(){
        setAccSalary(getAccSalary()+getSalary() * getCantDeveloper()*24 );
        
    }
    
    private int getWorkDay() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setWorkDay(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int getToWorkDay() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public int getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(int payPerHour) {
        this.payPerHour = payPerHour;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public int getAccSalary() {
        return accSalary;
    }

    public void setAccSalary(int accSalary) {
        this.accSalary = accSalary;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }


    public int getCantDeveloper() {
        return CantDeveloper;
    }

    public void setCantDeveloper(int CantDeveloper) {
        this.CantDeveloper = CantDeveloper;
    }
    
    
}
