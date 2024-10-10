/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.concurrent.Semaphore;
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
                Developer[] developers = new Developer[maxEmployees];

                for (int j = 0; j < companyValues[type]; j++) {
                    int workerId = j + 1;
                    int numOfWorkDone = Global.productionTimes[company][type][0];
                    int daysToFinish = Global.productionTimes[company][type][1];
                    int hourlyWage = Global.hourlyWages[type];
                    developers[j] = new Developer(company, workerId, type, daysToFinish, numOfWorkDone, hourlyWage,
                            drive, mutex);
                }
                workers[type] = developers;
            }
            Company empresa = new Company(name, maxEmployees, workers[0], workers[1], workers[2],
                    workers[3], workers[4],
                    workers[5], projectManager, director, drive, mutex);

            // Se crea al projectManager y al director, se les pasa la cadena televisiva.
            ProjectManager projectManagerInstance = new ProjectManager(company, 1, 5, 1, 1,
                    Global.hourlyWages[5], drive, mutex);
            empresa.setProjectManagerInstance(projectManagerInstance);
            Director directorInstance = new Director(company, 1, 6, 2, 1, Global.hourlyWages[6], drive,
                    mutex);
            empresa.setDirectorInstance(directorInstance);
            return empresa;

        }
        return null;
    }

    public void addWorker(int company, int workerType) {

        Company empresa = company == 0 ? App.getInstance().getApple()
                : App.getInstance().getHP();

        // Se verifica si la cantidad actual de empleados es menor que la cantidad
        // máxima permitida
        if (empresa.getActualEmployeesQuantity() < empresa.getMaxEmployeesQuantity()) {
            Developer[] developers = getDevelopersArrayByType(empresa, workerType);

            // Se crea nuevo empleado
            int workerId = empresa.getActualEmployeesQuantity() + 1;
            int daysToFinish = Global.productionTimes[company][workerType][1];
            int numOfWorkDone = Global.productionTimes[company][workerType][0];
            int hourlyWage = Global.hourlyWages[workerType];
            Developer newDeveloper = new Developer(company, workerId, workerType, daysToFinish, numOfWorkDone, hourlyWage,
                    empresa.getDrive(), empresa.getMutex());

            // Se inicia el hilo del nuevo empleado
            newDeveloper.start();

            // Se buscar la primera posición vacía en el arreglo y añadir allí el nuevo
            // empleado
            for (int i = 0; i < developers.length; i++) {
                if (developers[i] == null) {
                    developers[i] = newDeveloper;
                    empresa.setActualEmployeesQuantity(empresa.getActualEmployeesQuantity() + 1);
                    // Actualizar la cantidad de empleados
                    break;
                }
            }
        } else {
            System.out.println("Se ha alcanzado el número máximo de empleados.");
        }
    }

    public void deleteWorker(int company, int workerType) {
        Company empresa = Funciones.getCompany(company);

        // Verifica si hay empleados para eliminar
        if (empresa.getActualEmployeesQuantity() > 0) {
            Developer[] developers = getDevelopersArrayByType(empresa, workerType);

            if (developers != null) {
                // Buscar el último empleado no nulo
                for (int i = developers.length - 1; i >= 0; i--) {
                    if (developers[i] != null) {
                        // Interrumpe el hilo del empleado
                        developers[i].interrupt();

                        // Elimina el empleado del arreglo
                        developers[i] = null;

                        // Actualiza la cantidad de empleados
                        empresa.setActualEmployeesQuantity(empresa.getActualEmployeesQuantity() - 1);
                        break;
                    }
                }
            }
        } else {
            System.out.println("No hay trabajadores disponibles para eliminar");
        }
    }

    private Developer[] getDevelopersArrayByType(Company network, int workerType) {
        switch (workerType) {
            case 0:
                return network.getPlacaBase();
            case 1:
                return network.getCPUs();
            case 2:
                return network.getRam();
            case 3:
                return network.getFuenteAlimentacion();
            case 4:
                return network.getTarjetasGraficas();
            case 5:
                return network.getEnsambladores();
            default:
                return null;
        }
    }

    private void setDevelopersArrayByType(Company network, int workerType, Developer[] newEmployees) {
        switch (workerType) {
            case 0:
                network.setPlacaBase(newEmployees);
                break;
            case 1:
                network.setCpus(newEmployees);
                break;
            case 2:
                network.setRam(newEmployees);
                break;
            case 3:
                network.setFuenteAlimentacion(newEmployees);
                break;
            case 4:
                network.setTarjetasGraficas(newEmployees);
                break;
        }
    }

    public static void calculateTotalCost(int company, float accumulatedSalary) {
        Company tv = getCompany(company);
        tv.setTotalCost(tv.getTotalCost() + accumulatedSalary);
    }

    public static void calculateTotalEarnings(int company) {
        Company tv = getCompany(company);
        float earning = (tv.getNumComputadorasNorm() * Global.profitComputers[company][0])
                + (tv.getNumComputadorasGraf() * Global.profitComputers[company][1]);
        tv.setEarning(earning);
    }

    public static void calculateProfit(int company) {
        Company tv = getCompany(company);
        float profit = tv.getEarning() - tv.getTotalCost();
        tv.setProfit(profit);
    }
}
