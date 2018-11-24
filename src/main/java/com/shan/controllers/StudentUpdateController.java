package com.shan.controllers;

/**
 * The controller classes to handle PUT requests
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

@Controller
public class StudentUpdateController {
	@RequestMapping( method = RequestMethod.PUT, value = "/update/student")
	
	@ResponseBody
	public String updateStudentRecord(@RequestBody Student stdn) {
	System.out.println("In updateStudentRecord");   
	    return StudentRegistration.getInstance().updateStudent(stdn);
	}

}
