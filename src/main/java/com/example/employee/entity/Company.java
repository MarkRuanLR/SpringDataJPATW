package com.example.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
    @Id
    private int id;
    private String companyName;
    private int numberOfEmployees;

    public int getCompanyId() {
        return id;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + id +
                ", companyName='" + companyName + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                '}';
    }

    public void setCompanyId(int companyId) {
        this.id = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Company(int companyId, String companyName, int numberOfEmployees) {

        this.id = companyId;
        this.companyName = companyName;
        this.numberOfEmployees = numberOfEmployees;
    }
}
