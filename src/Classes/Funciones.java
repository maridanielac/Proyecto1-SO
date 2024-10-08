/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.concurrent.Semaphore;
import Classes.Developer;
import Classes.ProjectManager;
import Classes.Txt;
import Classes.Global;
import Classes.Director;
import Classes.Drive;
import Classes.Company;
import Main.App;

/**
 *
 * @author soyis
 */
public class Funciones {
    public static Company getCompany(int company) {
        return company == 0 ? App.getInstance().getApple() : App.getInstance().getHP();
    }

    public static void loadParams() {
        String fileData = Txt.read(App.getSelectedFile());

        // Se obtiene los datos del TXT
        int[] params = Txt.getGeneralInfo(fileData);

        if (params != null && params.length >= 2) {
            App.setDayDuration(params[0]);
            App.setDeadline(params[1]);
        }

        App app = App.getInstance();
        app.setApple(Funciones.createCompany(0));
        app.setHP(Funciones.createCompany(1));

    }

    // NOTE - 0 para nickelodeon y 1 para cartoon network
    public static Company createCompany(int company) {
        String fileData = Txt.read(App.getSelectedFile());

        // Se obtiene los datos del TXT
        int[] companyValues = Txt.getCompanyValues(company, fileData);

        if (companyValues != null && companyValues.length >= 9) {

            String name = Global.companies[company];
            Developer[][] workers = new Developer[6][];
            Semaphore mutex = new Semaphore(1);
            Drive drive = new Drive(25, 20, 55, 35, 10);
            int projectManager = 1;
            int director = 1;
            int maxEmployees = companyValues[8];

            // Se crean los empleados de cada sección
            for (int type = 0; type <= 5; type++) {
                Developer[] employees = new Developer[maxEmployees];

                for (int j = 0; j < companyValues[type]; j++) {
                    int workerId = j + 1;
                    int numOfWorkDone = Global.productionTimes[company][type][0];
                    int daysToFinish = Global.productionTimes[company][type][1];
                    int hourlyWage = Global.hourlyWages[type];
                    developers[j] = new Employee(company, workerId, type, daysToFinish, numOfWorkDone, hourlyWage,
                            drive, mutex);
                }
                workers[type] = employees;
            }
            Company network = new Company(name, maxEmployees, workers[0], workers[1], workers[2],
                    workers[3], workers[4],
                    workers[5], projectManager, director, drive, mutex);

            // Se crea al projectManager y al director, se les pasa la cadena televisiva.
            ProjectManager projectManagerInstance = new ProjectManager(company, 1, 5, 1, 1,
                    Global.hourlyWages[5], drive, mutex);
            network.setProjectManagerInstance(projectManagerInstance);
            Director directorInstance = new Director(company, 1, 6, 2, 1, Global.hourlyWages[6], drive,
                    mutex);
            network.setDirectorInstance(directorInstance);
            return network;

        }
        return null;
    }

    public void addWorker(int company, int workerType) {

        Company network = company == 0 ? App.getInstance().getApple()
                : App.getInstance().getHP();

        // Se verifica si la cantidad actual de empleados es menor que la cantidad
        // máxima permitida
        if (network.getActualEmployeesQuantity() < network.getMaxEmployeesQuantity()) {
            Employee[] employees = getEmployeesArrayByType(network, workerType);

            // Se crea nuevo empleado
            int workerId = network.getActualEmployeesQuantity() + 1;
            int daysToFinish = Global.productionTimes[company][workerType][1];
            int numOfWorkDone = Global.productionTimes[company][workerType][0];
            int hourlyWage = Global.hourlyWages[workerType];
            Employee newEmployee = new Employee(company, workerId, workerType, daysToFinish, numOfWorkDone, hourlyWage,
                    network.getDrive(), network.getMutex());

            // Se inicia el hilo del nuevo empleado
            newEmployee.start();

            // Se buscar la primera posición vacía en el arreglo y añadir allí el nuevo
            // empleado
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    employees[i] = newEmployee;
                    network.setActualEmployeesQuantity(network.getActualEmployeesQuantity() + 1);
                    // Actualizar la cantidad de empleados
                    break;
                }
            }
        } else {
            System.out.println("Se ha alcanzado el número máximo de empleados.");
        }
    }

    public void deleteWorker(int company, int workerType) {
        Company network = Funciones.getCompany(company);

        // Verifica si hay empleados para eliminar
        if (network.getActualEmployeesQuantity() > 0) {
            Employee[] employees = getEmployeesArrayByType(network, workerType);

            if (employees != null) {
                // Buscar el último empleado no nulo
                for (int i = employees.length - 1; i >= 0; i--) {
                    if (employees[i] != null) {
                        // Interrumpe el hilo del empleado
                        employees[i].interrupt();

                        // Elimina el empleado del arreglo
                        employees[i] = null;

                        // Actualiza la cantidad de empleados
                        network.setActualEmployeesQuantity(network.getActualEmployeesQuantity() - 1);
                        break;
                    }
                }
            }
        } else {
            System.out.println("No hay empleados para eliminar.");
        }
    }

    private Employee[] getEmployeesArrayByType(Company network, int workerType) {
        switch (workerType) {
            case 0:
                return network.getScreenwriters();
            case 1:
                return network.getSetDesigners();
            case 2:
                return network.getCharacterAnimators();
            case 3:
                return network.getVoiceActors();
            case 4:
                return network.getPlotTwistScreenwriters();
            case 5:
                return network.getAssemblers();
            default:
                return null;
        }
    }

    private void setEmployeesArrayByType(Company network, int workerType, Employee[] newEmployees) {
        switch (workerType) {
            case 0:
                network.setScreenwriters(newEmployees);
                break;
            case 1:
                network.setSetDesigners(newEmployees);
                break;
            case 2:
                network.setCharacterAnimators(newEmployees);
                break;
            case 3:
                network.setVoiceActors(newEmployees);
                break;
            case 4:
                network.setPlotTwistScreenwriters(newEmployees);
                break;
        }
    }

    public static void calculateTotalCost(int company, float accumulatedSalary) {
        Company tv = getCompany(company);
        tv.setTotalCost(tv.getTotalCost() + accumulatedSalary);
    }

    public static void calculateTotalEarnings(int company) {
        Company tv = getCompany(company);
        float earning = (tv.getNumNormalChapters() * Global.profitComputers[company][0])
                + (tv.getNumChaptersWithPlotTwist() * Global.profitComputers[company][1]);
        tv.setEarning(earning);
    }

    public static void calculateProfit(int company) {
        Company tv = getCompany(company);
        float profit = tv.getEarning() - tv.getTotalCost();
        tv.setProfit(profit);
    }
}
