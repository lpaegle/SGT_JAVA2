package lesson8.task3;

public class Employee extends Member{

    private String specialization;

    public Employee() {
    }

    public Employee(String name, int age, long phoneNumber, String address, int salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

}
