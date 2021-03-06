package com.example.SpringData.dao;

import com.example.SpringData.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Brave on 16/10/12.
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByStudentName(String name);

}

