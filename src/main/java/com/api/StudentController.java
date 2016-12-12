package com.api;

import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Marcin on 12.12.2016.
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;



}
