package com.schoolproject.studentapi.service;

import com.schoolproject.studentapi.dao.UniversityDao;
import com.schoolproject.studentapi.entity.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService {

    private UniversityDao universityDao;
    @Autowired
    public UniversityService(UniversityDao universityDao){
        this.universityDao = universityDao;
    }

    public void insertUniversity(University university){
        universityDao.save(university);
    }

    public List<University> getAllUniversities(){
        return universityDao.findAll();
    }

    public University getUniversityById(long id){
        return universityDao.findById(id).orElse(null);
    }

    public void deleteAllUniversities(){
        universityDao.deleteAll();
    }

    public void deleteUniversityById(long id){
        universityDao.deleteById(id);
    }

    public University updateUniversity(long id, University university){
        University existUniversity = getUniversityById(id);
        existUniversity.setName(university.getName());
        return existUniversity;
    }


}
