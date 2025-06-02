package com.bipin.streams.HandsOn;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private String city;
    private double salary;
    private String gender;

    // Constructor
    public Employee(int id, String name, int age, String department, String city, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.city = city;
        this.salary = salary;
        this.gender = gender;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getCity() {
        return city;
    }

    public double getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    // Override toString for easy printing
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}
