package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    private static int idCounter = 0; // For auto-generating unique customerId
    @Id
    private int customerId;
    private String customerName;
    private CustomerStatus customerStatus;
    private int totalCustomerMileage;


    // Empty constructor for Hibernate
    public Customer() {
        this.customerId = ++idCounter; // Auto-generate unique customerId
    }

    // Parameterized constructor
    public Customer(String customerName, CustomerStatus customerStatus, int totalCustomerMileage) {
        this.customerId = ++idCounter; // Auto-generate unique customerId
        this.customerName = customerName;
        this.customerStatus = customerStatus;
        this.totalCustomerMileage = totalCustomerMileage;
    }

    // Getters and Setters
    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public CustomerStatus getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(CustomerStatus customerStatus) {
        this.customerStatus = customerStatus;
    }

    public int getTotalCustomerMileage() {
        return totalCustomerMileage;
    }

    public void setTotalCustomerMileage(int totalCustomerMileage) {
        this.totalCustomerMileage = totalCustomerMileage;
    }
}
