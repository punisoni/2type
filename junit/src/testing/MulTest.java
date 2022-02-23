package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class MulTest 
{

	@Test
	public void test() 
	{
		Mul m1=new Mul();
		int output=Mul.multiply(10,5);
		  assertEquals(50,output);

		
		
	}

}
