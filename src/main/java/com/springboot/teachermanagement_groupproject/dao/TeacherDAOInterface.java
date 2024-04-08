package com.springboot.teachermanagement_groupproject.dao;

import com.springboot.teachermanagement_groupproject.entity.Teacher;

import java.util.List;

public interface TeacherDAOInterface {

    public Teacher addTeacher (Teacher teacher);
    public void deleteTeacher (Integer teacherId);
    public Teacher updateTeacher (Teacher teacher);
    public Teacher getTeacherById (Integer teacherId);
    public List<Teacher> getAllTeachers ();
}
