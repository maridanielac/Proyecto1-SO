/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author soyis
 */
public class ProjectManager extends Thread {
    private boolean changeDay; 
    private boolean idle; //verifica si esta viendo anime 
    private int timeIdle; //Tiempo en que dura viendo anime
    private int dayDuration; //Duracion de un dia entero
    private int hour; //Duracion de una hora
    private boolean hourCheck; //Verificar que paso una hora
    private int countHour; //Contador de horas
    private Company company; //Empresa asociada
    private int salary;
    private int accSalary;
    private boolean sanctioned; //true: falta; false: no falta
    private int sanctions; //numero de sanciones
    private int commitDay;//dia de entrega de capitulo
    private int fixCommitDay;//variable fija que recuperaremos al resetear el dia de entrega de capitulos
    
    private JLabel[] ProjectManagerlabels;
    
    public ProjectManager(int dayDuration, int salary, int commitDay, Company company){
       this.dayDuration = dayDuration;
       this.hour = dayDuration/24;
       this.timeIdle = dayDuration/48;
       this.countHour = 0;
       this.changeDay = false;
       this.idle = false;
       this.hourCheck = false;
       this.salary = salary;
       this.accSalary = 0;
       this.sanctions = 0;
       this.sanctioned = false;
       this.commitDay = commitDay;
       this.fixCommitDay = commitDay;
       this.company = company;
        
    }
    
    @Override
    public void run(){
        while (true){
            try {
                this.ProjectManagerlabels[1].setText(String.valueOf(getCommitDay()));
                setSanctioned(false);
                for (int contTime = 0;contTime < 16;contTime++){
                    sleep(getTimeIdle());
                    setIdle(true);
                    ActState();
                    sleep(getTimeIdle());
                    setIdle(false);
                    ActState();
                }
                setIdle(false);
                ActState();
                if (getCommitDay()!= 0) {
                    setCommitDay(getCommitDay()-1);
                } else {
                    setCommitDay(getFixCommitDay());
                }
                obtainSalary();
                sleep(8*getHour());
            }catch (InterruptedException ex) {
               Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        
    }
    //Actualiza el Estado en la interfaz
    public void ActState() {
        if (isIdle()){
            this.ProjectManagerlabels[3].setText("Viendo Anime");
        } else {
            this.ProjectManagerlabels[3].setText("Trabajando");
        }
    }
    
    public void obtainSalary() {
        if (isSanctioned()){
        setAccSalary(getAccSalary() + getSalary() - 100);
        getCompany().setGastos(getCompany().getGastos()+getSalary()*24-100);
            setSanctions(getSanctions()+1);
        this.ProjectManagerlabels[2].setText(String.valueOf(getSanctions()));
        this.ProjectManagerlabels[4].setText(String.valueOf(getSanctions()*100));
    } else {
            setAccSalary(getAccSalary() + getSalary()*24);
            getCompany().setGastos(getCompany().getGastos()+getSalary()*24);
        }
    this.ProjectManagerlabels[0].setText(String.valueOf(getCompany().getGastos()));
    }
    
    

    public boolean isChangeDay() {
        return changeDay;
    }

    public void setChangeDay(boolean changeDay) {
        this.changeDay = changeDay;
    }

    public boolean isIdle() {
        return idle;
    }

    public void setIdle(boolean idle) {
        this.idle = idle;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public int getTimeIdle() {
        return timeIdle;
    }

    public void setTimeIdle(int timeIdle) {
        this.timeIdle = timeIdle;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isHourCheck() {
        return hourCheck;
    }

    public void setHourCheck(boolean hourCheck) {
        this.hourCheck = hourCheck;
    }

    public int getCountHour() {
        return countHour;
    }

    public void setCountHour(int countHour) {
        this.countHour = countHour;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the accSalary
     */
    public int getAccSalary() {
        return accSalary;
    }

    /**
     * @param accSalary the accSalary to set
     */
    public void setAccSalary(int accSalary) {
        this.accSalary = accSalary;
    }

    /**
     * @return the sanctioned
     */
    public boolean isSanctioned() {
        return sanctioned;
    }

    /**
     * @param sanctioned the sanctioned to set
     */
    public void setSanctioned(boolean sanctioned) {
        this.sanctioned = sanctioned;
    }

    /**
     * @return the sanctions
     */
    public int getSanctions() {
        return sanctions;
    }

    /**
     * @param sanctions the sanctions to set
     */
    public void setSanctions(int sanctions) {
        this.sanctions = sanctions;
    }

    /**
     * @return the commitDay
     */
    public int getCommitDay() {
        return commitDay;
    }

    /**
     * @param commitDay the commitDay to set
     */
    public void setCommitDay(int commitDay) {
        this.commitDay = commitDay;
    }

    /**
     * @return the fixCommitDay
     */
    public int getFixCommitDay() {
        return fixCommitDay;
    }

    /**
     * @param fixCommitDay the fixCommitDay to set
     */
    public void setFixCommitDay(int fixCommitDay) {
        this.fixCommitDay = fixCommitDay;
    }



    /**
     * @return the PMlabels
     */
    public JLabel[] getProjectManagerlabels() {
        return ProjectManagerlabels;
    }

    /**
     * @param PMlabels
     */
    public void setProjectManagerlabels(JLabel[] PMlabels) {
        this.ProjectManagerlabels = ProjectManagerlabels;
    }
    
    
}


