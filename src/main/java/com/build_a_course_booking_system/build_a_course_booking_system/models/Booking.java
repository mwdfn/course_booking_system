package com.build_a_course_booking_system.build_a_course_booking_system.models;

import com.build_a_course_booking_system.build_a_course_booking_system.repositories.CustomerRepository;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="date")
    private String date;
    @Column(name="customers")
    private ArrayList<Customer> customers;
    @Column(name="courses")
    private ArrayList<Course> courses;

    public Booking(String date) {
        this.date = date;
        this.customers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public Booking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
