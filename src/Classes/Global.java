/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author soyis
 */
public class Global {
     public final static String[] companies = {
        "Apple",
        "HP"
    };

    public final static String[] workesType = {
        "Productor de placa base",
        "Productor de CPUs",
        "Productor de Memoria RAM",
        "Productor de Fuente de alimentación",
        "Productor de tarjetas gráficas",
        "Ensamblador",
        "Project Manager",
        "Director"
    };

    public final static int[] hourlyWages = {
        20,
        26,
        40,
        16,
        34,
        50,
        40,
        60
    };

    // El primer array es de Apple y el segundo de HP
    public final static int[][][] productionTimes = {
        {{1, 3}, {1, 3}, {2, 1}, {3, 1}, {1, 3}, {1, 2}},
        {{1, 2}, {1, 2}, {3, 1}, {3, 1}, {1, 3}, {1, 2}}
    };

    public final static int[][] computersComposition = {
        {2, 1, 4, 4, 2},
        {1, 1, 2, 4, 3}
    };

    public final static int[] frecuenciaTarjetasGraficas = {5, 2};

    public final static int[][] profitComputers = {
        {100000, 150000},
        {90000, 140000}
    };

}
