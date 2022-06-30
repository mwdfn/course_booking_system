package com.build_a_course_booking_system.build_a_course_booking_system.repositories;

import com.build_a_course_booking_system.build_a_course_booking_system.models.Course;
import com.build_a_course_booking_system.build_a_course_booking_system.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByBookings_Course(Course course);


}
