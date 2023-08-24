package com.example.springbootmapping;

import com.example.springbootmapping.entity.*;
import com.example.springbootmapping.repo.CourseRepository;
import com.example.springbootmapping.repo.ReviewRepository;
import com.example.springbootmapping.repo.StudentRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@Log4j2
@SpringBootApplication
public class SpringbootMappingApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ReviewRepository reviewRepository;


    public static void main (String[] args) {
        SpringApplication.run(SpringbootMappingApplication.class, args);
    }

    @Override
    public void run (String... args) throws Exception {
        Passport passport = Passport.builder().number("DL4676").build();
        StudentDetails studentDetails = StudentDetails.builder().fName("sonu").LName("sahu").build();

        Student student = Student.builder().name("naveen").studentDetails(studentDetails).passport(passport).build();



        Course c1 = Course.builder().title("java").student(student).build();
        Course c2 = Course.builder().title("c++").student(student).build();



        Review r1 = Review.builder().description("bad").rating((byte) 1).course(c1).build();
        Review r2 = Review.builder().description("average").rating((byte) 3).course(c2).build();
        Review r3 = Review.builder().description("good").rating((byte) 5).course(c2).build();
        reviewRepository.saveAll(Arrays.asList(r1, r2, r3));
        courseRepository.saveAll(Arrays.asList(c1,c2));
        studentRepository.save(student);
    }
}
