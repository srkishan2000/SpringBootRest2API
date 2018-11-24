package com.shan.controllers;

/**
 * The GET request, we will retrieve all Student Registration information,
 * In spring’s approach to build a RESTful web services, HTTP requests are handled by a controller. Controller classes/components are easily 
 * identified by the @RestController annotation, and the below StudentRetrieveController will handle GET requests for /student/allstudent 
 * by returning a list of Student class objects in JSON format.
 * 
 * @author shan
 */
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shan.beans.Student;
import com.shan.beans.StudentRegistration;

@Controller
public class StudentRetrieveController {
	@RequestMapping(method = RequestMethod.GET, value = "/student/allstudent")
	
	@ResponseBody
	public List<Student> getAllStudents() {
		return StudentRegistration.getInstance().getStudentRecords();
	}
	
}
