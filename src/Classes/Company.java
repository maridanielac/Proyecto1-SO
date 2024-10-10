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
public class Company {
    private int numeroPlacasBases; 
    private int numerosCpus; 
    private int numeroMemoriaRam; 
    private int numeroFuenteAlimentacion; 
    private int numeroTarjetasGraficas; 
    
    private float Gastos; 
    private float Ingresos; 
    private float Beneficios; 
    
    private float computers; 
    private float computerstarjetasgraficas; 
    
    private int PlacasBasesSalary; 
    private int CpusSalary; 
    private int MemoriaRamSalary; 
    private int FuenteAliSalary;
    private int TarjetasGraficasSalary; 
    private int assemblerSalary;
    
    private int dayDuration; 
    
    private int PlacasBasesContent; 
    private int CpusContent; 
    private int MemoriaRamContent; 
    private int FuenteAliContent; 
    private int TarjetaGraficaContent; 
    
    private int placasbasesToWork; 
    private int cpusToWork; 
    private int memoriaramToWork;
    private int fuentealiToWork; 
    private int tarjetagraficaToWork; 
    private int assemblerToWork; 
    
    private int placasbasesEnsamblar; 
    private int cpusEnsamblar; 
    private int memoriaramEnsamblar;
    private int fuentealiEnsamblar; 
    private int tarjetagraficaEnsamblar; 
    private int assemblerEnsamblar; 
    
    private int compusMemoria; 
    private Semaphore mutex; 
    private int fixComitDay; 
    private int comitDay; 
    private Drive drive; 
    
    private int PMsalary; 
    private int directorSalary; 
    
    private Developer ProductosBases; 
    private Developer Cpus; 
    private Developer MemoriaRam;
    private Developer FuenteAli; 
    private Developer TarjetaGrafica; 
    private Assembler Assembler; 
    
    private int trabajadoresTotalesMax; 
    private int trabajadoresTotales; 
    private int guardarTrabajadoresTotales;

    public Company(int numeroPlacasBases, int numerosCpus, int numeroMemoriaRam, int numeroFuenteAlimentacion, int numeroTarjetasGraficas, float Gastos, float Ingresos, float Beneficios, float computers, float computerstarjetasgraficas, int PlacasBasesSalary, int CpusSalary, int MemoriaRamSalary, int FuenteAliSalary, int TarjetasGraficasSalary, int assemblerSalary, int dayDuration, int PlacasBasesContent, int CpusContent, int MemoriaRamContent, int FuenteAliContent, int TarjetaGraficaContent, int placasbasesToWork, int cpusToWork, int memoriaramToWork, int fuentealiToWork, int tarjetagraficaToWork, int assemblerToWork, int placasbasesEnsamblar, int cpusEnsamblar, int memoriaramEnsamblar, int fuentealiEnsamblar, int tarjetagraficaEnsamblar, int assemblerEnsamblar, int compusMemoria, Semaphore mutex, int fixComitDay, int comitDay, Drive drive, int PMsalary, int directorSalary, Developer ProductosBases, Developer Cpus, Developer MemoriaRam, Developer FuenteAli, Developer TarjetaGrafica, Assembler Assembler, int trabajadoresTotalesMax, int trabajadoresTotales, int guardarTrabajadoresTotales) {
        this.numeroPlacasBases = numeroPlacasBases;
        this.numerosCpus = numerosCpus;
        this.numeroMemoriaRam = numeroMemoriaRam;
        this.numeroFuenteAlimentacion = numeroFuenteAlimentacion;
        this.numeroTarjetasGraficas = numeroTarjetasGraficas;
        this.Gastos = Gastos;
        this.Ingresos = Ingresos;
        this.Beneficios = Beneficios;
        this.computers = computers;
        this.computerstarjetasgraficas = computerstarjetasgraficas;
        this.PlacasBasesSalary = PlacasBasesSalary;
        this.CpusSalary = CpusSalary;
        this.MemoriaRamSalary = MemoriaRamSalary;
        this.FuenteAliSalary = FuenteAliSalary;
        this.TarjetasGraficasSalary = TarjetasGraficasSalary;
        this.assemblerSalary = assemblerSalary;
        this.dayDuration = dayDuration;
        this.PlacasBasesContent = PlacasBasesContent;
        this.CpusContent = CpusContent;
        this.MemoriaRamContent = MemoriaRamContent;
        this.FuenteAliContent = FuenteAliContent;
        this.TarjetaGraficaContent = TarjetaGraficaContent;
        this.placasbasesToWork = placasbasesToWork;
        this.cpusToWork = cpusToWork;
        this.memoriaramToWork = memoriaramToWork;
        this.fuentealiToWork = fuentealiToWork;
        this.tarjetagraficaToWork = tarjetagraficaToWork;
        this.assemblerToWork = assemblerToWork;
        this.placasbasesEnsamblar = placasbasesEnsamblar;
        this.cpusEnsamblar = cpusEnsamblar;
        this.memoriaramEnsamblar = memoriaramEnsamblar;
        this.fuentealiEnsamblar = fuentealiEnsamblar;
        this.tarjetagraficaEnsamblar = tarjetagraficaEnsamblar;
        this.assemblerEnsamblar = assemblerEnsamblar;
        this.compusMemoria = compusMemoria;
        this.mutex = new Semaphore(1);
        this.fixComitDay = fixComitDay;
        this.comitDay = comitDay;
        this.drive = new Drive(25,25,25,25,25,40,40);
        this.PMsalary = PMsalary;
        this.directorSalary = directorSalary;
        this.ProductosBases = ProductosBases;
        this.Cpus = Cpus;
        this.MemoriaRam = MemoriaRam;
        this.FuenteAli = FuenteAli;
        this.TarjetaGrafica = TarjetaGrafica;
        this.Assembler = Assembler;
        this.trabajadoresTotalesMax = trabajadoresTotalesMax;
        this.trabajadoresTotales = trabajadoresTotales;
        this.guardarTrabajadoresTotales = guardarTrabajadoresTotales;
    }
    
