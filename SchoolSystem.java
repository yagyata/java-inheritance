import java.sql.SQLOutput;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}

class Teacher extends Person {
    protected String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole(){
        System.out.println("Role: Teacher");
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    protected String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole(){
        System.out.println("Role: Student");
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    protected String department;
    public Staff(String name, int age, String department){
        super(name, age);
        this.department = department;
    }

    public void displayRole(){
        System.out.println("Role: Staff");
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Koro", 35, "Maths");
        Student student = new Student("Nagisa", 14, "A+");
        Staff staff = new Staff("Ram", 45, "Administration");

        teacher.displayRole();
        System.out.println();
        student.displayRole();
        System.out.println();
        staff.displayRole();
    }
}
