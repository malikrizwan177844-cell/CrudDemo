package com.example.CrudSpringBootDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.CrudSpringBootDemo.entity.Student;

@Component
public interface StudentRepository extends JpaRepository<Student ,Long>{

}
