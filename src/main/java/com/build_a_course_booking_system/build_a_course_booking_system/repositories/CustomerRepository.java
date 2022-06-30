package com.build_a_course_booking_system.build_a_course_booking_system.repositories;

import com.build_a_course_booking_system.build_a_course_booking_system.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
