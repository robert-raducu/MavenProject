package curs17;

import org.testng.annotations.Test;

@Test //va marca toate metodele clasei de test, nu mai ruleaza metode private
public class TestAnnotationExample {

	//@Test // ruleaza metoda indiferent de AccessModifier ul metodei 
	public void test1() {
		System.out.println("Test 1");
	}
	
	//@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test //asta este un testcase practic
	private void test3() {
		System.out.println("Test 3");
	}
}
