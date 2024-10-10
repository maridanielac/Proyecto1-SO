/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author soyis
 */
public class Director extends Thread{
    
    private int salary;
    private int accSalary;
    private int dayDuration;
    private int idle; //0: entregando cpmputadoras, 1: trabajando 2: vigilando al PM
    private int watchTime; //Tiempo que vigila al PM
    private int timeLeft; //Tiempo que falta despues de la vigilancia para completar la hora
    private int hour;
    private Semaphore mutex;
    private Company company;
    private ProjectManager projectManager;
    private Drive drive;
    
    //Los labels que el director manipula
    private JLabel[] labels;
    
    
    public Director(int dayDuration, int salary, Company company, ProjectManager projectManager, Semaphore mutex, Drive drive){
       this.dayDuration = dayDuration;
       this.hour = dayDuration/24;
       this.watchTime = dayDuration/41;
       this.timeLeft = this.hour - this.watchTime;
       this.salary = salary;
       this.accSalary = 0;
       this.company = company;
       this.projectManager = projectManager;
       this.mutex = mutex;
       this.drive = drive;
       this.idle = 1;
    }
    
    @Override
    public void run(){
        while (true){
            try {
                setIdle(1);
                int randHour = (int)Math.floor(Math.random()*24+1);
                checkDay();
                actState();
                for (int contTime = 0;contTime < 24;contTime++){
                    sleep(hour);
                    obtainSalary();
                    if(contTime == randHour){
                        setIdle(2);
                        actState();
                        sleep(watchTime);
                        if(getProjectManager().isIdle()){
                            getProjectManager().setSanctioned(true);
                            getProjectManager().setSanctions(getProjectManager().getSanctions() + 1);
                        }
                        setIdle(1);
                        sleep(timeLeft);
                    }
                }
            }catch (InterruptedException ex) {
               Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
    
    //Actualiza los labels del estado del director
    public void actState() {
        switch(this.getIdle()){
            
            case 0: 
                this.labels[6].setText("Entregando Computadoras");
                break;
            case 1:
                this.labels[6].setText("Trabajando");
                break;
            case 2:
                this.labels[6].setText("Vigilando");
                break;
            default:
                break;
        }
    }
    
    public void checkDay() throws InterruptedException{
        this.labels[3].setText(String.valueOf(getProjectManager().getCommitDay()));
        if (getProjectManager().getCommitDay() == 0){
            sendComputers();   
        }
    }
    
    public void sendComputers() throws InterruptedException{
        setIdle(0);
        actState();
        mutex.acquire();
        getCompany().setIngresos(getCompany().getIngresos() + getDrive().getComputadoras()*getCompany().getBeneficios() + getDrive().getComputadorasytgraficas()*getCompany().getComputerstarjetasgraficas());
        getCompany().setBeneficios(getCompany().getIngresos() - getCompany().getGastos());
        getDrive().setComputadoras(0);
        getDrive().setComputadorasytgraficas(0);
        mutex.release();
        sleep(dayDuration);
        this.labels[0].setText(String.valueOf(getCompany().getIngresos()));
        this.labels[2].setText(String.valueOf(getCompany().getBeneficios()));
        
    }
    
    public void obtainSalary() {
        setAccSalary(getAccSalary() + getSalary()*24);
        this.getCompany().setGastos(getCompany().getGastos() + getSalary()*24);
        this.getCompany().setBeneficios(getCompany().getIngresos() - getCompany().getGastos());
        this.labels[1].setText(String.valueOf(getCompany().getGastos()));
        this.labels[2].setText(String.valueOf(getCompany().getBeneficios()));
    }
    
    
    

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAccSalary() {
        return accSalary;
    }

    public void setAccSalary(int accSalary) {
        this.accSalary = accSalary;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public int getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(int watchTime) {
        this.watchTime = watchTime;
    }


    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore Mutex) {
        this.mutex = Mutex;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public ProjectManager getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(ProjectManager projectManager) {
        this.projectManager = projectManager;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(int timeLeft) {
        this.timeLeft = timeLeft;
    }

    /**
     * @return the labels
     */
    public JLabel[] getLabels() {
        return labels;
    }

    /**
     * @param labels the labels to set
     */

    /**
     * @param labels the labels to set
     */
    public void setLabels(JLabel[] labels) {
        this.labels = labels;
    }

    /**
     * @return the idle
     */
    public int getIdle() {
        return idle;
    }

    /**
     * @param idle the idle to set
     */
    public void setIdle(int idle) {
        this.idle = idle;
    }

   
    
}
