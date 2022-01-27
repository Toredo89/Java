/**
 * Java 1. Homework 5
 *
 * @author Ruslan Khusnulgatin
 * @version 26.01.2022
 */

public class Lesson5Homework {

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Ivanov Ivan", "Director",
                       "ivanovis@mail.ru", "9007878", 200000, 45),
            new Employee("Smirnov Sergey", "Top manager",
                       "smirniv30@mail.com", "7847474", 150000, 30),
            new Employee("Petrov Andrew", "manager",
                       "petrovAV@mail.ru", "4784152", 100000, 25),
            new Employee("Trifanov Vladimir", "manager",
                       "trifanovVlad@mail.ru", "8561211", 25000, 35),
            new Employee("Semenov Semen", "manager",
                       "semenov41SS@mail.com", "7451111", 55000, 41),
            new Employee("Aleksandrov Petr", "manager",
                       "aleksPetr@mail.ru", "7845252", 20000, 22),
        };

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
                }
            }
        }
    }

class Employee {
    private String name;
    private String position;
    private String phone;
    private String email;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return ("name: " + name + " | position: " + position + " | email: " + email + " | salary: " + salary + " | age: " + age);
    }
}