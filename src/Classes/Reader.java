/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedReader;
import java.io.FileReader;


/**
 *
 * @author soyis
 */
public class Reader {
    private int segundosEnSimulacion;
    private int diasAntesDelDeadline1;
    private int numPlacasBase1;
    private int numCPUs1;
    private int numRam1;
    private int numFuenteAlimentacion1;
    private int numTarjetasGrafica1;
    private int numEnsambladores1;

    private int diasAntesDelDeadline2;
    private int numPlacasBase2;
    private int numCPUs2;
    private int numRam2;
    private int numFuenteAlimentacion2;
    private int numTarjetasGrafica2;
    private int numEnsambladores2;

    /**
     * Se lee el txt y se actualizan las empresas con los valores leidos
     * @param Company1 
     * @param Company2
     */
    public void ReadTxt(Company Company1, Company Company2) {
        String Path = "info.txt";
        try {
            FileReader lector = new FileReader(Path);
            BufferedReader bufferedReader = new BufferedReader(lector);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                // Dividir cada línea en clave y valor
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();

                    // Asignar valores a las variables correspondientes
                    switch (key) {
                        case "Segundos en la simulación":
                            setSegundosEnSimulacion(Integer.parseInt(value));
                            break;
                        case "Días antes del Deadline1":
                            setDiasAntesDelDeadline1(Integer.parseInt(value));
                            break;
                        case "PlacasBase1":
                            setNumPlacasBase1(Integer.parseInt(value));
                            break;
                        case "CPUs1":
                            setNumCPUs1(Integer.parseInt(value));
                            break;
                        case "Ram1":
                            setNumRam1(Integer.parseInt(value));
                            break;
                        case "FuenteAlimentacion1":
                            setNumFuenteAlimentacion1(Integer.parseInt(value));
                            break;
                        case "TarjetasGrafica1":
                            setNumTarjetasGrafica1(Integer.parseInt(value));
                            break;
                        case "Ensambladores1":
                            setNumEnsambladores1(Integer.parseInt(value));
                            break;
                        case "Días antes del Deadline2":
                            setDiasAntesDelDeadline2(Integer.parseInt(value));
                            break;
                        case "PlacasBase2":
                            setNumPlacasBase2(Integer.parseInt(value));
                            break;
                        case "CPUs2":
                            setNumCPUs2(Integer.parseInt(value));
                            break;
                        case "Ram2":
                            setNumRam2(Integer.parseInt(value));
                            break;
                        case "FuenteAlimentacion2":
                            setNumFuenteAlimentacion2(Integer.parseInt(value));
                            break;
                        case "TarjetasGrafica2":
                            setNumTarjetasGrafica2(Integer.parseInt(value));
                            break;
                        case "Ensambladores2":
                            setNumEnsambladores2(Integer.parseInt(value));
                            break;
                    }
                }
            }

            bufferedReader.close();
            company1.setNumeroPlacasBases(getNumPlacasBase1());
            company1.setNumerosCpus(getNumCPUs1());
            company1.setNumeroMemoriaRam(getNumRam1());
            company1.setNumeroFuenteAlimentacion(getNumFuenteAlimentacion1());
            company1.setNumeroTarjetasGraficas(getNumTarjetasGrafica1());
            company1.setNumeroAssemblers(getNumEnsambladores1());
            company1.setDayDuration(getSegundosEnSimulacion());
            company1.setTrabajadoresTotales(getDiasAntesDelDeadline1());

