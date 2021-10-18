package lesson8.task3;

public class Manager extends Member{

    private String department;

    public Manager() {
    }

    public Manager(String name, int age, long phoneNumber, String address, int salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
