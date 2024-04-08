package com.springboot.teachermanagement_groupproject.dao;

import com.springboot.teachermanagement_groupproject.entity.Teacher;
import com.springboot.teachermanagement_groupproject.repo.TeacherRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherDAO implements TeacherDAOInterface{

    @Autowired
    private TeacherRepo teacherRepo;

@Transactional
    public Teacher addTeacher (Teacher teacher){
        return teacherRepo.save(teacher);
    }

    @Transactional
    public void deleteTeacher (Integer teacherId){
        teacherRepo.deleteById(teacherId);
    }

    @Transactional
    public Teacher updateTeacher (Teacher teacher){
        return teacherRepo.save(teacher);
    }

    public Teacher getTeacherById (Integer teacherId){
        Optional<Teacher> teacher = teacherRepo.findById(teacherId);
        return teacher.orElse(null);
    }

    public List<Teacher> getAllTeachers (){
        return teacherRepo.findAll();
    }
}
