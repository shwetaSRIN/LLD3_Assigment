package com.employee;

public class Intern implements Employee{
    private String name;
    private double salary;

    Intern(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    @Override
    public void calculateTaxes() {
        double PT=0.02;
        double tax=PT*salary;
        System.out.println(" Tax for Intern "+name+" with salary "+salary+" is "+String.format("%.2f",tax));
    }
}
