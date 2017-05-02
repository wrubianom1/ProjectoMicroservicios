package com.microservicios.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservicios.entidades.Student;

@RestController
@RequestMapping(value = "/rest/student")
class StudentService {

	// public static HashMap<Long, Student> hmStudent;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Student> getAllStudents() {

		List<Student> res = new ArrayList<Student>();
		Student one = new Student("John", "math");

		Student two = new Student("Jane", "history");

		res.add(two);
		res.add(one);
		return res;

	}
}