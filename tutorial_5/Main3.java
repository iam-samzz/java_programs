class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    double incentive;

    Manager(String name, double salary, double incentive) {
        super(name, salary);
        this.incentive = incentive;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Incentive: " + incentive);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + programmingLanguage);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Manager m = new Manager("Arun", 50000, 10000);
        Developer d = new Developer("Ravi", 40000, "Java");

        m.displayDetails();
        d.displayDetails();
    }
}