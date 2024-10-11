/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author soyis
 */
public class Writer {
    private int segundosEnSimulacion; // Tiempo de la simulación a guardar

// Valores para la primera empresa
private int diasAntesDelDeadline1;
private int numPlacasBase1;
private int numCPUs1;
private int numRam1;
private int numFuenteAlimentacion1;
private int numTarjetasGrafica1;
private int numEnsambladores1;

// Valores para la segunda empresa
private int diasAntesDelDeadline2;
private int numPlacasBase2;
private int numCPUs2;
private int numRam2;
private int numFuenteAlimentacion2;
private int numTarjetasGrafica2;
private int numEnsambladores2;

/**
 * Constructor
 * @param segundosEnSimulacion
 * @param diasAntesDelDeadline1
 * @param numPlacasBase1
 * @param numCPUs1
 * @param numRam1
 * @param numFuenteAlimentacion1
 * @param numTarjetasGrafica1
 * @param numEnsambladores1
 * @param diasAntesDelDeadline2
 * @param numPlacasBase2
 * @param numCPUs2
 * @param numRam2
 * @param numFuenteAlimentacion2
 * @param numTarjetasGrafica2
 * @param numEnsambladores2
 */
public Writer(int segundosEnSimulacion, int diasAntesDelDeadline1, int numPlacasBase1, int numCPUs1, int numRam1, int numFuenteAlimentacion1, int numTarjetasGrafica1, int numEnsambladores1, int diasAntesDelDeadline2, int numPlacasBase2, int numCPUs2, int numRam2, int numFuenteAlimentacion2, int numTarjetasGrafica2, int numEnsambladores2) {
    this.segundosEnSimulacion = segundosEnSimulacion;
    this.diasAntesDelDeadline1 = diasAntesDelDeadline1;
    this.numPlacasBase1 = numPlacasBase1;
    this.numCPUs1 = numCPUs1;
    this.numRam1 = numRam1;
    this.numFuenteAlimentacion1 = numFuenteAlimentacion1;
    this.numTarjetasGrafica1 = numTarjetasGrafica1;
    this.numEnsambladores1 = numEnsambladores1;
    this.diasAntesDelDeadline2 = diasAntesDelDeadline2;
    this.numPlacasBase2 = numPlacasBase2;
    this.numCPUs2 = numCPUs2;
    this.numRam2 = numRam2;
    this.numFuenteAlimentacion2 = numFuenteAlimentacion2;
    this.numTarjetasGrafica2 = numTarjetasGrafica2;
    this.numEnsambladores2 = numEnsambladores2;
}

/**
 * Se guardan los valores extraídos en el txt
 */
public void guardar() {
    try {
        FileWriter fw = new FileWriter("archivo.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.print("Segundos en la simulación:" + segundosEnSimulacion + "\n");

        pw.print("Días antes del Deadline1:" + diasAntesDelDeadline1 + "\n");
        pw.print("PlacasBase1:" + numPlacasBase1 + "\n");
        pw.print("CPUs1:" + numCPUs1 + "\n");
        pw.print("Ram1:" + numRam1 + "\n");
        pw.print("FuenteAlimentacion1:" + numFuenteAlimentacion1 + "\n");
        pw.print("TarjetasGrafica1:" + numTarjetasGrafica1 + "\n");
        pw.print("Ensambladores1:" + numEnsambladores1 + "\n");

        pw.print("Días antes del Deadline2:" + diasAntesDelDeadline2 + "\n");
        pw.print("PlacasBase2:" + numPlacasBase2 + "\n");
        pw.print("CPUs2:" + numCPUs2 + "\n");
        pw.print("Ram2:" + numRam2 + "\n");
        pw.print("FuenteAlimentacion2:" + numFuenteAlimentacion2 + "\n");
        pw.print("TarjetasGrafica2:" + numTarjetasGrafica2 + "\n");
        pw.print("Ensambladores2:" + numEnsambladores2 + "\n");

        pw.close();

    } catch (IOException ex) {
        Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
    }
}

/**
 *
 * @return
 */
public int getSegundosEnSimulacion() {
    return segundosEnSimulacion;
}

/**
 *
 * @param segundosEnSimulacion
 */
public void setSegundosEnSimulacion(int segundosEnSimulacion) {
    this.segundosEnSimulacion = segundosEnSimulacion;
}

/**
 *
 * @return
 */
public int getDiasAntesDelDeadline1() {
    return diasAntesDelDeadline1;
}

/**
 *
 * @param diasAntesDelDeadline1
 */
public void setDiasAntesDelDeadline1(int diasAntesDelDeadline1) {
    this.diasAntesDelDeadline1 = diasAntesDelDeadline1;
}

/**
 *
 * @return
 */
public int getNumPlacasBase1() {
    return numPlacasBase1;
}

/**
 *
 * @param numPlacasBase1
 */
public void setNumPlacasBase1(int numPlacasBase1) {
    this.numPlacasBase1 = numPlacasBase1;
}

/**
 *
 * @return
 */
public int getNumCPUs1() {
    return numCPUs1;
}

/**
 *
 * @param numCPUs1
 */
public void setNumCPUs1(int numCPUs1) {
    this.numCPUs1 = numCPUs1;
}

/**
 *
 * @return
 */
public int getNumRam1() {
    return numRam1;
}

/**
 *
 * @param numRam1
 */
public void setNumRam1(int numRam1) {
    this.numRam1 = numRam1;
}

/**
 *
 * @return
 */
public int getNumFuenteAlimentacion1() {
    return numFuenteAlimentacion1;
}

/**
 *
 * @param numFuenteAlimentacion1
 */
public void setNumFuenteAlimentacion1(int numFuenteAlimentacion1) {
    this.numFuenteAlimentacion1 = numFuenteAlimentacion1;
}

/**
 *
 * @return
 */
public int getNumTarjetasGrafica1() {
    return numTarjetasGrafica1;
}

/**
 *
 * @param numTarjetasGrafica1
 */
public void setNumTarjetasGrafica1(int numTarjetasGrafica1) {
    this.numTarjetasGrafica1 = numTarjetasGrafica1;
}

/**
 *
 * @return
 */
public int getNumEnsambladores1() {
    return numEnsambladores1;
}

/**
 *
 * @param numEnsambladores1
 */
public void setNumEnsambladores1(int numEnsambladores1) {
    this.numEnsambladores1 = numEnsambladores1;
}

/**
 *
 * @return
 */
public int getDiasAntesDelDeadline2() {
    return diasAntesDelDeadline2;
}

/**
 *
 * @param diasAntesDelDeadline2
 */
public void setDiasAntesDelDeadline2(int diasAntesDelDeadline2) {
    this.diasAntesDelDeadline2 = diasAntesDelDeadline2;
}

/**
 *
 * @return
 */
public int getNumPlacasBase2() {
    return numPlacasBase2;
}

/**
 *
 * @param numPlacasBase2
 */
public void setNumPlacasBase2(int numPlacasBase2) {
    this.numPlacasBase2 = numPlacasBase2;
}

/**
 *
 * @return
 */
public int getNumCPUs2() {
    return numCPUs2;
}

/**
 *
 * @param numCPUs2
 */
public void setNumCPUs2(int numCPUs2) {
    this.numCPUs2 = numCPUs2;
}

/**
 *
 * @return
 */
public int getNumRam2() {
    return numRam2;
}

/**
 *
 * @param numRam2
 */
public void setNumRam2(int numRam2) {
    this.numRam2 = numRam2;
}

/**
 *
 * @return
 */
public int getNumFuenteAlimentacion2() {
    return numFuenteAlimentacion2;
}

/**
 *
 * @param numFuenteAlimentacion2
 */
public void setNumFuenteAlimentacion2(int numFuenteAlimentacion2) {
    this.numFuenteAlimentacion2 = numFuenteAlimentacion2;
}

/**
 *
 * @return
 */
public int getNumTarjetasGrafica2() {
    return numTarjetasGrafica2;
}

/**
 *
 * @param numTarjetasGrafica2
 */
public void setNumTarjetasGrafica2(int numTarjetasGrafica2) {
    this.numTarjetasGrafica2 = numTarjetasGrafica2;
}

/**
 *
 * @return
 */
public int getNumEnsambladores2() {
    return numEnsambladores2;
}

/**
 *
 * @param numEnsambladores2
 */
public void setNumEnsambladores2(int numEnsambladores2) {
    this.numEnsambladores2 = numEnsambladores2;
}

}
