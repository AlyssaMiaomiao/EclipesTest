package TestFirst;

import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Test;

@RunWith(Parameterized.class )
public class TestFirstTest {
	private static final Object[] String = null;
	private static TestFirst testFirst=new TestFirst();
	private double weight;
	private double type;
	private double mes;
	private double country;
	private double result;
	@Parameters
	public   static  Collection data()  {
	    return  Arrays.asList(new  Object[][]{{35.5, 10, 4, 0,24},{35.5, 10, 3, 0,12},{35.5, 10, 4, 1,24},{35.5, 10, 3, 1,24},
				{35.5, 11, 4, 0,36},{35.5, 11, 3, 0,18},{35.5, 11, 4, 1,72},{35.5, 11, 3, 1,36}} );
	}
	
	// 构造函数，对变量进行初始化 
    public  TestFirstTest( double weight, double type, double mes ,double country, double result)  {
        this.weight = weight;
        this.type = type;
        this.mes = mes;
        this.country = country;
        this.result =result;
   } 
	@Test
	public void testCalculate() {
		assertEquals(result,testFirst.calculate(weight,type,mes,country),0);
	}

}

