package com.springboot.teachermanagement_groupproject.repo;

import com.springboot.teachermanagement_groupproject.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {
}