            // Actualizar company2
            company2.setNumeroPlacasBases(getNumPlacasBase2());
            company2.setNumerosCpus(getNumCPUs2());
            company2.setNumeroMemoriaRam(getNumRam2());
            company2.setNumeroFuenteAlimentacion(getNumFuenteAlimentacion2());
            company2.setNumeroTarjetasGraficas(getNumTarjetasGrafica2());
            company2.setNumeroAssemblers(getNumEnsambladores2());
            company2.setDayDuration(getSegundosEnSimulacion());
            company2.setTrabajadoresTotales(getDiasAntesDelDeadline2());
            //Aún Faltan ensambladores y Dias para entregar capitulo
        } catch (Exception err) {
            System.out.println(err);
        }
    }

    /**
     * @return the segundosEnSimulacion
     */
    public int getSegundosEnSimulacion() {
        return segundosEnSimulacion;
    }

    /**
     * @param segundosEnSimulacion the segundosEnSimulacion to set
     */
    public void setSegundosEnSimulacion(int segundosEnSimulacion) {
        this.segundosEnSimulacion = segundosEnSimulacion;
    }

    /**
     * @return the diasAntesDelDeadline1
     */
    public int getDiasAntesDelDeadline1() {
        return diasAntesDelDeadline1;
    }

    /**
     * @param diasAntesDelDeadline1 the diasAntesDelDeadline1 to set
     */
    public void setDiasAntesDelDeadline1(int diasAntesDelDeadline1) {
        this.diasAntesDelDeadline1 = diasAntesDelDeadline1;
    }

    /**
     * @return the numPlacasBase1
     */
    public int getNumPlacasBase1() {
        return numPlacasBase1;
    }

    /**
     * @param numPlacasBase1 the numPlacasBase1 to set
     */
    public void setNumPlacasBase1(int numPlacasBase1) {
        this.numPlacasBase1 = numPlacasBase1;
    }

    /**
     * @return the numCPUs1
     */
    public int getNumCPUs1() {
        return numCPUs1;
    }

    /**
     * @param numCPUs1 the numCPUs1 to set
     */
    public void setNumCPUs1(int numCPUs1) {
        this.numCPUs1 = numCPUs1;
    }

    /**
     * @return the numRam1
     */
    public int getNumRam1() {
        return numRam1;
    }

    /**
     * @param numRam1 the numRam1 to set
     */
    public void setNumRam1(int numRam1) {
        this.numRam1 = numRam1;
    }

    /**
     * @return the numFuenteAlimentacion1
     */
    public int getNumFuenteAlimentacion1() {
        return numFuenteAlimentacion1;
    }

    /**
     * @param numFuenteAlimentacion1 the numFuenteAlimentacion1 to set
     */
    public void setNumFuenteAlimentacion1(int numFuenteAlimentacion1) {
        this.numFuenteAlimentacion1 = numFuenteAlimentacion1;
    }

    /**
     * @return the numTarjetasGrafica1
     */
    public int getNumTarjetasGrafica1() {
        return numTarjetasGrafica1;
    }

    /**
     * @param numTarjetasGrafica1 the numTarjetasGrafica1 to set
     */
    public void setNumTarjetasGrafica1(int numTarjetasGrafica1) {
        this.numTarjetasGrafica1 = numTarjetasGrafica1;
    }

    /**
     * @return the numEnsambladores1
     */
    public int getNumEnsambladores1() {
        return numEnsambladores1;
    }

    /**
     * @param numEnsambladores1 the numEnsambladores1 to set
     */
    public void setNumEnsambladores1(int numEnsambladores1) {
        this.numEnsambladores1 = numEnsambladores1;
    }

    /**
     * @return the diasAntesDelDeadline2
     */
    public int getDiasAntesDelDeadline2() {
        return diasAntesDelDeadline2;
    }

    /**
     * @param diasAntesDelDeadline2 the diasAntesDelDeadline2 to set
     */
    public void setDiasAntesDelDeadline2(int diasAntesDelDeadline2) {
        this.diasAntesDelDeadline2 = diasAntesDelDeadline2;
    }

    /**
     * @return the numPlacasBase2
     */
    public int getNumPlacasBase2() {
        return numPlacasBase2;
    }

    /**
     * @param numPlacasBase2 the numPlacasBase2 to set
     */
    public void setNumPlacasBase2(int numPlacasBase2) {
        this.numPlacasBase2 = numPlacasBase2;
    }

    /**
     * @return the numCPUs2
     */
    public int getNumCPUs2() {
        return numCPUs2;
    }

    /**
     * @param numCPUs2 the numCPUs2 to set
     */
    public void setNumCPUs2(int numCPUs2) {
        this.numCPUs2 = numCPUs2;
    }

    /**
     * @return the numRam2
     */
    public int getNumRam2() {
        return numRam2;
    }

    /**
     * @param numRam2 the numRam2 to set
     */
    public void setNumRam2(int numRam2) {
        this.numRam2 = numRam2;
    }

    /**
     * @return the numFuenteAlimentacion2
     */
    public int getNumFuenteAlimentacion2() {
        return numFuenteAlimentacion2;
    }

    /**
     * @param numFuenteAlimentacion2 the numFuenteAlimentacion2 to set
     */
    public void setNumFuenteAlimentacion2(int numFuenteAlimentacion2) {
        this.numFuenteAlimentacion2 = numFuenteAlimentacion2;
    }

    /**
     * @return the numTarjetasGrafica2
     */
    public int getNumTarjetasGrafica2() {
        return numTarjetasGrafica2;
    }

    /**
     * @param numTarjetasGrafica2 the numTarjetasGrafica2 to set
     */
    public void setNumTarjetasGrafica2(int numTarjetasGrafica2) {
        this.numTarjetasGrafica2 = numTarjetasGrafica2;
    }

    /**
     * @return the numEnsambladores2
     */
    public int getNumEnsambladores2() {
        return numEnsambladores2;
    }

    /**
     * @param numEnsambladores2 the numEnsambladores2 to set
     */
    public void setNumEnsambladores2(int numEnsambladores2) {
        this.numEnsambladores2 = numEnsambladores2;
    }
}
