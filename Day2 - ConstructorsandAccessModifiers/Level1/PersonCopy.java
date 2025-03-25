class Person {
    String name;
    int ID;
    int salary;

    Person() {
        this.name = "Ragul";
        this.ID = 576;
        this.salary = 50000;
    }

    Person(Person p) {
        this.name = p.name;
        this.ID = p.ID;
        this.salary = p.salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Salary: " + salary);
    }
}

class PersonCopy {
    public static void main(String[] args) {
        Person defCons = new Person();
        defCons.displayDetails();

        System.out.println("Creating a copy Constructor...");
        Person copyCons = new Person(defCons);
        copyCons.displayDetails();
    }
}
