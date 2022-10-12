package Com;

import org.junit.Assert;.assertEquals;

import unit.Test;

import unit.Calculator;

public class TestPayment {
	@Test //check if FindBig() method returns right results
	public void runFindBiggest() {
		//assetequals check if first argument is equal to 2nd args
		assetEquals(100,Calculator.findBiggest(10,20,15));
	}

	@Test //check if FindBig() method returns right results
	public void runFindMax() {
		int[] myArray= {100,20,30,1500,400};
		assrtEquals(340,Calculator.findMax(myArray));
	
		
	}

}
