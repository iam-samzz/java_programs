abstract class Employee {
    String name;
    double salary;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("A", 30000);
        Employee e2 = new PartTimeEmployee("B", 200, 50);

        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());
    }
}