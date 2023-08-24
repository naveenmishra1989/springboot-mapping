package com.example.springbootmapping.repo;

import com.example.springbootmapping.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport,Long> {
}
