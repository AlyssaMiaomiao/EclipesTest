package Compare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Stuff{
	protected String number;
	protected String arriveTime;
	protected String leaveTime;
	public Stuff()
	{
	}
	public Stuff(String number, String arriveTime, String leaveTime){
		this.number=number;
		this.arriveTime=arriveTime;
		this.leaveTime=leaveTime;
	}
}


public class Main {
	public static void main(String[] args){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n;
		try {
			n = Integer.parseInt(in.readLine());
			Stuff[] stuff=new Stuff[n];
			for(int i=0;i<n;i++){
				stuff[i] = new Stuff();
				String[] time = in.readLine().split(" ");
				stuff[i].number=time[0];
				stuff[i].arriveTime=time[1];
				stuff[i].leaveTime=time[2];
			}
			String[] arr1=new String[n];
			String[] arr2=new String[n];
			String str1="",str2="";
			for(int i=0;i<n;i++){
				arr1[i]=stuff[i].arriveTime;
				arr2[i]=stuff[i].leaveTime;
			}
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int j=0;j<stuff.length;j++){
				if(stuff[j].arriveTime.equals(arr1[0])){
					str1=stuff[j].number;
				}
				if(stuff[j].leaveTime.equals(arr2[arr2.length-1])){
					str2=stuff[j].number;
				}
			}
			System.out.println(str1+" "+str2);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

