package com.api;

import com.domain.Student;
import com.service.StudentService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Marcin on 12.12.2016.
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView save(@Valid Student student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("/student", modelMapWithStudent(student));
        }
        studentService.save(student);
        return new ModelAndView("show", modelMapWithAllStudents());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/new")
    public ModelAndView createStudent() {
        return new ModelAndView("/student", modelMapWithNewStudent());
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showStudents(HttpServletRequest request) {
        request.setAttribute("students", studentService.findAll());
        return "show";
    }

    @RequestMapping(value = "/edit/{id}")
    public ModelAndView editStudent(@PathVariable Long id) throws NotFoundException {
        return new ModelAndView("student", modelMapWithOneStudent(id));
    }

    @RequestMapping(value = "/delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id, HttpServletRequest request) {
        studentService.remove(id);
        request.setAttribute("students", studentService.findAll());
        return "show";
    }

    private ModelMap modelMapWithNewStudent() {
        return modelMapWithStudent(new Student());
    }

    private ModelMap modelMapWithOneStudent(Long studentId) throws NotFoundException {
        return modelMapWithStudent(studentService.findOne(studentId));
    }

    private ModelMap modelMapWithStudent(Student student) {
        ModelMap map = new ModelMap();
        map.put("student", student);
        return map;
    }

    private ModelMap modelMapWithAllStudents() {
        List<Student> allStudents = studentService.findAll();
        ModelMap map = new ModelMap();
        map.put("students", allStudents);
        return map;
    }


}
