package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RunTest {
	@Test // check if FindBig() method returns right results
	public void runFindBig() {
		//assertequals check if first argument is equal to 2nd
		assertEquals(200,Calculator.findBig(100, 200)) ;
	}
	
	@Test // check if FindBig() method returns right results
	public void runFindSmall() {
		//assertequals check if first argument is equal to 2nd
		assertEquals(10,Calculator.findSmall(10, 20));
	}
}


