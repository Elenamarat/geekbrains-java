package lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        Employee employee = new Employee("Employee", "post", 12345, 100, 100);
        System.out.println("ФИО: " + employee.getName() + ", должность: " + employee.getPost() + "     " + employee.getId());

        Employee[] list = new Employee[5];
        for (int i = 0; i < list.length; i++) {
            int j = i + 1;
            list[i] = new Employee("Employee" + j, "post" + j, j, j, j *=12);
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i].getAge() > 40) {
                System.out.println(list[i].getName() + ":");
                System.out.println("   должность - " + list[i].getPost());
                System.out.println("   телефон - " + list[i].getPhone());
                System.out.println("   зарплата - " + list[i].getSalary());
                System.out.println("   возраст - " + list[i].getAge());
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i].getAge() > 45) {
                int s = list[i].getSalary();
                list[i].setSalary(s + 5000);
            }
        }
    }
}
