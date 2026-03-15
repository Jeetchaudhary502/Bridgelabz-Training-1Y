class Employee {

    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.name = "Jeet";
        emp.id = 28;
        emp.salary = 100000;

        emp.displayDetails();
    }
}