package curs18;

import static org.testng.Assert.*;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample2 {

	// 1. Hard Assertion
	// 2. Soft Assertion
	
	@Test
	public void hardAssertion() {
		System.out.println("Some code here!");
		assertTrue(false);
		System.out.println("Some other code here!"); // nu se executa niciodata -> linia 16: hard stop 
		assertEquals(12, 300);
		System.out.println("Final code here");	
	}
	
	//@Test
	public void softAsserion() {
		// smoke, sanity -> light testing (merg butoanele etc...)
		System.out.println("Some code here!");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(false);
		System.out.println("Some other code here!"); // lasa sa se execute 
		sa.assertEquals(12, 300);
		System.out.println("Final code here");	
		sa.assertAll(); //imi spune ce nu a functionat, chemat intotdeauna pentru partea de validare  
	}
	
	
}
