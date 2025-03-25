class Employee {
    String name;
    int ID;
    int salary;

    Employee(String name, int ID, int salary){
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("Name: " + name + " Employee ID: " + ID + " Salary: " + salary);
    }
    
}
class empDetails{
    public static void main(String[] args) {
        Employee emp = new Employee("Ragul", 576, 100000);
        emp.displayDetails();
    }
}

