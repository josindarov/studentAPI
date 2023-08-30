package com.schoolproject.studentapi.service;

import com.schoolproject.studentapi.dao.StudentDao;
import com.schoolproject.studentapi.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentDao studentDao;
    @Autowired
    public StudentService(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    public void insertStudent(Student student){
        studentDao.save(student);
    }

    public List<Student> getAllStudents(){
        return studentDao.findAll();
    }

    public Student getStudentById(long id){
        return studentDao.findById(id).orElse(null);
    }

    public void deleteAllStudents(){
        studentDao.deleteAll();
    }

    public void deleteStudentById(long id){
        studentDao.deleteById(id);
    }

    public Student updateStudentById(long id, Student student){
        Student existStudent = getStudentById(id);
        if(existStudent != null){
            existStudent.setFirstName(student.getFirstName());
            existStudent.setLastName(student.getLastName());
            existStudent.setEmail(student.getEmail());
            existStudent.setUniversity(student.getUniversity());
            return existStudent;
        }

        return null;
    }





}
