package com.employee;

public class FullTimeEmployee implements Employee{

    private String name;
    private double salary;

    FullTimeEmployee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    @Override
    public void calculateTaxes() {
        double PT=0.3;
        double EC=0.03;
        double tax=(PT+EC)*salary;
        System.out.println(" Tax for FullTimeEmployee "+name+" with salary "+salary+" is "+String.format("%.2f",tax));
    }
}
