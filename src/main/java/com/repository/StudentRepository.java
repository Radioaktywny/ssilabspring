package com.repository;

import com.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Marcin on 12.12.2016.
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}
