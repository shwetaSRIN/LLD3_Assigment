package com.employee;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Employee> emp_list= new ArrayList<>();
        emp_list.add(new FullTimeEmployee("Shweta",20000));
        emp_list.add(new PartTimeEmployee("Abhay",15000));
        emp_list.add(new Intern("Roli",10000));

        for(Employee e: emp_list){
            e.calculateTaxes();
        }
    }
}
