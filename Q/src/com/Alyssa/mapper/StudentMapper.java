package com.Alyssa.mapper;

import java.util.List;

import com.Alyssa.entity.Student;

public interface StudentMapper {
	//对student信息的注册，也就是插入student信息
	public int insertStudent(Student student);
	//登录时，对student信息的查询，传入参数为stuName，返回password
	public Student findStudent(String stuName);
	//在index页面的时候，显示所有的信息
	public List<Student> findAll();
	//这个方法用于修改学生信息
	public int updateStudent(Student student);
	public int deleteStudent(String stuID);
	
}
