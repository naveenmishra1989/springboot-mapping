package com.example.springbootmapping.repo;

import com.example.springbootmapping.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
