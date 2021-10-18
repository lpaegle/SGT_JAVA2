package lesson8.task3;

public class Manager extends Member{
    private String specialization;
    private String department;

    public Manager() {
    }

    public Manager(String name, int age, long phoneNumber, String address, int salary, String specialization, String department) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}