package lesson8.task3;

public class Main3 {
    public static void main(String[] args) {
        /*
    Create a class named 'Member' having the following members:
        Data members
        1 - Name
        2 - Age
        3 - Phone number
        4 - Address
        5 - Salary
        It also has a method named 'printSalary' which prints the salary of the members.
        Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have
        data members 'specialization' and 'department' respectively.
        Now, assign name, age, phone number, address and
        salary to an employee and a manager by making an object of both of these classes and print the same.
         */
        Employee firstEmpl = new Employee();
        firstEmpl.setName("Tod");
        firstEmpl.setAge(34);
        firstEmpl.setPhoneNumber(26584952);
        firstEmpl.setAddress("Rosewood street 5");
        firstEmpl.setSalary(1300);
        firstEmpl.setSpecialization("Sale consultant");

        Manager manager = new Manager();
        manager.setName("Dana");
        manager.setAge(41);
        manager.setPhoneNumber(26598415);
        manager.setAddress("Moonlight avenue");
        manager.setSalary(1500);
        manager.setDepartment("Party creators");

        System.out.println(firstEmpl);
        System.out.println(manager);

    }
}
