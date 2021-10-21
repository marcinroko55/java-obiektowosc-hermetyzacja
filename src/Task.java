public class Task {
    private String description;
    private Employee employee;

    public Task(String description, Employee employee) {
        this.description = description;
        this.employee = employee;
    }

    public void display() {
        System.out.println("Description: " + description);
        if (employee != null) {
            employee.display();
        }
    }
}



