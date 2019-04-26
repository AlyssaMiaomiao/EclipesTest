package BIgInt;

//计算100位以内的大整数运算,暂时不考虑符号位
public class BigInt {
	//成员变量
	private static final int MAX_BIT_COUNT=100;
	/**用来存放100位的大整数各位的值*/
	private int[] value=new int[MAX_BIT_COUNT];
	/**有效的位数*/
	private int length=1;

	//构造函数
	//默认的构造函数，初始化为数值0
	public BigInt(){
		
	}
	
	public int getLength(){
		int i=0;
		for(i=0;i<MAX_BIT_COUNT;i++){//找到数组中第一个非零的下标
			if(this.value[i]!=0){
				break;
			}	
		}
		return Math.max(MAX_BIT_COUNT-i, 1);//任何一个大整数有效位至少是1
	}
	//构造函数：根据一个字符串来创造一个大整数
	public BigInt(String strValue){
		for(int i=0;i<Math.min(strValue.length(),MAX_BIT_COUNT);i++){
			/**
			 * 当字符串的长度超过100时，截取前100位
			 */
			if(Character.isDigit(strValue.charAt(i))){
				//如果字符串里面出现了非数值的字符，则将大整数置为0，并提示错误
				this.value[MAX_BIT_COUNT-strValue.length()+i]=strValue.charAt(i)-'0';
			}
			else{
				System.out.println("初始化异常，大整数置为0");
				this.value=new int[MAX_BIT_COUNT];
				break;
			}
		}
		this.length=getLength();
	}
	/**
	 *构造函数：根据一个整数的值来创建一个大整数
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
	//成员函数
	/**
	 *重写toString()方法
	 */
	public String toString(){
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<this.length;i++){
			sb.append(this.value[MAX_BIT_COUNT-this.length+i]);
		}
		return sb.toString();
	}
	
	/**
	 * 计算两个大整数的加法
	 * @param bi 加数
	 * @return 加法的结果
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
	 * 计算两个大整数的乘法
	 * @param bi 乘数
	 * @return 乘法的结果
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
