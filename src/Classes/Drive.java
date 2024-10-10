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
    private int placasbases;
    private int cpus; 
    private int memoriaram; 
    private int fuentealim;
    private int tarjgraficas; 
    
    private int maxplacasbases;
    private int maxcpus; 
    private int maxmemoriaram; 
    private int maxfuentealim;
    private int maxtarjgraficas; 
    
    private int computadoras; 
    private int computadorasytgraficas; 

    public Drive(int maxplacasbases, int maxcpus, int maxmemoriaram, int maxfuentealim, int maxtarjgraficas) {
        this.placasbases = 0;
        this.cpus = 0;
        this.memoriaram = 0;
        this.fuentealim = 0;
        this.tarjgraficas = 0;
        this.maxplacasbases = maxplacasbases;
        this.maxcpus = maxcpus;
        this.maxmemoriaram = maxmemoriaram;
        this.maxfuentealim = maxfuentealim;
        this.maxtarjgraficas = maxtarjgraficas;
        this.computadoras = computadoras;
        this.computadorasytgraficas = computadorasytgraficas;
    }
    
    public void Limites(){
    }
    
    public void AggDrive (int rol, int content ){
        switch (rol){
            case 0: { if (getPlacasbases()+content > getMaxplacasbases()){
                setPlacasbases(getPlacasbases());
            }else {
                setPlacasbases(getPlacasbases()+content);
            }}
            case 1: { if (getCpus()+content > getMaxcpus()){
                setCpus(getCpus());
            }else {
                setCpus(getCpus()+content);
            }}
            case 2: { if (getMemoriaram()+content > getMaxmemoriaram()){
                setMemoriaram(getMemoriaram());
            }else {
                setMemoriaram(getMemoriaram()+content);
            }}
            case 3: { if (getFuentealim()+content > getMaxfuentealim()){
                setFuentealim(getFuentealim());
            }else {
                setFuentealim(getFuentealim()+content);
            }}
            case 4: { if (getTarjgraficas()+content > getMaxtarjgraficas()){
                setTarjgraficas(getTarjgraficas());
            }else {
                setTarjgraficas(getTarjgraficas()+content);
            }}
            
            default:
                System.out.println("No existen mas empleados");
        }
    }

    public int getPlacasbases() {
        return placasbases;
    }

    public void setPlacasbases(int placasbases) {
        this.placasbases = placasbases;
    }

    public int getCpus() {
        return cpus;
    }

    public void setCpus(int cpus) {
        this.cpus = cpus;
    }

    public int getMemoriaram() {
        return memoriaram;
    }

    public void setMemoriaram(int memoriaram) {
        this.memoriaram = memoriaram;
    }

    public int getFuentealim() {
        return fuentealim;
    }

    public void setFuentealim(int fuentealim) {
        this.fuentealim = fuentealim;
    }

    public int getTarjgraficas() {
        return tarjgraficas;
    }

    public void setTarjgraficas(int tarjgraficas) {
        this.tarjgraficas = tarjgraficas;
    }

    public int getMaxplacasbases() {
        return maxplacasbases;
    }

    public void setMaxplacasbases(int maxplacasbases) {
        this.maxplacasbases = maxplacasbases;
    }

    public int getMaxcpus() {
        return maxcpus;
    }

    public void setMaxcpus(int maxcpus) {
        this.maxcpus = maxcpus;
    }

    public int getMaxmemoriaram() {
        return maxmemoriaram;
    }

    public void setMaxmemoriaram(int maxmemoriaram) {
        this.maxmemoriaram = maxmemoriaram;
    }

    public int getMaxfuentealim() {
        return maxfuentealim;
    }

    public void setMaxfuentealim(int maxfuentealim) {
        this.maxfuentealim = maxfuentealim;
    }

    public int getMaxtarjgraficas() {
        return maxtarjgraficas;
    }

    public void setMaxtarjgraficas(int maxtarjgraficas) {
        this.maxtarjgraficas = maxtarjgraficas;
    }

    public int getComputadoras() {
        return computadoras;
    }

    public void setComputadoras(int computadoras) {
        this.computadoras = computadoras;
    }

    public int getComputadorasytgraficas() {
        return computadorasytgraficas;
    }

    public void setComputadorasytgraficas(int computadorasytgraficas) {
        this.computadorasytgraficas = computadorasytgraficas;
    }
    
    
    
}
