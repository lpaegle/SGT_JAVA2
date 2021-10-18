package lesson8.task3;

public class Member {
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
        data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and
        salary to an employee and a manager by making an object of both of these classes and print the same.
     */

        private String name;
        private int age;
        private long phoneNumber;
        private String address;
        private int salary;



        public Member() {
        }

        public Member(String name, int age, long phoneNumber,String address, int salary) {
                this.name = name;
                this.age = age;
                this.phoneNumber = phoneNumber;
                this.address = address;
                this.salary = salary;
                printSalary();
        }

        @Override
        public String toString() {
                return "Member{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", phoneNumber=" + phoneNumber +
                        ", address='" + address + '\'' +
                        ", salary=" + salary +
                        '}';
        }

        public void printSalary() {
                System.out.println("The salary is " + this.getSalary());
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public long getPhoneNumber() {
                return phoneNumber;
        }

        public void setPhoneNumber(long phoneNumber) {
                this.phoneNumber = phoneNumber;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public int getSalary() {
                return salary;
        }

        public void setSalary(int salary) {
                this.salary = salary;
        }
}
