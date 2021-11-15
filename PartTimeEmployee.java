package com.employee;

public class PartTimeEmployee implements Employee{
    private String name;
    private double salary;

    PartTimeEmployee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    @Override
    public void calculateTaxes() {
        double PT=0.2;
        double ST=0.05;
        double tax=(PT+ST)*salary;
        System.out.println(" Tax for PartTimeEmployee "+name+" with salary "+salary+" is "+String.format("%.2f",tax));
    }
}
