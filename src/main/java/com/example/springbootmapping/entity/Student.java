package com.example.springbootmapping.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Student {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private StudentDetails studentDetails;

    @OneToOne(cascade = CascadeType.ALL)
    private Passport passport;

    @Override
    public String toString ( ) {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentDetails=" + studentDetails +
                ", passport=" + passport +
                '}';
    }

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "student")
    private List<Course> courses;

}
