class Employee{
    String name;
    String id;
    double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Name: " + name + "\nID: " + id + "\nSalary: " + salary + "\n");
    }
}

class Manager extends Employee{

    int teamSize;

    public Manager(String name, String id, double salary, int teamSize){
        super(name,id,salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails(){
        System.out.println("Name: " + name + "\nID: " + id + "\nSalary: " + salary + "\nTeam Size: " + teamSize + "\n");
    }
}

class Developer extends Employee{

    String programmingLanguage;

    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void displayDetails(){
        System.out.println("Name: " + name + "\nID: " + id + "\nSalary: " + salary + "\nProgramming Language: " + programmingLanguage + "\n");
    }

}

class Intern extends Employee{
    public Intern(String name, String id, double salary) {
        super(name, id, salary);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("Eren", "34MG", 70000, 10);
        Employee developer = new Developer("Mikasa", "86SD", 72000, "Python");
        Employee intern = new Intern("Armin", "24IN", 35000);

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}

/*
Name: Eren
ID: 34MG
Salary: 70000.0
Team Size: 10

Name: Mikasa
ID: 86SD
Salary: 72000.0
Programming Language: Python

Name: Armin
ID: 24IN
Salary: 35000.0

 */