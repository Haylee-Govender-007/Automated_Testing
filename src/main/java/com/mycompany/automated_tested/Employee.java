/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automated_tested;

/**
 *
 * @author lab_services_student
 */
public class Employee {
 
    private double salary; 
    
    // Create a Constructor
    public Employee (double salary){
        this.salary = salary; 
    }
    //Create a calculate salary method
    public double calculateSalary(double bonus,double taxRate){ 
        double grossSalary = salary ; 
        double tax = grossSalary * taxRate;
        return grossSalary - tax; 
    }
    
}
