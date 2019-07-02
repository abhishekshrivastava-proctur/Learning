package com.abhishek.springbootintro.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhishek.springbootintro.teacher.Teacher;

@Service
public class StudentsService {
	@Autowired
	private StudentsRepository studentsRepository;


	public List<Students> getAllStudents() {
//		return allStudents;
		List<Students> students = new ArrayList<>();
		studentsRepository.findAll()
		.forEach(students::add);
		return students;
	}

	public Students getStudent(Integer id) {
//		return allStudents.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return studentsRepository.findById(id).orElse(null);
	}

	public void addStudents(Students student) {
//		allStudents.add(student);
		studentsRepository.save(student);
	}

	public void updateStudent(int id, Students student) {
		/*for (int i = 0; i < allStudents.size(); i++) {
			Students t = allStudents.get(i);
			if (t.getId().equals(id)) {
				allStudents.set(i, student);
			}
		}*/
		studentsRepository.save(student);
	}

	public void deleteStudent(int id) {
//		allStudents.removeIf(t -> t.getId().equals(id));
		studentsRepository.deleteById(id);
	}
	
	public Students getStudent(int teacherId, int studentId) {
		Students student = new Students(studentId);
		return student;
	}
	
}
