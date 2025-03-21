package com.interview.programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Programs {


    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "John Doe", 30, 101, List.of("john.doe@example.com")));
        employeeList.add(new Employee(2, "Jane Smith", 28, 102, List.of("jane.smith@example.com")));
        employeeList.add(new Employee(3, "Emily Davis", 35, 103, List.of("emily.davis@example.com")));
        employeeList.add(new Employee(4, "Michael Brown", 40, 104, List.of("michael.brown@example.com")));
        employeeList.add(new Employee(5, "Sarah Johnson", 25, 103, List.of("sarah.johnson@example.com")));
        employeeList.add(new Employee(6, "David Wilson", 32, 101, List.of("david.wilson@example.com")));
        employeeList.add(new Employee(7, "Laura Martinez", 29, 107, List.of("laura.martinez@example.com")));
        employeeList.add(new Employee(8, "James Anderson", 58, 104, List.of("james.anderson@example.com")));
        employeeList.add(new Employee(9, "Olivia Thomas", 33, 104, List.of("olivia.thomas@example.com")));
        employeeList.add(new Employee(10, "William Jackson", 45, 110, List.of("william.jackson@example.com")));


        //display all emps
        employeeList.stream().forEach(e-> System.out.print(e+" "));
        System.out.println();

        //display emplyees whose name starts with D and O
        employeeList.stream().filter(e->e.getName().startsWith("D") || e.getName().startsWith("O"))
                .forEach(em-> System.out.print(em+" "));

        //display highest age of employee
        Employee maxAge = employeeList.stream().max(Comparator.comparing(em->em.getAge())).get();
        System.out.println(maxAge);

        //display all employees with dept 104
        List<Employee> dept104 = employeeList.stream().filter(e->104 ==e.getDept()).toList();
        System.out.println(dept104);

        //Sort Employees by Age Sort all employees by their age in ascending order

        List<Employee> sortedEmployees = employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).toList();
        for(Employee e : sortedEmployees){
            System.out.println(e);
        }

    }

}

class Employee {

    public Employee(int id, String name, int age, int dept, List<String> emails) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.emails = emails;
    }

    private int id;
    private String name;
    private int age;
    private int dept;  // Changed from String to int
    private List<String> emails;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dept=" + dept +   // Changed to print dept as an int
                ", emails=" + emails +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getDept() {
        return dept;  // Getter for dept changed to return int
    }

    public void setDept(int dept) {
        this.dept = dept;  // Setter for dept updated to accept int
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }
}
