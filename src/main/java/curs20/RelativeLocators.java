package curs20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class RelativeLocators extends BaseTest{

	/*
	 * toLeftOf
	 * toRightOf
	 * above
	 * below
	 * near
	 * 
	 */
	@Test
	public void relativeLocatorsExample() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//toLeftOf
		WebElement price = driver.findElement
				(RelativeLocator.with(By.cssSelector("h5[class*='sc_title_regular']")).toLeftOf(
						By.linkText("Life in the garden")));
		
		js.executeScript("arguments[0].setAttribute('style', 'border:10px solid green')", 
				price);
		
		
		//toRightOf
		WebElement price2 = driver.findElement
				(RelativeLocator.with(By.cssSelector("h5[class*='sc_title_regular']")).toRightOf(
						By.linkText("Life in the garden")));
		
		js.executeScript("arguments[0].setAttribute('style', 'border:10px solid purple')", 
				price2);
		
		
		WebElement author = driver.findElement
				(RelativeLocator.with(By.cssSelector("div[class='wpb_wrapper']")).above(price));
		js.executeScript("arguments[0].setAttribute('style', 'border:10px solid blue')", 
				author);
	}
}
