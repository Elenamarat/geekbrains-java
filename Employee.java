package lesson4;

public class Employee {
    private static int employeeCount;
    private String name;
    private String post;
    private int phone;
    private int salary;
    private int age;
    private int id;

    public Employee(String name, String post, int phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        employeeCount++;
        this.id = employeeCount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public int getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
