package com.Alyssa.serviceImpl;

import java.util.List;

import com.Alyssa.entity.Student;
import com.Alyssa.mapper.StudentMapper;
import com.Alyssa.service.StudentService;

public class StudentServiceImpl implements StudentService {
	StudentMapper studentMapper;
	@Override
	public int insertStudent(Student student) {
		// TODO Auto-generated method stub
		studentMapper.insertStudent(student);
		return 0;
	}

	@Override
	public Student findStudent(String stuName) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student=studentMapper.findStudent(stuName);
		return student;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> list=studentMapper.findAll();
		return list;
	}

	@Override
	public int updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentMapper.updateStudent(student);
		return 0;
	}

	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}
	public int deleteStudent(String stuID) {
		studentMapper.deleteStudent(stuID);
		return 0;
	}

}
