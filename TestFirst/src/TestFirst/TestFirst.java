package TestFirst;

public class TestFirst {
	//外国乘客用1表示，国内乘客用0表示，
	//残疾乘客用3，正常乘客用4表示表示,
	//头等舱用10表示，其它舱用11表示
		//在这里，weight代表行李的重量，type代表乘客的舱位，mes代表乘客的身体信息,country代表国籍
	
		public int calculate(double weight, double type, double mes ,double country) {
			int money=0;
			if(weight<30){
				return 0;
			}else{
				int w=(int)Math.ceil(weight-30);	//这里表示不满1kg按1kg计算
				if((type==10)&&(country==0)&&(mes==4)){	//这里表示头等舱的国内正常乘客
					money=w*4;
				}
				if((type==10)&&(country==0)&&(mes==3)){	//这里表示头等舱的国内残疾乘客
					money=w*2;
				}
				if((type==10)&&(country==1)&&(mes==4)){	//这里表示头等舱的国外正常乘客
					money=w*4;
				}
				if((type==10)&&(country==1)&&(mes==3)){	//这里表示头等舱的国外残疾乘客
					money=w*4;
				}
				if((type==11)&&(country==0)&&(mes==4)){	//这里表示其它舱的国内正常乘客
					money=w*6;
				}
				if((type==11)&&(country==0)&&(mes==3)){	//这里表示其它舱的国内残疾乘客
					money=w*3;
				}
				if((type==11)&&(country==1)&&(mes==4)){	//这里表示其它舱的国外正常乘客
					money=w*12;
				}
				if((type==11)&&(country==1)&&(mes==3)){	//这里表示其它舱的国外残疾乘客
					money=w*6;
				}
				
			}
			
			return money;
		}

		/**
		 * @param args
		 */

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			TestFirst to=new TestFirst();
			double array[][]= {{35.5, 10, 4, 0},{35.5, 10, 3, 0},{35.5, 10, 4, 1},{35.5, 10, 3, 1},
					{35.5, 11, 4, 0},{35.5, 11, 3, 0},{35.5, 11, 4, 1},{35.5, 11, 3, 1}};
			for(int i=0;i<array.length;i++) {
				
					System.out.println(to.calculate(array[i][0], array[i][1],array[i][2], array[i][3]));
				
			}
			
		}
}

