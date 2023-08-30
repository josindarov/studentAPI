package com.schoolproject.studentapi.dao;

import com.schoolproject.studentapi.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityDao extends JpaRepository<University, Long> {
}
