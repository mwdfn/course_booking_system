package com.build_a_course_booking_system.build_a_course_booking_system;

import com.build_a_course_booking_system.build_a_course_booking_system.models.Booking;
import com.build_a_course_booking_system.build_a_course_booking_system.models.Course;
import com.build_a_course_booking_system.build_a_course_booking_system.models.Customer;
import com.build_a_course_booking_system.build_a_course_booking_system.repositories.BookingRepository;
import com.build_a_course_booking_system.build_a_course_booking_system.repositories.CourseRepository;
import com.build_a_course_booking_system.build_a_course_booking_system.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class BuildACourseBookingSystemApplicationTests {

	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	BookingRepository bookingRepository;
	@Autowired
	CourseRepository courseRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateCustomerCourseAndBookingAndSave(){
		Customer customer1 = new Customer("Joe Mamah", "Edinburgh", 21);
		customerRepository.save(customer1);

		Course course1 = new Course("Fashion Design", "Edinburgh", 5);
		courseRepository.save(course1);

		Booking booking1 = new Booking();
		booking1.setDate("2022/11/20");
		booking1.setCustomer(customer1);
		booking1.setCourse(course1);
		bookingRepository.save(booking1);
		assertTrue(booking1.getId()!=null);
	}
}