    public void StartWorking(){
        actTotalTrabajadores(); 
    }
    
    public void actTotalTrabajadores(){
        this.trabajadoresTotales = ProductosBases.getCantDeveloper() + Cpus.getCantDeveloper() + MemoriaRam.getCantDeveloper()+FuenteAli.getCantDeveloper() + TarjetaGrafica.getCantDeveloper()+Assembler.getAssemblerquantity();    
    }

    public int getNumeroPlacasBases() {
        return numeroPlacasBases;
    }

    public void setNumeroPlacasBases(int numeroPlacasBases) {
        this.numeroPlacasBases = numeroPlacasBases;
    }

    public int getNumerosCpus() {
        return numerosCpus;
    }

    public void setNumerosCpus(int numerosCpus) {
        this.numerosCpus = numerosCpus;
    }

    public int getNumeroMemoriaRam() {
        return numeroMemoriaRam;
    }

    public void setNumeroMemoriaRam(int numeroMemoriaRam) {
        this.numeroMemoriaRam = numeroMemoriaRam;
    }

    public int getNumeroFuenteAlimentacion() {
        return numeroFuenteAlimentacion;
    }

    public void setNumeroFuenteAlimentacion(int numeroFuenteAlimentacion) {
        this.numeroFuenteAlimentacion = numeroFuenteAlimentacion;
    }

    public int getNumeroTarjetasGraficas() {
        return numeroTarjetasGraficas;
    }

    public void setNumeroTarjetasGraficas(int numeroTarjetasGraficas) {
        this.numeroTarjetasGraficas = numeroTarjetasGraficas;
    }

    public float getGastos() {
        return Gastos;
    }

    public void setGastos(float Gastos) {
        this.Gastos = Gastos;
    }

    public float getIngresos() {
        return Ingresos;
    }

    public void setIngresos(float Ingresos) {
        this.Ingresos = Ingresos;
    }

    public float getBeneficios() {
        return Beneficios;
    }

    public void setBeneficios(float Beneficios) {
        this.Beneficios = Beneficios;
    }

