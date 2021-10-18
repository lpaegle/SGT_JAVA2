package lesson8.task3;

public class Main3 {
    public static void main(String[] args) {
        /*
         Now, assign name, age, phone number, address and
        salary to an employee and a manager by making an
        object of both of these classes and print the same.
         */
        Employee firstEmpl = new Employee();
        firstEmpl.setName("Tod");
        firstEmpl.setAge(34);
        firstEmpl.setPhoneNumber(26584952);
        firstEmpl.setAddress("Rosewood street 5");
        firstEmpl.setSalary(1300);

        Manager manager = new Manager();
        manager.setName("Dana");
        manager.setAge(41);
        manager.setPhoneNumber(26598415);
        manager.setAddress("Moonlight avenue");
        manager.setSalary(1500);

        System.out.println(firstEmpl);
        System.out.println(manager);

    }
}
