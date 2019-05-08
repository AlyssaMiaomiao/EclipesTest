package com.Alyssa.test;

import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Alyssa.entity.Student;
import com.Alyssa.service.StudentService;

public class Testing {
	public static void main(String[] args) throws IOException{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService studentService=(StudentService) context.getBean("studentService");
		//测试注册一个用户
		/*Student student=new Student();
		student.setStuID("sp006");
		student.setStuName("aa");
		student.setStuPaw("157");
		studentService.insertStudent(student);
		//studentService.deleteStudent("sp009");*/
		System.out.println("########################################"+studentService.findStudent("aa").getStuID());
		List<Student> list=studentService.findAll();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getStuName());
		}
	}
}
