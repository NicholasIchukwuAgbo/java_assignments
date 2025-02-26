import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
  
public class SimpleCalculatorTest{

	@Test 
	public void testThatCalculatorCanAddTwoNumber(){

		//precondition
		SimpleCalculator myCalculator = new SimpleCalculator();

		//Action
		int sum = myCalculator.add(2, 4);

		//Check/Assert
		assertEquals(6, sum);

		//Refactor proccess
		//assertEqualsIs(6, myCalculator.add(6, sum));

	}
	/*
	@Test 
	public void testThatCalculatorCanSubtractTwoNumber(){

	SimpleCalculator myCalculator = new SimpleCalculator();

	int subtract = myCalculator.sub(10, 5);

	assertEquals(5 , subtract);


	}*/


}