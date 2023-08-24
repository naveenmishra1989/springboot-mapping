package com.example.springbootmapping.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Entity
public class Course {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String title;
    @CreationTimestamp
    private LocalDateTime insertDate;
    @UpdateTimestamp
    private LocalDateTime updateDate;

    @Override
    public String toString ( ) {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", insertDate=" + insertDate +
                ", updateDate=" + updateDate +'}';
    }

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "course")
    private List<Review> reviews;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_student",nullable = false)
    private Student student;

}
