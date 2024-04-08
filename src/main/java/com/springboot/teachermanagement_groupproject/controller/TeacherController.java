package com.springboot.teachermanagement_groupproject.controller;

import com.springboot.teachermanagement_groupproject.dao.TeacherDAO;
import com.springboot.teachermanagement_groupproject.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TeacherController {

    @Autowired
    TeacherDAO teacherDAO;

    @GetMapping("/all-teachers")
    public String showAllTeachers(Model model) {
        List<Teacher> teachers = teacherDAO.getAllTeachers();
        model.addAttribute("teachers", teachers);
        return "index";
    }

    @GetMapping("/add-teacher")
    public String showAddTeacherForm(Model model) {
        model.addAttribute("teacher", new Teacher());
        return "add-teacher";
    }

    @PostMapping("/add-teacher")
    public String addTeacher(@ModelAttribute Teacher teacher){
        teacherDAO.addTeacher(teacher);
        return "redirect:/all-teachers";
    }

    @PostMapping("/save-teacher")
    public String saveTeacher(@ModelAttribute Teacher teacher) {
        teacherDAO.addTeacher(teacher);
        return "redirect:/all-teachers";
    }

    @GetMapping("/edit-teacher/{teacherId}")
    public String showEditForm(@PathVariable Integer teacherId, Model model) {
        Teacher teacher = teacherDAO.getTeacherById(teacherId);
        model.addAttribute("teacher", teacher);
        return "edit-teacher";
    }

    @PostMapping("/update-teacher")
    public String updateTeacher(@ModelAttribute Teacher teacher) {
        teacherDAO.updateTeacher(teacher);
        return "redirect:/all-teachers";
    }

    @PostMapping("/delete-teacher/{teacherId}")
    public String deleteTeacher(@PathVariable Integer teacherId){
        teacherDAO.deleteTeacher(teacherId);
        return "redirect:/all-teachers";
    }
}
