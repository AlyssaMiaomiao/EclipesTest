package com.Alyssa.entity;

public class Student {
	//构建一个无参的构造方法和一个参的构造方法
	public Student() {};
	public Student(String stuID, String stuName, String stuPaw,String stuSex, int stuAge, String stuJgV, String stuDept) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuAge = stuAge;
		this.stuJgV = stuJgV;
		this.stuDept = stuDept;
		this.stuPaw=stuPaw;
	}
	private String stuID;
	private String stuName;
	private String stuPaw;
	private String stuSex;
	private int stuAge;
	private String stuJgV;
	private String stuDept;
	public String getStuID() {
		return stuID;
	}
	public void setStuID(String stuID) {
		this.stuID = stuID;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuPaw() {
		return stuPaw;
	}
	public void setStuPaw(String stuPaw) {
		this.stuPaw = stuPaw;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public String getStuJgV() {
		return stuJgV;
	}
	public void setStuJgV(String stuJgV) {
		this.stuJgV = stuJgV;
	}
	public String getStuDept() {
		return stuDept;
	}
	public void setStuDept(String stuDept) {
		this.stuDept = stuDept;
	}
	@Override
	public String toString() {
		return "Student [stuID=" + stuID + ", stuName=" + stuName+",stuPaw="+stuPaw + ", stuSex=" + stuSex + ", stuAge=" + stuAge
				+ ", stuJgV=" + stuJgV + ", stuDept=" + stuDept + "]";
	}
	
}
