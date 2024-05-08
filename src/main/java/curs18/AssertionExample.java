package curs18;

import static org.testng.Assert.assertEquals;

import org.testng.TestException;
import org.testng.annotations.Test;

public class AssertionExample {

	// Test -> inchida cu assertion(Expected/ Actual)  
	String actualText = "text";
	String expectedText = "alt text";
	
	@Test
	public void checkEquality() {
		
		if(expectedText.equals(actualText)) {
			
			System.out.println(" Test passed!");
		}else {
			System.out.println("Test failed");
			throw new TestException("Expected " + expectedText + 
					" but found " + actualText);
		}
		
	}
	
	@Test
	public void checkEquality2() {
		assertEquals(expectedText, actualText); //aceeasi implementare cu cea de mai sus 
	}
	
	
}
