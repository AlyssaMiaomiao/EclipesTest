package TestFirst;

public class TestFirst {
	//����˿���1��ʾ�����ڳ˿���0��ʾ��
	//�м��˿���3�������˿���4��ʾ��ʾ,
	//ͷ�Ȳ���10��ʾ����������11��ʾ
		//�����weight���������������type����˿͵Ĳ�λ��mes����˿͵�������Ϣ,country�������
	
		public int calculate(double weight, double type, double mes ,double country) {
			int money=0;
			if(weight<30){
				return 0;
			}else{
				int w=(int)Math.ceil(weight-30);	//�����ʾ����1kg��1kg����
				if((type==10)&&(country==0)&&(mes==4)){	//�����ʾͷ�ȲյĹ��������˿�
					money=w*4;
				}
				if((type==10)&&(country==0)&&(mes==3)){	//�����ʾͷ�ȲյĹ��ڲм��˿�
					money=w*2;
				}
				if((type==10)&&(country==1)&&(mes==4)){	//�����ʾͷ�ȲյĹ��������˿�
					money=w*4;
				}
				if((type==10)&&(country==1)&&(mes==3)){	//�����ʾͷ�ȲյĹ���м��˿�
					money=w*4;
				}
				if((type==11)&&(country==0)&&(mes==4)){	//�����ʾ�����յĹ��������˿�
					money=w*6;
				}
				if((type==11)&&(country==0)&&(mes==3)){	//�����ʾ�����յĹ��ڲм��˿�
					money=w*3;
				}
				if((type==11)&&(country==1)&&(mes==4)){	//�����ʾ�����յĹ��������˿�
					money=w*12;
				}
				if((type==11)&&(country==1)&&(mes==3)){	//�����ʾ�����յĹ���м��˿�
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

