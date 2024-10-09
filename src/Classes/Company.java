/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Main.App;
import java.util.concurrent.Semaphore;

/**
 *
 * @author soyis
 */
public class Company {

    private String name;
    private int maxEmployeesQuantity;
    private int actualEmployeesQuantity = 0;
    private Developer[] placaBase;
    private Developer[] cpus;
    private Developer[] ram;
    private Developer[] fuenteAlimentacion;
    private Developer[] tarjetasGraficas;
    private Developer[] ensambladores;
    private int projectManager;
    private ProjectManager projectManagerInstance;
    private int director;
    private Director directorInstance;
    private static Drive drive;
    private Semaphore mutex;
    private float totalCost = 0;
    private float earning = 0;
    private float profit = 0;
    private float lastOpsCost = 0;
    private float batchLastProfit = 0;
    private int totalDays = 0;
    private int remainingDays = App.getInstance().getDeadline();
    private int numComputadoras = 0;
    private int numComputadorasNorm = 0;
    private int numComputadorasGraf = 0;
    private int actualNumComputadoras = 0;
    private int actualNumComputadorasNorm = 0;
    private int actualNumComputadorasGraf = 0;
    private int lastNumComputadorasNorm = 0;
    private int lastNumComputadorasGraf = 0;
    private int tarjetasGraf = 0;

    // CONSTRUCTOR
    public Company(String name, int maxEmployeesQuantity, Developer[] placaBase, Developer[] cpus,
            Developer[] ram, Developer[] fuenteAlimentacion, Developer[] tarjetasGraficas,
            Developer[] ensambladores, int projectManager, int director, Drive drive, Semaphore mutex) {
        this.name = name;
        this.maxEmployeesQuantity = maxEmployeesQuantity;
        this.placaBase = placaBase;
        this.cpus = cpus;
        this.ram = ram;
        this.fuenteAlimentacion = fuenteAlimentacion;
        this.tarjetasGraficas = tarjetasGraficas;
        this.ensambladores = ensambladores;
        this.projectManager = projectManager;
        this.director = director;
        this.drive = drive;
        this.mutex = mutex;
        this.actualEmployeesQuantity();
    }

    public void start() {

        for (int i = 0; i < this.getPlacaBase().length; i++) {
            if (this.getPlacaBase()[i] != null) {
                this.getPlacaBase()[i].start();
            }
        }
        for (int i = 0; i < this.getCPUs().length; i++) {
            if (this.getCPUs()[i] != null) {
                this.getCPUs()[i].start();
            }
        }
        for (int i = 0; i < this.getRam().length; i++) {
            if (this.getRam()[i] != null) {
                this.getRam()[i].start();
            }
        }
        for (int i = 0; i < this.getFuenteAlimentacion().length; i++) {
            if (this.getFuenteAlimentacion()[i] != null) {
                this.getFuenteAlimentacion()[i].start();
            }
        }
        for (int i = 0; i < this.getTarjetasGraficas().length; i++) {
            if (this.getTarjetasGraficas()[i] != null) {
                this.getTarjetasGraficas()[i].start();
            }
        }
        for (int i = 0; i < this.getEnsambladores().length; i++) {
            if (this.getEnsambladores()[i] != null) {
                this.getEnsambladores()[i].start();
            }
        }
        this.getProjectManagerInstance().start();
        this.getDirectorInstance().start();

    }

    public void actualEmployeesQuantity() {
        int totalEmployees = 0;

        // Contar empleados no nulos en cada arreglo
        totalEmployees += countNonNull(placaBase);
        totalEmployees += countNonNull(cpus);
        totalEmployees += countNonNull(ram);
        totalEmployees += countNonNull(fuenteAlimentacion);
        totalEmployees += countNonNull(tarjetasGraficas);
        totalEmployees += countNonNull(ensambladores);

        this.setActualEmployeesQuantity(totalEmployees);
    }

