class Personn {
    String name;
    int id;

    public Personn(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    void performDuties();
}

class Chef extends Personn implements Worker {
    String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing " + specialty);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
    }
}

class Waiter extends Personn implements Worker {
    int tableAssigned;

    public Waiter(String name, int id, int tableAssigned) {
        super(name, id);
        this.tableAssigned = tableAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving table no " + tableAssigned);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Waiter");
        System.out.println("Table Assigned: " + tableAssigned);
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Ramsay", 124, "Butter Chicken");
        chef.displayDetails();
        chef.performDuties();

        Waiter waiter = new Waiter("Luke", 31, 21);

        System.out.println();
        waiter.displayDetails();
        waiter.performDuties();
    }
}