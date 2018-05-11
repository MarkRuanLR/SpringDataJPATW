package com.example.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
    @Id
    private int companyId;
    private String companyName;
    private int numberOfEmployees;

    public int getCompanyId() {
        return companyId;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                '}';
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
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

        this.companyId = companyId;
        this.companyName = companyName;
        this.numberOfEmployees = numberOfEmployees;
    }
}
