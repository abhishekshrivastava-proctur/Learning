package com.abhishek.springbootintro.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.springbootintro.teacher.Teacher;

@RestController
@RequestMapping("/students")
public class StudentsController {

	@Autowired
	private StudentsService StudentsService;

	@RequestMapping("/students")
	public List<Students> showAllStudents() {

		return StudentsService.getAllStudents();
	}

	@RequestMapping("/students/{id}")
	public Students getStudent(@PathVariable int id) {
		return StudentsService.getStudent(id);
	}

	@RequestMapping(value = "/students", method = RequestMethod.POST)
	public String addStudents(@RequestBody Students student) {
		StudentsService.addStudents(student);
		return "Added sucessfully";
	}

	@RequestMapping(value = "/students/{id}", method = RequestMethod.PUT)
	public String updateStudent(@RequestBody Students student, @PathVariable int id) {
		StudentsService.updateStudent(id, student);
		return "Updated Sucessfully";
	}

	@RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
	public String deleteStudent(@PathVariable int id) {
		StudentsService.deleteStudent(id);
		return "Deleted Sucessfully";
	}
	
}
