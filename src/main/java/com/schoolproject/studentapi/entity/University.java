package com.schoolproject.studentapi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "university")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "university_id")
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Student> students;

}
