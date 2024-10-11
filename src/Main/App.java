/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.io.File;
import Classes.Txt;
//import GUI.Classes.ChartManager;

import Classes.Company;

/**
 *
 * @author soyis
 */
public class App {
    // Txt info
    private static String selectedPath = "test//info.txt";
    private static File selectedFile = new File(selectedPath);
    private static Txt txt = new Txt();

    // General info
    private static int dayDuration;
    private static int deadline;

    // General variables
    private Company apple;
    private Company hp;
//    private static ChartManager chartManager;


    private static App app;

    /**
     * Devuelve una instancia única de la aplicación.
     *
     * @return La instancia única de la aplicación.
     */
    public static synchronized App getInstance() {
        if (getApp() == null) {
            setApp(new App());
        }
        return getApp();
    }

    public void start() {
        
        Funciones.loadParams();
        
        // Inicia la simulacion
        getApple().start();
        getHP().start();
//        chartManager = new ChartManager();


//        Home home = new Home();
//        home.setVisible(true);
    }

    /**
     * @return the selectedPath
     */
    public static String getSelectedPath() {
        return selectedPath;
    }

    /**
     * @param aSelectedPath the selectedPath to set
     */
    public static void setSelectedPath(String aSelectedPath) {
        selectedPath = aSelectedPath;
    }

    /**
     * @return the selectedFile
     */
    public static File getSelectedFile() {
        return selectedFile;
    }

    /**
     * @param aSelectedFile the selectedFile to set
     */
    public static void setSelectedFile(File aSelectedFile) {
        selectedFile = aSelectedFile;
    }

    /**
     * @return txt
     */
    public static Txt getFileFunctions() {
        return txt;
    }

    /**
     * @param aFileFunctions the fileFunctions to set
     */
    public static void setFileFunctions(Txt aFileFunctions) {
        txt = aFileFunctions;
    }

    /**
     * @return the dayDuration
     */
    public static int getDayDuration() {
        return dayDuration;
    }

    /**
     * @param aDayDuration the dayDuration to set
     */
    public static void setDayDuration(int aDayDuration) {
        dayDuration = aDayDuration;
    }

    /**
     * @return the deadline
     */
    public static int getDeadline() {
        return deadline;
    }

    /**
     * @param aDeadline the deadline to set
     */
    public static void setDeadline(int aDeadline) {
        deadline = aDeadline;
    }

    /**
     * @return hp
     */
    public Company getHP() {
        return hp;
    }

    /**
     * @param hp
     */
    public void setHP(Company hp) {
        this.hp = hp;
    }

    /**
     * @return apple
     */
    public Company getApple() {
        return apple;
    }

    /**
     * @param apple
     */
    public void setApple(Company apple) {
        this.apple = apple;
    }

    /**
     * @return the app
     */
    public static App getApp() {
        return app;
    }

    /**
     * @param aApp the app to set
     */
    public static void setApp(App aApp) {
        app = aApp;
    }

//     public static ChartManager getChartManager() {
//        return chartManager;
//    }
  
}
