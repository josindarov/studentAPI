package com.schoolproject.studentapi.dao;

import com.schoolproject.studentapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student, Long> {
}
