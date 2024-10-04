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

    public Drive(int maxplacasbases, int maxcpus, int maxmemoriaram, int maxfuentealim, int maxtarjgraficas, int computadoras, int computadorasytgraficas) {
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
    
    public void AggDrive (int rol, int content )
    
}