    public float getComputers() {
        return computers;
    }

    public void setComputers(float computers) {
        this.computers = computers;
    }

    public float getComputerstarjetasgraficas() {
        return computerstarjetasgraficas;
    }

    public void setComputerstarjetasgraficas(float computerstarjetasgraficas) {
        this.computerstarjetasgraficas = computerstarjetasgraficas;
    }

    public int getPlacasBasesSalary() {
        return PlacasBasesSalary;
    }

    public void setPlacasBasesSalary(int PlacasBasesSalary) {
        this.PlacasBasesSalary = PlacasBasesSalary;
    }

    public int getCpusSalary() {
        return CpusSalary;
    }

    public void setCpusSalary(int CpusSalary) {
        this.CpusSalary = CpusSalary;
    }

    public int getMemoriaRamSalary() {
        return MemoriaRamSalary;
    }

    public void setMemoriaRamSalary(int MemoriaRamSalary) {
        this.MemoriaRamSalary = MemoriaRamSalary;
    }

    public int getFuenteAliSalary() {
        return FuenteAliSalary;
    }

    public void setFuenteAliSalary(int FuenteAliSalary) {
        this.FuenteAliSalary = FuenteAliSalary;
    }

    public int getTarjetasGraficasSalary() {
        return TarjetasGraficasSalary;
    }

    public void setTarjetasGraficasSalary(int TarjetasGraficasSalary) {
        this.TarjetasGraficasSalary = TarjetasGraficasSalary;
    }

    public int getAssemblerSalary() {
        return assemblerSalary;
    }

