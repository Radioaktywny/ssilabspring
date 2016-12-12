package com.service;

import com.domain.Student;
import com.repository.StudentRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Marcin on 12.12.2016.
 */

@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findOne(Long id) throws EmptyResultDataAccessException {
        try {
            return studentRepository.findOne(id);
        } catch (Exception e) {
            throw new RuntimeException(getError(id));
        }
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void remove(Long id) throws EmptyResultDataAccessException {
        try {
            studentRepository.delete(id);
        } catch (EmptyResultDataAccessException e) {
            throw new RuntimeException(getError(id));
        }
    }

    private String getError(Long id) {
        return "Student with id " + id + "does not exists";
    }
}
