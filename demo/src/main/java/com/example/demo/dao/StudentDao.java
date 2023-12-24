package com.example.demo.dao;

import com.example.demo.model.Student;
import org.hibernate.mapping.Collection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository <Student, Long>{
    Collection findByEmail(String email);
}
