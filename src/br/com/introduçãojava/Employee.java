package br.com.introduçãojava;

public class Employee {
    public String name;
    public int age;
    public double[] salary;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        for(double salaries: salary) {
            System.out.println(salaries + " ");
        }
        printSalariesAvarange();
    }
    public void printSalariesAvarange(){
        double average = 0;
        for (double salaries : salary) {
            average += salaries / salary.length;
        }
        System.out.println("\nThe average between salaries is: " + average);
    }
}



