package com.abhishek.springbootintro.student;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.abhishek.springbootintro.teacher.Teacher;

public interface StudentsRepository extends CrudRepository<Students , Integer>{

}
