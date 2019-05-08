package com.Alyssa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Alyssa.entity.Student;
import com.Alyssa.service.StudentService;

@Controller//������ע��IOC��������applicationContext�е������غ��ˣ��ᱨ��
public class StudentController {
	@Autowired
	@Qualifier("studentService")
	//������������service
	private StudentService studentService;
	@RequestMapping("queryStudentByName/{stuName}")
	public String queryStudentByName(@PathVariable("stuName") String stuName) {
		Student student=new Student();
		student=studentService.findStudent(stuName);
		System.out.println(student.getStuPaw());
		return "result";
	}
	@RequestMapping("query")
	public String query() {
		return "result";
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
}
