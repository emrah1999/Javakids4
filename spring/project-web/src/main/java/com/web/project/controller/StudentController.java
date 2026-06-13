package com.web.project.controller;

import com.web.project.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    private List<Student> students = new ArrayList<>(
            List.of(
                    new Student(1L, "Ali", "Aliyev"),
                    new Student(2L, "Veli", "Veliev"),
                    new Student(3L, "Aysel", "Ayselova")
            )
    );

    @GetMapping("/students-list")
    public String getStudents(Model model) {
        model.addAttribute("students", students);
        return "students";
    }

    @GetMapping("/students-add")
    public String studentsAdd() {
        return "students-add";
    }

    @GetMapping("/delete")
    public String deleteStudent(
            Long id) {
        students.removeIf(
                s -> s.getId().equals(id)
        );
        return "redirect:/students-list";
    }

    @PostMapping("/add")
    public String addStudent(
            String name,
            String surname) {
        Long id = (long)
                (students.size() + 1);
        students.add(
                new Student(id, name,
                        surname)
        );
        return "redirect:/students-list";
    }



}
