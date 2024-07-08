package com.example.demo.model;

import javax.persistence.*;

@Entity
public class FlightBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;

    @Column(nullable = false)
    private int customerId;

    @Column(nullable = false)
    private int flightId;

    // Empty constructor
    public FlightBooking() {}

    // Parameterized constructor
    public FlightBooking(int customerId, int flightId) {
        this.customerId = customerId;
        this.flightId = flightId;
    }

    // Getter and Setter methods
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }
}

@Entity
@Table(name = "customers")
public class Customer {
    // Define the com.example.demo.model.Customer entity here
}

@Entity
@Table(name = "flights")
public class Flight {
    // Define the com.example.demo.model.Flight entity here
}
