package com.abhishek.springbootintro.teacher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.springbootintro.student.Students;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService TeacherService;

	@RequestMapping("/teacher")
	public List<Teacher> showAllTeacher() {

		return TeacherService.getAllTeacher();
	}

	@RequestMapping("/teacher/{id}")
	public Teacher getTeacher(@PathVariable int id) {
		return TeacherService.getTeacher(id);
	}

	@RequestMapping(value = "/teacher", method = RequestMethod.POST)
	public String addTeacher(@RequestBody Teacher teacher) {
		TeacherService.addTeacher(teacher);
		return "Added sucessfully";
	}

	@RequestMapping(value = "/teacher/{id}", method = RequestMethod.PUT)
	public String updateTeacher(@RequestBody Teacher student, @PathVariable int id) {
		TeacherService.updateTeacher(id, student);
		return "Updated Sucessfully";
	}

	@RequestMapping(value = "/teacher/{id}", method = RequestMethod.DELETE)
	public String deleteTeacher(@PathVariable int id) {
		TeacherService.deleteTeacher(id);
		return "Deleted Sucessfully";
	}

}
