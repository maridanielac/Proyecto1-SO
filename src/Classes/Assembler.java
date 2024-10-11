/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Classes.Company;
import Classes.Developer;
import Classes.Drive;
import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maria Daniela
 */
public class Assembler {
    //Falta ver si creo esta clase o la dejo en company
    
    private int Assemblerquantity;//Cantidad de ensambladores
    private int salary; 
    private float accSalary; //Salario acomulado
    private int dayDuration; 
    private int daysWorking; //Cantidad de dias despues de la ultima entrega
    private int daysToWork; //Cantidad de dias a trabajar para entregar
    private int nextTG; // Capitulos antes del capitulo con plot twist
    private int countTG; // Contador antes del capitulo con plot twist
    private boolean makeTG; //Crear capitulo con plot twist
    private Semaphore mutex;
    private Drive drive; //El drive a usar
    private Company company;
    
    private int numPlacasBases; 
    private int numCpus; 
    private int numMemoriaRam; 
    private int numFuenteAli; 
    private int numTajetaGra; 
    
    public Assembler(int quantity , int salary, int dayDuration, Semaphore mutex, int daysToWork, Company company, 
            int numPlacasBases, int numCpus, int numMemoriaRam, int numFuenteAli, int numTarjetaGra, int nextTG) {
        this.salary = salary;
        this.accSalary = 0;
        this.dayDuration = dayDuration;
        this.mutex = mutex;
        this.Assemblerquantity = quantity;
        this.daysWorking = 0;
        this.daysToWork = daysToWork;
        this.countTG = 0;
        this.makeTG = false;
        this.company =  company;
        this.drive = company.getDrive();
        
        
        this.numPlacasBases = numPlacasBases; 
        this.numCpus = numCpus; 
        this.numMemoriaRam = numMemoriaRam; 
        this.numFuenteAli = numFuenteAli; 
        this.numTajetaGra = numTarjetaGra;
        
        this.nextTG = nextTG;
        this.countTG = 0;
    }
    
    public void run() {
        while (true) {
            try {
                checkDrive();
                obtainSalary();
                sleep(getDayDuration());
            } catch (InterruptedException Err){
                System.out.println(Err);
            }
        }
    }
    
    
      public void checkDrive(){
        if (getDrive().getPlacasbases() >= getNumPlacasBases() && getDrive().getCpus() >= getNumCpus() && 
            getDrive().getMemoriaram() >= getNumMemoriaRam() && getDrive().getFuentealim() >= getNumFuenteAli()) {
            if(getCountTG() >= getNextTG() && getDrive().getTarjgraficas() >= getNumTajetaGra()){
                this.setMakeTG(true);
                Work();
            }else{
               Work();
            }
        } 
    }

    public void Work() {
        setDaysWorking(getDaysWorking()+1);
        if (getDaysWorking() >= getDaysToWork()) {
            createChapter();
            setDaysWorking(0);
        }
     }
    
    public void createChapter() {
        setDaysWorking(getDaysWorking()+1);
        if (getDaysWorking() >= getDaysToWork()) {
            try {
                getMutex().acquire();
                getDrive().addCompu(1, this.makeTG);
                delate();
                setMakeTG(false);
                getMutex().release();
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        obtainSalary();
    }
    
    public void obtainSalary() {
        setAccSalary(getAccSalary() + getSalary()*getAssemblerquantity()*24);
        getCompany().setGastos(getCompany().getGastos()+getSalary()*getAssemblerquantity()*24);
        //this.ContablesLabel[1].setText(String.valueOf(getCompany().getGastos()+getSalary()*getAssemblerquantity()*24));
    }
    
    public void delate() {
        getDrive().setPlacasbases(getDrive().getPlacasbases() - getNumPlacasBases());
        getDrive().setCpus(getDrive().getCpus() - getNumCpus());
        getDrive().setMemoriaram(getDrive().getMemoriaram() - getNumMemoriaRam());
        getDrive().setFuentealim(getDrive().getFuentealim() - getNumFuenteAli());
        setCountTG(getCountTG() + 1);
        if(this.makeTG){
            getDrive().setPlacasbases(getDrive().getTarjgraficas() - getNumTajetaGra());
            setCountTG(0);
        }
        //getDrive().actParts();
     }

    public int getAssemblerquantity() {
        return Assemblerquantity;
    }

    public void setAssemblerquantity(int Assemblerquantity) {
        this.Assemblerquantity = Assemblerquantity;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public float getAccSalary() {
        return accSalary;
    }

    public void setAccSalary(float accSalary) {
        this.accSalary = accSalary;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public int getDaysWorking() {
        return daysWorking;
    }

    public void setDaysWorking(int daysWorking) {
        this.daysWorking = daysWorking;
    }

    public int getDaysToWork() {
        return daysToWork;
    }

    public void setDaysToWork(int daysToWork) {
        this.daysToWork = daysToWork;
    }

    public int getNextTG() {
        return nextTG;
    }

    public void setNextTG(int nextTG) {
        this.nextTG = nextTG;
    }

    public int getCountTG() {
        return countTG;
    }

    public void setCountTG(int countTG) {
        this.countTG = countTG;
    }

    public boolean isMakeTG() {
        return makeTG;
    }

    public void setMakeTG(boolean makeTG) {
        this.makeTG = makeTG;
    }

    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getNumPlacasBases() {
        return numPlacasBases;
    }

    public void setNumPlacasBases(int numPlacasBases) {
        this.numPlacasBases = numPlacasBases;
    }

    public int getNumCpus() {
        return numCpus;
    }

    public void setNumCpus(int numCpus) {
        this.numCpus = numCpus;
    }

    public int getNumMemoriaRam() {
        return numMemoriaRam;
    }

    public void setNumMemoriaRam(int numMemoriaRam) {
        this.numMemoriaRam = numMemoriaRam;
    }

    public int getNumFuenteAli() {
        return numFuenteAli;
    }

    public void setNumFuenteAli(int numFuenteAli) {
        this.numFuenteAli = numFuenteAli;
    }

    public int getNumTajetaGra() {
        return numTajetaGra;
    }

    public void setNumTajetaGra(int numTajetaGra) {
        this.numTajetaGra = numTajetaGra;
    }
    
    
    
    
}
