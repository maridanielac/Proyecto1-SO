/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import Main.App;

/**
 *
 * @author soyis
 */
public class Txt {
     public static String read(File file) {
        String line;
        String data = "";

        try {
            if (!file.exists()) {
                file.createNewFile();

            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                while ((line = br.readLine()) != null) {
                    if (!(line.isEmpty())) {
                        data += line + "\n";
                    }
                }
                br.close();
            }
            return data;
        } catch (Exception e) {
        }
        return data;
    }

    public static int[] getGeneralInfo(String fileData) {
        int startIndex = fileData.indexOf("[General info]");
        if (startIndex == -1) {
            
            return null;
        }

        int endIndex = fileData.indexOf("[", startIndex + 1);
        if (endIndex == -1) {
            endIndex = fileData.length();
        }

        // Se extrae la sección de General info
        String cnSection = fileData.substring(startIndex, endIndex);

        // Se divide la sección en líneas
        String[] lines = cnSection.split("\n");

        // Se crea un array para almacenar los valores enteros de la configuración
        int[] generalInfo = new int[2];

        // Variable para recorrer el arreglo de líneas
        int valueIndex = 0;

        // Se Itera sobre las líneas, extrayendo los valores enteros
        for (String line : lines) {
            if (line.contains("=")) {
                // Divide la línea en la etiqueta y el valor
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    try {
                        // Se castea el valor entero y lo almacena en el array
                        generalInfo[valueIndex++] = Integer.parseInt(parts[1].trim());
                    } catch (NumberFormatException e) {
                        System.out.println("El valor no es entero");
                    }
                }
            }
        }
        return generalInfo;
    }

    public static int[] getCompanyValues(int company, String fileData) {
        int[] values = new int[9];
        int startIndex = 0;

        if (company == 0) {
            startIndex = fileData.indexOf("[Apple]");
        } else if (company == 1) {
            startIndex = fileData.indexOf("[HP]");
        }

        if (startIndex == -1) {
            // La sección no fue encontrada.
            return null;
        }

        // Se Encuentra el final de la sección de o el final del archivo
        int endIndex = fileData.indexOf("[", startIndex + 1);
        if (endIndex == -1) {
            endIndex = fileData.length();
        }

        // Se extrae la sección
        String cnSection = fileData.substring(startIndex, endIndex);

        // Se divide la sección en líneas
        String[] lines = cnSection.split("\n");

        // Variable para recorrer el arreglo de líneas
        int valueIndex = 0;

        // Se Itera sobre las líneas, extrayendo los valores enteros
        for (String line : lines) {
            if (line.contains("=")) {
                // Divide la línea en la etiqueta y el valor
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    try {
                        // Se castea el valor entero y lo almacena en el array
                        values[valueIndex++] = Integer.parseInt(parts[1].trim());
                    } catch (NumberFormatException e) {
                        System.out.println("El valor no es entero");
                    }
                }
            }
        }

        return values;
    }

    public static void write(File file) {

        String data = getActualInfo();
        try {
            java.io.FileWriter fileWriter = new java.io.FileWriter(file);
            fileWriter.write(data);
            fileWriter.close();
        } catch (Exception e) {

        }
    }

    public static String getActualInfo() {
        App app = App.getInstance();
        String data = "[General info]\n";
        int dayDuration = App.getDayDuration();
        int deadline = App.getDeadline();

        data += "DayDuration=" + dayDuration + "\n" + "Deadline=" + deadline + "\n\n";

        data += "[Apple]\n";
        Company apple = app.getApple();
        int placaBase = apple.countNonNull(apple.getPlacaBase());
        int cpus = apple.countNonNull(apple.getCPUs());
        int ram = apple.countNonNull(apple.getRam());
        int fuenteAlimentacion = apple.countNonNull(apple.getFuenteAlimentacion());
        int tarjetasGraficas = apple.countNonNull(apple.getTarjetasGraficas());
        int ensambladores = apple.countNonNull(apple.getEnsambladores());
        int projectManager = apple.getProjectManager();
        int director = apple.getDirector();
        int maxCapacity = apple.getMaxEmployeesQuantity();

        data += "PlacaBase=" + placaBase + "\n" + "CPUs=" + cpus + "\n" + "RAM="
                + ram + "\n" + "FuenteAlimentacion=" + fuenteAlimentacion + "\n" + "TarjetasGraficas="
                + tarjetasGraficas + "\n" + "Ensambladores=" + ensambladores + "\n" + "ProjectManager=" + projectManager
                + "\n" + "Director=" + director + "\n" + "MaxCapacity=" + maxCapacity + "\n\n";

        data += "[HP]\n";
        Company hp = app.getHP();
        placaBase = hp.countNonNull(hp.getPlacaBase());
        cpus = hp.countNonNull(hp.getCPUs());
        ram = hp.countNonNull(hp.getRam());
        fuenteAlimentacion = hp.countNonNull(hp.getFuenteAlimentacion());
        tarjetasGraficas = hp.countNonNull(hp.getTarjetasGraficas());
        ensambladores = hp.countNonNull(hp.getEnsambladores());
        projectManager = hp.getProjectManager();
        director = hp.getDirector();
        maxCapacity = hp.getMaxEmployeesQuantity();

        data += "PlacaBase=" + placaBase + "\n" + "CPUs=" + cpus + "\n" + "RAM="
                + ram + "\n" + "FuenteAlimentacion=" + fuenteAlimentacion + "\n" + "TarjetasGraficas="
                + tarjetasGraficas + "\n" + "Ensambladores=" + ensambladores + "\n" + "ProjectManager=" + projectManager
                + "\n" + "Director=" + director + "\n" + "MaxCapacity=" + maxCapacity + "\n\n";

        return data;
    }
}
