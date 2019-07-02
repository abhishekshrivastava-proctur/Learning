package com.abhishek.springbootintro.teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhishek.springbootintro.student.Students;

@Service
public class TeacherService {
	@Autowired
	private TeacherRepository teacherRepository;


	public List<Teacher> getAllTeacher() {
//		return allStudents;
		List<Teacher> teachers = new ArrayList<>();
		teacherRepository.findAll()
		.forEach(teachers::add);
		return teachers;
	}

	public Teacher getTeacher(Integer id) {
//		return allStudents.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return teacherRepository.findById(id).orElse(null);
	}

	public void addTeacher(Teacher teacher) {
//		allStudents.add(student);
		teacherRepository.save(teacher);
	}

	public void updateTeacher(int id, Teacher teacher) {
		/*for (int i = 0; i < allStudents.size(); i++) {
			Students t = allStudents.get(i);
			if (t.getId().equals(id)) {
				allStudents.set(i, student);
			}
		}*/
		teacherRepository.save(teacher);
	}

	public void deleteTeacher(int id) {
//		allStudents.removeIf(t -> t.getId().equals(id));
		teacherRepository.deleteById(id);
	}

	
	
}