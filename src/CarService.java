public class CarService {
    Employee[] employees;
    private int employeeIndex = 0;

    private Task[] tasks;
    private int taskIndex = 0;

    public CarService() {
        employees = new Employee[10];
        tasks = new Task[20];
    }

    public void addEmployee(Employee employee) {
        employees[employeeIndex++] = employee;
    }

    public void displayEmployees() {
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            System.out.println("----------------------");
            employees[i].display();
        }
    }

    public Employee findEmployee(int id) {
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    public void addTask(Task task) {
        tasks[taskIndex++] = task;
    }

    public void displayTasks() {
        for (int i = 0; i < tasks.length && tasks[i] != null; i++) {
            System.out.println("----------------------");
            tasks[i].display();

        }
    }


}
