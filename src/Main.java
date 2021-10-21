import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        CarService carService = new CarService();
        int option;
        int employeeId = 1;
        do {
            System.out.println("----------Car Service App----------");
            System.out.println("1 - add employee");
            System.out.println("2 - display employee");
            System.out.println("3 - add task");
            System.out.println("4 - display tasks:");
            System.out.println("100 - stop");

            option = scanner.nextInt();
            scanner.nextLine();
            Employee employee;

            switch (option) {
                case 1:
                    System.out.println("Name: ");
                    String name = scanner.nextLine();

                    System.out.println("Age: ");
                    int age = scanner.nextInt();

                    employee = new Employee(employeeId++, name, age);
                    carService.addEmployee(employee);
                    break;

                case 2:
                    carService.displayEmployees();
                    break;

                case 3:
                    System.out.println("Description: ");
                    String description = scanner.nextLine();

                    System.out.println("Id: ");
                    int id = scanner.nextInt();

                    employee = carService.findEmployee(id);
                    if (employee != null) {
                        Task task = new Task(description, employee);
                        carService.addTask(task);
                    } else {
                        System.out.println("Not found.");
                    }
                    break;
                case 4:
                    carService.displayTasks();
                    break;
            }

        } while (option != 100);
        scanner.close();
    }
}


