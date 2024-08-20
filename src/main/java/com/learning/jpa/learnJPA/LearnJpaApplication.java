package com.learning.jpa.learnJPA;

import com.learning.jpa.learnJPA.data.Course;
import com.learning.jpa.learnJPA.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnJpaApplication implements CommandLineRunner {

	@Autowired
	CourseRepository cr;

	Logger logger = LoggerFactory.getLogger(LearnJpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LearnJpaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		logger.info("Logging fetch all courses -> {}",cr.fetchAllCourse());
		cr.deleteBy(10001L);
		logger.info("Creating a new course -> {}",cr.save(new Course("Microservices in 100 steps")));
		logger.info("Logging fetch all courses -> {}",cr.fetchAllCourse());
	}
}
