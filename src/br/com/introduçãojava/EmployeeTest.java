package br.com.introduçãojava;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Larissa";
        employee.age = 21;
        employee.salary = new double[] {2000, 2500, 3000};
        employee.print();

    }
}
