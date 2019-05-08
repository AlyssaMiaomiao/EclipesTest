package com.Alyssa.mapper;

import java.util.List;

import com.Alyssa.entity.Student;

public interface StudentMapper {
	//��student��Ϣ��ע�ᣬҲ���ǲ���student��Ϣ
	public int insertStudent(Student student);
	//��¼ʱ����student��Ϣ�Ĳ�ѯ���������ΪstuName������password
	public Student findStudent(String stuName);
	//��indexҳ���ʱ����ʾ���е���Ϣ
	public List<Student> findAll();
	//������������޸�ѧ����Ϣ
	public int updateStudent(Student student);
	public int deleteStudent(String stuID);
	
}
