package com.Alyssa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Alyssa.entity.Student;
import com.Alyssa.service.StudentService;

@Controller//将该类注入IOC容器，与applicationContext中的配置重合了，会报错
public class StudentController {
	@Autowired
	@Qualifier("studentService")
	//控制器依赖于service
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
