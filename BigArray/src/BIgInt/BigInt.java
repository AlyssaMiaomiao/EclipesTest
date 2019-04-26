package BIgInt;

//����100λ���ڵĴ���������,��ʱ�����Ƿ���λ
public class BigInt {
	//��Ա����
	private static final int MAX_BIT_COUNT=100;
	/**�������100λ�Ĵ�������λ��ֵ*/
	private int[] value=new int[MAX_BIT_COUNT];
	/**��Ч��λ��*/
	private int length=1;

	//���캯��
	//Ĭ�ϵĹ��캯������ʼ��Ϊ��ֵ0
	public BigInt(){
		
	}
	
	public int getLength(){
		int i=0;
		for(i=0;i<MAX_BIT_COUNT;i++){//�ҵ������е�һ��������±�
			if(this.value[i]!=0){
				break;
			}	
		}
		return Math.max(MAX_BIT_COUNT-i, 1);//�κ�һ����������Чλ������1
	}
	//���캯��������һ���ַ���������һ��������
	public BigInt(String strValue){
		for(int i=0;i<Math.min(strValue.length(),MAX_BIT_COUNT);i++){
			/**
			 * ���ַ����ĳ��ȳ���100ʱ����ȡǰ100λ
			 */
			if(Character.isDigit(strValue.charAt(i))){
				//����ַ�����������˷���ֵ���ַ����򽫴�������Ϊ0������ʾ����
				this.value[MAX_BIT_COUNT-strValue.length()+i]=strValue.charAt(i)-'0';
			}
			else{
				System.out.println("��ʼ���쳣����������Ϊ0");
				this.value=new int[MAX_BIT_COUNT];
				break;
			}
		}
		this.length=getLength();
	}
	/**
	 *���캯��������һ��������ֵ������һ��������
	 */
	public BigInt(int value){
		this(Integer.toString(value));
	}
	
	public BigInt(long value){
		this(Long.toString(value));
	}
	
	public BigInt(int[] value){
		this.value=value;
		this.length=getLength();
	}
	//��Ա����
	/**
	 *��дtoString()����
	 */
	public String toString(){
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<this.length;i++){
			sb.append(this.value[MAX_BIT_COUNT-this.length+i]);
		}
		return sb.toString();
	}
	
	/**
	 * ���������������ļӷ�
	 * @param bi ����
	 * @return �ӷ��Ľ��
	 */
	public BigInt add(BigInt bi){
		BigInt res=new BigInt();
		int carry=0;
		int value=0;
		for(int i=0;i<(Math.max(this.length,bi.length)+1);i++){
			int bit=MAX_BIT_COUNT-1-i;
			value=this.value[bit]+bi.value[bit]+carry;
			res.value[bit]=value%10;
			carry=value/10;
		}
		res.length=res.getLength();
		return res;
	}
	
	
	public BigInt substract(BigInt bi){
		BigInt res =new BigInt();
		int carry=0;
		int value=0;
		int bit=0;
		for(int i=0;i<Math.max(this.length,bi.length)+1;i++){
			bit=MAX_BIT_COUNT-1-i;
			value=this.value[bit]-bi.value[bit]+carry;
			if(value<0){
				carry=-1;
			}
			else{
				carry=0;
			}
			res.value[bit]=(value+10)%10;
		}
		res.length=res.getLength();
		return res;
	}
	
	public int compare(BigInt bi){
		if(this==bi){
			return 0;
		}
		if(this.length>bi.length){
			return 1;
		}
		if(this.length<bi.length){
			return -1;
		}
		for(int i=0;i<this.length;i++){
			int bit=MAX_BIT_COUNT-this.length+i;
			if(this.value[bit]>bi.value[bit]){
				return 1;
			}
			if(this.value[bit]<bi.value[bit]){
				return -1;
			}
		}
		return 0;
	}
	/**
	 * ���������������ĳ˷�
	 * @param bi ����
	 * @return �˷��Ľ��
	 */
	public BigInt multiply(BigInt bi){
		BigInt res= new BigInt();
		
		int bit=0;
		for(int i=0;i<this.length;i++){
			int carry=0;
				bit=MAX_BIT_COUNT-i-1;
			for(int j=0;j<bi.length;j++){
				int value=this.value[MAX_BIT_COUNT-i-1]*bi.value[MAX_BIT_COUNT-j-1]+carry;
				res.value[bit]+=value;
				carry=res.value[bit]/10;
				res.value[bit]%=10;
				bit--;
			}
			res.value[bit]=carry;
		}
		res.length=res.getLength();
		return res;
	}
}
