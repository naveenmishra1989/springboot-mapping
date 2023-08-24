package com.example.springbootmapping.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class StudentDetails {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String fName;
    private String LName;
}
