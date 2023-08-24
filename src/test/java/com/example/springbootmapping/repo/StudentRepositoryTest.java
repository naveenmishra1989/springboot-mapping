package com.example.springbootmapping.repo;

import com.example.springbootmapping.entity.Student;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
@Log4j2
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void show(){
        List<Student> student = studentRepository.findAll();
        student.forEach(log::info);
        assertNotNull(student);

    }

}