    // Método auxiliar para contar los elementos no nulos en un arreglo de Employee
    public int countNonNull(Developer[] developers) {
        int count = 0;
        for (Developer developer : developers) {
            if (developer != null) {
                count++;
            }
        }
        return count;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the maxEmployeesQuantity
     */
    public int getMaxEmployeesQuantity() {
        return maxEmployeesQuantity;
    }

    /**
     * @param maxEmployeesQuantity the maxEmployeesQuantity to set
     */
    public void setMaxEmployeesQuantity(int maxEmployeesQuantity) {
        this.maxEmployeesQuantity = maxEmployeesQuantity;
    }

    /**
     * @return productores placa base
     */
    public Developer[] getPlacaBase() {
        return placaBase;
    }

    /**
     * 
     * @param placaBase
     */
    public void setPlacaBase(Developer[] placaBase) {
        this.placaBase = placaBase;
    }

    /**
     * @return CPUs
     */
    public Developer[] getCPUs() {
        return cpus;
    }

    /**
     * @param cpus
     */
    public void setCpus(Developer[] cpus) {
        this.cpus = cpus;
    }

    /**
     * @return ram
     */
    public Developer[] getRam() {
        return ram;
    }
    
    public void setRam(Developer[] ram) {
        this.ram = ram;
    }
    
    /**
     * @return productores de fuente de alimentacion
     */
    public Developer[] getFuenteAlimentacion() {
        return fuenteAlimentacion;
    }

    /**
     * @param fuenteAlimentacion
     */
    public void setFuenteAlimentacion(Developer[] fuenteAlimentacion) {
        this.fuenteAlimentacion = fuenteAlimentacion;
    }

    /**
     * @return the voiceActors
     */
    public Developer[] getTarjetasGraficas() {
        return tarjetasGraficas;
    }

    /**
     * @param tarjetasGraficas
     */
    public void setTarjetasGraficas(Developer[] tarjetasGraficas) {
        this.tarjetasGraficas = tarjetasGraficas;
    }

    /**
     * @return los ensambladores
     */
    public Developer[] getEnsambladores() {
        return ensambladores;
    }

    /**
     * @param ensambladores
     */
    public void setAssemblers(Developer[] ensambladores) {
        this.ensambladores = ensambladores;
    }

    /**
     * @return the projectManager
     */
    public int getProjectManager() {
        return projectManager;
    }

    /**
     * @param projectManager the projectManager to set
     */
    public void setProjectManager(int projectManager) {
        this.projectManager = projectManager;
    }

    /**
     * @return the director
     */
    public int getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(int director) {
        this.director = director;
    }

    /**
     * @return the drive
     */
    public static Drive getDrive() {
        return drive;
    }

    /**
     * @param aDrive the drive to set
     */
    public static void setDrive(Drive aDrive) {
        drive = aDrive;
    }

    /**
     * @return the mutex
     */
    public Semaphore getMutex() {
        return mutex;
    }

    /**
     * @param mutex the mutex to set
     */
    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    /**
     * @return the totalCost
     */
    public float getTotalCost() {
        return totalCost;
    }

    /**
     * @param totalCost the totalCost to set
     */
    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    public void increaseTotalCost(int cost) {
        this.totalCost += cost;
    }

    public void resetCost() {
        this.totalCost = 0;
    }

    /**
     * @return the earning
     */
    public float getEarning() {
        return earning;
    }

    /**
     * @param earning the earning to set
     */
    public void setEarning(float earning) {
        this.earning = earning;
    }

    /**
     * @return the profit
     */
    public float getProfit() {
        return profit;
    }

    /**
     * @param profit the profit to set
     */
    public void setProfit(float profit) {
        this.profit = profit;
    }

    /**
     * @return the actualEmployeesQuantity
     */
    public int getActualEmployeesQuantity() {
        return actualEmployeesQuantity;
    }

    /**
     * @param actualEmployeesQuantity the actualEmployeesQuantity to set
     */
    public void setActualEmployeesQuantity(int actualEmployeesQuantity) {
        this.actualEmployeesQuantity = actualEmployeesQuantity;
    }

    /**
     * @return the projectManagerInstance
     */
    public ProjectManager getProjectManagerInstance() {
        return projectManagerInstance;
    }

    /**
     * @param projectManagerInstance the projectManagerInstance to set
     */
    public void setProjectManagerInstance(ProjectManager projectManagerInstance) {
        this.projectManagerInstance = projectManagerInstance;
    }

    /**
     * @return the remainingDays
     */
    public int getRemainingDays() {
        return remainingDays;
    }

    public void decreaceRemainingDays() {
        this.remainingDays--;
    }

    public void resetRemainingDays() {
        this.remainingDays = App.getInstance().getDeadline();
    }

    public void setRemainingDays(int days) {
        this.remainingDays = days;
    }

    /**
     * @return the directorInstance
     */
    public Director getDirectorInstance() {
        return directorInstance;
    }

    /**
     * @param directorInstance the directorInstance to set
     */
    public void setDirectorInstance(Director directorInstance) {
        this.directorInstance = directorInstance;
    }

    /**
     * @return 
     */
    public int getNumComputadoras() {
        return numComputadoras;
    }

    /**
     * @param numComputadoras
     */
    public void setNumComputadoras(int numComputadoras) {
        this.numComputadoras = numComputadoras;
    }

    /**
     * @return 
     */
    public int getNumComputadorasGraf() {
        return numComputadorasGraf;
    }

    /**
     * @param numComputadorasGraf
     */
    public void setNumComputadorasGraf(int numComputadorasGraf) {
        this.numComputadorasGraf = numComputadorasGraf;
    }

    /**
     * @return 
     */
    public int getNumComputadorasNorm() {
        return numComputadorasNorm;
    }

    /**
     * @param numComputadorasNorm
     */
    public void setNumComputadorasNorm(int numComputadorasNorm) {
        this.numComputadorasNorm = numComputadorasNorm;
    }

    /**
     * @return the totalDays
     */
    public int getTotalDays() {
        return totalDays;
    }

    /**
     * @param totalDays the totalDays to set
     */
    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    /**
     * @return 
     */
    public int getActualNumComputadoras() {
        return actualNumComputadoras;
    }

    /**
     * @param actualNumComputadoras
     */
    public void setActualNumComputadoras(int actualNumComputadoras) {
        this.actualNumComputadoras = actualNumComputadoras;
    }

    /**
     * @return 
     */
    public int getActualNumComputadorasNorm() {
        return actualNumComputadorasNorm;
    }

    /**
     * @param actualNumComputadorasNorm
     */
    public void setActualNumComputadorasNorm(int actualNumComputadorasNorm) {
        this.actualNumComputadorasNorm = actualNumComputadorasNorm;
    }

    /**
     * @return 
     */
    public int getActualNumComputadorasGraf() {
        return actualNumComputadorasGraf;
    }

    /**
     * @param actualNumComputadorasGraf
     */
    public void setActualNumComputadorasGraf(int actualNumComputadorasGraf) {
        this.actualNumComputadorasGraf = actualNumComputadorasGraf;
    }

    /**
     * @return 
     */
    public int getLastNumComputadorasNorm() {
        return lastNumComputadorasNorm;
    }

    /**
     * @param lastNumComputadorasNorm
     */
    public void setLastNumComputadorasNorm(int lastNumComputadorasNorm) {
        this.lastNumComputadorasNorm = lastNumComputadorasNorm;
    }

    /**
     * @return 
     */
    public int getLastNumComputadorasGraf() {
        return lastNumComputadorasGraf;
    }

    /**
     * @param lastNumComputadorasGraf
     */
    public void setLastNumComputadorasGraf(int lastNumComputadorasGraf) {
        this.lastNumComputadorasGraf = lastNumComputadorasGraf;
    }

    /**
     * @return the lastOpsCost
     */
    public float getLastOpsCost() {
        return lastOpsCost;
    }

    /**
     * @param lastOpsCost the lastOpsCost to set
     */
    public void setLastOpsCost(float lastOpsCost) {
        this.lastOpsCost = lastOpsCost;
    }

    /**
     * @return the batchLastProfit
     */
    public float getBatchLastProfit() {
        return batchLastProfit;
    }

    /**
     * @param batchLastProfit the batchLastProfit to set
     */
    public void setBatchLastProfit(float batchLastProfit) {
        this.batchLastProfit = batchLastProfit;
    }

    /**
     * @return 
     */
    public int getTarjetasGraf() {
        return tarjetasGraf;
    }

    /**
     * @param tarjetasGraf
     */
    public void setTarjetasGraf(int tarjetasGraf) {
        this.tarjetasGraf = tarjetasGraf;
    }

    
}

/**
 *
 * @author Maria Daniela
 */
//public class Company {
//    private int numeroPlacasBases; 
//    private int numerosCpus; 
//    private int numeroMemoriaRam; 
//    private int numeroFuenteAlimentacion; 
//    private int numeroTarjetasGraficas; 
//    
//    private float Gastos; 
//    private float Ingresos; 
//    private float Beneficios; 
//    
//    private float computers; 
//    private float computerstarjetasgraficas; 
//    
//    private int PlacasBasesSalary; 
//    private int CpusSalary; 
//    private int MemoriaRamSalary; 
//    private int FuenteAliSalary;
//    private int TarjetasGraficasSalary; 
//    private int assemblerSalary;
//    
//    private int dayDuration; 
//    
//    private int PlacasBasesContent; 
//    private int CpusContent; 
//    private int MemoriaRamContent; 
//    private int FuenteAliContent; 
//    private int TarjetaGraficaContent; 
//    
//    private int placasbasesToWork; 
//    private int cpusToWork; 
//    private int memoriaramToWork;
//    private int fuentealiToWork; 
//    private int tarjetagraficaToWork; 
//    private int assemblerToWork; 
//    
//    private int placasbasesEnsamblar; 
//    private int cpusEnsamblar; 
//    private int memoriaramEnsamblar;
//    private int fuentealiEnsamblar; 
//    private int tarjetagraficaEnsamblar; 
//    private int assemblerEnsamblar; 
//    
//    private int compusMemoria; 
//    private Semaphore mutex; 
//    private int fixComitDay; 
//    private int comitDay; 
//    private Drive drive; 
//    
//    private int PMsalary; 
//    private int directorSalary; 
//    
//    private Developer ProductosBases; 
//    private Developer Cpus; 
//    private Developer MemoriaRam;
//    private Developer FuenteAli; 
//    private Developer TarjetaGrafica; 
//    private Assembler Assembler; 
//    
//    private int trabajadoresTotalesMax; 
//    private int trabajadoresTotales; 
//    private int guardarTrabajadoresTotales;
//    
//    
//    
//    
//}