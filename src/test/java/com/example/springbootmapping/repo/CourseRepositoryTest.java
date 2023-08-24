package com.example.springbootmapping.repo;

import com.example.springbootmapping.entity.Course;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@Log4j2
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    void testRepo ( ) {
        List<Course> all = courseRepository.findAll();
        all.forEach(x -> {
            log.info(x);
            log.info(x.getReviews());
            log.info(x.getStudent());
        });
      assertNotNull(all);

    }
}