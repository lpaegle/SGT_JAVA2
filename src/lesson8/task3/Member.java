package lesson8.task3;

public class Member {

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
