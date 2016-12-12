package com.service;

import com.domain.Student;
import javassist.NotFoundException;

import java.util.List;

/**
 * Created by Marcin on 12.12.2016.
 */
public interface StudentService {

    List<Student> findAll();

    Student findOne(Long id)throws NotFoundException;

    Student save(Student student);

    void remove(Student student)throws NotFoundException;

}
