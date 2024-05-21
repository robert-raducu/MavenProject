package curs23;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class ExplicitWait extends BaseTest{

	@Test
	public void explicitWaitExample() {
		
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div[id='start']>button")).click();	
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div[id='finish']>h4"), "Hello World!"));
				
		//Thread.sleep(10000); //bad practice
				
		WebElement finishText = driver.findElement(By.cssSelector("div[id='finish']>h4"));
		assertEquals(finishText.getText(),"Hello World!");
	}
}
