package com.build_a_course_booking_system.build_a_course_booking_system.repositories;

import com.build_a_course_booking_system.build_a_course_booking_system.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByDate(String date);


}
