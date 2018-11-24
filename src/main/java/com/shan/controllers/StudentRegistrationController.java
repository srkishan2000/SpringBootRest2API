package com.shan.controllers;

/**
 * Using the POST request, 
 * we will add student information into our application. In spring’s approach to build a RESTful web services, HTTP requests are handled by a controller. 
 * Controller classes/components are easily identified by the @RestController annotation, and the below StudentRetrieveController will handle GET requests 
 * for /student/allstudent by returning a list of Student class objects in JSON format.
 * 
 * @author shan
 *
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shan.beans.Student;
import com.shan.beans.StudentRegistration;
import com.shan.beans.StudentRegistrationReply;

@Controller
public class StudentRegistrationController {
	@RequestMapping(method = RequestMethod.POST, value = "/register/student")
	
	@ResponseBody
	public StudentRegistrationReply registerStudent(@RequestBody Student student) {
		System.out.println("In registerStudent");
		
        StudentRegistrationReply stdRegReply = new StudentRegistrationReply();           
        StudentRegistration.getInstance().add(student);
        //We are setting the below value just to reply a message back to the caller
        stdRegReply.setName(student.getName());
        stdRegReply.setAge(student.getAge());
        stdRegReply.setRegistrationNumber(student.getRegistrationNumber());
        stdRegReply.setRegistrationStatus("Successful");
        return stdRegReply;
	}
	
}
