package com.example.employee.entity;

import javax.persistence.*;

@Entity
public class Employee {

    private String name;
    @Id
    private int id;
    private String gender;
    private int salary;
    private int age;
    private int companyId;

    public Employee() {
    }

    public Employee(String name, int id, String gender, int salary, int age, int companyId) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.salary = salary;
        this.age = age;
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public int getCompanyId() {
        return companyId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", companyId=" + companyId +
                '}';
    }
}
