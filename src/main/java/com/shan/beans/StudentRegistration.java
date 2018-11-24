package com.shan.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {
	
	private List<Student> studentRecords;
	private static StudentRegistration studentRegistration = null;

	public StudentRegistration() {
		studentRecords = new ArrayList<Student>();
	}
	
	public static StudentRegistration getInstance() {
		if (studentRegistration == null) {
			studentRegistration = new StudentRegistration();
			return studentRegistration;
		} else {
			return studentRegistration;
		}
	}

	public void add(Student student) {
		studentRecords.add(student);
	}
	
	public String updateStudent(Student student) {
		for(int i=0; i<studentRecords.size(); i++) {
			Student stdnt = studentRecords.get(i);
			if(student.registrationNumber.equals(stdnt.registrationNumber)) {
				studentRecords.set(i, stdnt);
				return "Update Successfull....";
			}
		}
		return "Update un-successful";
	}
	
	public String deleteStudent(String registrationNumber) {
		for(int i=0; i<studentRecords.size(); i++) {
            Student stdn = studentRecords.get(i);
            if(stdn.getRegistrationNumber().equals(registrationNumber)){
              studentRecords.remove(i);
              return "Delete successful....";
            }
        }
		return "Delete un-successful";
	}
	
	public List<Student> getStudentRecords() {
	    return studentRecords;
	}

}
