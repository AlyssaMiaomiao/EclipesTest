package BIgInt;

import java.util.Scanner;

public class AddAndReduceZero {
	public static void main(String[] args) {
		String s1="111110";
		String s2="11111";
		Scanner in=new Scanner(System.in);
		System.out.print("please input number:");
		String s=in.next();
		
		//add 0
		System.out.print("��0��");
		String s3=s.replace(s2, s1);
		System.out.println(s3);
		
		//reduce 0
		System.out.print("ȥ0��");
		String s4=s3.replace(s1, s2);
		System.out.println(s4);

	}

}
