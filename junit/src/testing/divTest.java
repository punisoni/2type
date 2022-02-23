package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class divTest {

	@Test
	public void test() {
		div d1 =new div();
        int output= div.div(10,5);
		  assertEquals(2,output);

	}

}
