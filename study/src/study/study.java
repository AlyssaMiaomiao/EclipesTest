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
		int[] l={4,8,6,1,7,2}; //��Java���棬����ֱ����Arrays.sort()����������
		Arrays.sort(l);
		//for(int i=0;i<a.length;i++)
		for(int i:l){
			System.out.printf("%4d",i);
		}
		/*double x=5;
		double y=Math.round(Math.sqrt(x));//Math.round()���������������˼
		//System.out.println(y);
		double c=Math.pow(x,2);
		System.out.println(c);*/
		
		//�ڶ��ַ�����������ʱ�����ı��ַ���ԭ����ֵ
		
		String e="Helloworld";
		String s=e.substring(0,3);  //string.substring(a,b)����˵a����string��0λ��ʼ����ȡ3���ַ�
		//System .out.println(s);
		//System.out.println(e+s);
		//����ַ����Ƿ���ȣ���string.equals(string1);
		String a="  i love you  ";
		String b="i love myself";
		/*if(a.equals(b)){
			System.out.println("���");
		}
		else{
			System.out.println("�����");
		}*/
		a.replace(a,b);
		//��������acsII��
		//java �����api
		/*System.out.println(a.replace(a,b));
		System.out.println(a);//��������������Կ�����a��ֵ��û�з����ı䡤
		System.out.println(a.trim());  //ɾ���ַ���ͷ����β���Ŀո�*/
		
		Scanner in=new Scanner(System.in);//�Ƚ�һ��scanner
		
		/*String nextLine()������һ�����ݣ�String next()��������һ������
		int nextInt()����������,double nextDouble()���¸������򸡵������ַ�
		��Java����Ҳ����System.out.printf("%d",x);����д��*/
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
		
		/*int[][] m=new int[2][3];//��һ����ά����
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
		
		
		//�������
		//1.Date��
		System.out.println(new Date());
		/*String str2=new Date().toString();
		System.out.println(str2);
		Date birthday=new Date();
		System.out.println(birthday);*/
		
	}
}