    public void setAssemblerSalary(int assemblerSalary) {
        this.assemblerSalary = assemblerSalary;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public int getPlacasBasesContent() {
        return PlacasBasesContent;
    }

    public void setPlacasBasesContent(int PlacasBasesContent) {
        this.PlacasBasesContent = PlacasBasesContent;
    }

    public int getCpusContent() {
        return CpusContent;
    }

    public void setCpusContent(int CpusContent) {
        this.CpusContent = CpusContent;
    }

    public int getMemoriaRamContent() {
        return MemoriaRamContent;
    }

    public void setMemoriaRamContent(int MemoriaRamContent) {
        this.MemoriaRamContent = MemoriaRamContent;
    }

    public int getFuenteAliContent() {
        return FuenteAliContent;
    }

    public void setFuenteAliContent(int FuenteAliContent) {
        this.FuenteAliContent = FuenteAliContent;
    }

    public int getTarjetaGraficaContent() {
        return TarjetaGraficaContent;
    }

    public void setTarjetaGraficaContent(int TarjetaGraficaContent) {
        this.TarjetaGraficaContent = TarjetaGraficaContent;
    }

    public int getPlacasbasesToWork() {
        return placasbasesToWork;
    }

    public void setPlacasbasesToWork(int placasbasesToWork) {
        this.placasbasesToWork = placasbasesToWork;
    }

    public int getCpusToWork() {
        return cpusToWork;
    }

    public void setCpusToWork(int cpusToWork) {
        this.cpusToWork = cpusToWork;
    }

    public int getMemoriaramToWork() {
        return memoriaramToWork;
    }

    public void setMemoriaramToWork(int memoriaramToWork) {
        this.memoriaramToWork = memoriaramToWork;
    }

    public int getFuentealiToWork() {
        return fuentealiToWork;
    }

    public void setFuentealiToWork(int fuentealiToWork) {
        this.fuentealiToWork = fuentealiToWork;
    }

    public int getTarjetagraficaToWork() {
        return tarjetagraficaToWork;
    }

    public void setTarjetagraficaToWork(int tarjetagraficaToWork) {
        this.tarjetagraficaToWork = tarjetagraficaToWork;
    }

    public int getAssemblerToWork() {
        return assemblerToWork;
    }

    public void setAssemblerToWork(int assemblerToWork) {
        this.assemblerToWork = assemblerToWork;
    }

    public int getPlacasbasesEnsamblar() {
        return placasbasesEnsamblar;
    }

    public void setPlacasbasesEnsamblar(int placasbasesEnsamblar) {
        this.placasbasesEnsamblar = placasbasesEnsamblar;
    }

    public int getCpusEnsamblar() {
        return cpusEnsamblar;
    }

    public void setCpusEnsamblar(int cpusEnsamblar) {
        this.cpusEnsamblar = cpusEnsamblar;
    }

    public int getMemoriaramEnsamblar() {
        return memoriaramEnsamblar;
    }

    public void setMemoriaramEnsamblar(int memoriaramEnsamblar) {
        this.memoriaramEnsamblar = memoriaramEnsamblar;
    }

    public int getFuentealiEnsamblar() {
        return fuentealiEnsamblar;
    }

    public void setFuentealiEnsamblar(int fuentealiEnsamblar) {
        this.fuentealiEnsamblar = fuentealiEnsamblar;
    }

    public int getTarjetagraficaEnsamblar() {
        return tarjetagraficaEnsamblar;
    }

    public void setTarjetagraficaEnsamblar(int tarjetagraficaEnsamblar) {
        this.tarjetagraficaEnsamblar = tarjetagraficaEnsamblar;
    }

    public int getAssemblerEnsamblar() {
        return assemblerEnsamblar;
    }

    public void setAssemblerEnsamblar(int assemblerEnsamblar) {
        this.assemblerEnsamblar = assemblerEnsamblar;
    }

    public int getCompusMemoria() {
        return compusMemoria;
    }

    public void setCompusMemoria(int compusMemoria) {
        this.compusMemoria = compusMemoria;
    }

    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    public int getFixComitDay() {
        return fixComitDay;
    }

    public void setFixComitDay(int fixComitDay) {
        this.fixComitDay = fixComitDay;
    }

    public int getComitDay() {
        return comitDay;
    }

    public void setComitDay(int comitDay) {
        this.comitDay = comitDay;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public int getPMsalary() {
        return PMsalary;
    }

    public void setPMsalary(int PMsalary) {
        this.PMsalary = PMsalary;
    }

    public int getDirectorSalary() {
        return directorSalary;
    }

    public void setDirectorSalary(int directorSalary) {
        this.directorSalary = directorSalary;
    }

    public Developer getProductosBases() {
        return ProductosBases;
    }

    public void setProductosBases(Developer ProductosBases) {
        this.ProductosBases = ProductosBases;
    }

    public Developer getCpus() {
        return Cpus;
    }

    public void setCpus(Developer Cpus) {
        this.Cpus = Cpus;
    }

    public Developer getMemoriaRam() {
        return MemoriaRam;
    }

    public void setMemoriaRam(Developer MemoriaRam) {
        this.MemoriaRam = MemoriaRam;
    }

    public Developer getFuenteAli() {
        return FuenteAli;
    }

    public void setFuenteAli(Developer FuenteAli) {
        this.FuenteAli = FuenteAli;
    }

    public Developer getTarjetaGrafica() {
        return TarjetaGrafica;
    }

    public void setTarjetaGrafica(Developer TarjetaGrafica) {
        this.TarjetaGrafica = TarjetaGrafica;
    }

    public Assembler getAssembler() {
        return Assembler;
    }

    public void setAssembler(Assembler Assembler) {
        this.Assembler = Assembler;
    }

    public int getTrabajadoresTotalesMax() {
        return trabajadoresTotalesMax;
    }

    public void setTrabajadoresTotalesMax(int trabajadoresTotalesMax) {
        this.trabajadoresTotalesMax = trabajadoresTotalesMax;
    }

    public int getTrabajadoresTotales() {
        return trabajadoresTotales;
    }

    public void setTrabajadoresTotales(int trabajadoresTotales) {
        this.trabajadoresTotales = trabajadoresTotales;
    }

    public int getGuardarTrabajadoresTotales() {
        return guardarTrabajadoresTotales;
    }

    public void setGuardarTrabajadoresTotales(int guardarTrabajadoresTotales) {
        this.guardarTrabajadoresTotales = guardarTrabajadoresTotales;
    }

    
    
    
    
    
}
