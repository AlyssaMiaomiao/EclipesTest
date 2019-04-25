package study;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
import java.util.Date;

public class study{
	/*public static void main(String[] args){
		int i=1,j=0,sum=1;
		for(j=1;j<=9;j++){
			for(i=1;i<=j;i++){
				sum=i*j;
				System.out.printf("%d*%d=%d\t",j,i,sum);
			}
			System.out.print("\n");
		}
	}*/
	public static void main(String[] args){
		/*int[] a=new int[5];
		for(int i=0;i<5;i++){
			a[i]=i;
		}
		int[] b=new int[5];
		b=Arrays.copyOf(a,5);
		for(int j=0;j<b.length;j++){
			System.out.println(b[j]);
		}*/
		int[] l={4,8,6,1,7,2}; //在Java里面，可以直接用Arrays.sort()；进行排序；
		Arrays.sort(l);
		//for(int i=0;i<a.length;i++)
		for(int i:l){
			System.out.printf("%4d",i);
		}
		/*double x=5;
		double y=Math.round(Math.sqrt(x));//Math.round()就是四舍五入的意思
		//System.out.println(y);
		double c=Math.pow(x,2);
		System.out.println(c);*/
		
		//在对字符串进行运算时，不改变字符串原来的值
		
		String e="Helloworld";
		String s=e.substring(0,3);  //string.substring(a,b)就是说a：从string的0位开始，截取3个字符
		//System .out.println(s);
		//System.out.println(e+s);
		//检查字符串是否相等，用string.equals(string1);
		String a="  i love you  ";
		String b="i love myself";
		/*if(a.equals(b)){
			System.out.println("相等");
		}
		else{
			System.out.println("不相等");
		}*/
		a.replace(a,b);
		//代码点就是acsII码
		//java 里面的api
		/*System.out.println(a.replace(a,b));
		System.out.println(a);//从这两次输出可以看出，a的值并没有发生改变·
		System.out.println(a.trim());  //删除字符串头部和尾部的空格*/
		
		Scanner in=new Scanner(System.in);//先建一个scanner
		
		/*String nextLine()是输入一行内容，String next()是输入下一个单词
		int nextInt()是输入整数,double nextDouble()是下个整数或浮点数的字符
		在Java里面也含有System.out.printf("%d",x);这种写法*/
		/*System.out.println("What's you name?");
		String name=in.nextLine();
		int age=in.nextInt();
		System.out.println(age);
		System.out.println(name);*/
		/*int[] d={1,2,3};
		for(int i :d){
			System.out.println(i);
		}*/
		/*int[] d=new int[2];
		for(int i=0;i<2;i++){
			d[i]=(int)(Math.random()*9);
		}
		for(int i :d){
			System.out.printf("%d",i);
		}*/
		
		/*int[][] m=new int[2][3];//建一个二维数组
		int x=1,i,j;
		for(i=0;i<2;i++){
			for(j=0;j<3;j++){
				m[i][j]=x;
				x++;
			}
		}
		for(int[] row:m){
			for(int value:row){
				System.out.printf("%2d",value);
			}
			System.out.printf("\n");
		}
		System.out.println(Arrays.deepToString(m));*/
		
		
		//对象和类
		//1.Date类
		System.out.println(new Date());
		/*String str2=new Date().toString();
		System.out.println(str2);
		Date birthday=new Date();
		System.out.println(birthday);*/
		
	}
}
