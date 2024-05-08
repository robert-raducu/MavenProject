package curs18;

import org.testng.annotations.*;

public class BeforeAfterAnnotations {

	// principiul de setup tear-down
	// set-up testului in sine
	@BeforeSuite //inainte de orice , ex: suita = 7 pachete de teste
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	
	// tear-down (readuc mediul in momentul de dinainte)
	@AfterSuite // ultimul 
	public void afterSuite() {
		System.out.println("After suite");
	}
	
	@BeforeTest //ce vreau sa grupez intr o executie de tip Test 
	public void beforeTest() {
		System.out.println("Before test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}
	
	@BeforeClass // inaintea fiecarei clase
	public void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	
}
