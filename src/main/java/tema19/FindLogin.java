package tema19;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class FindLogin extends BaseTest{

	@Test(priority = 1)
	public void openAndTestLoginButton() {
		
		WebElement loginButton = driver.findElement(By.linkText("Login"));
		WebElement email = driver.findElement(By.id("log"));
		WebElement pass = driver.findElement(By.id("password"));
        assertFalse(email.isDisplayed()); //verifica ca nu apare partea acea de email
        assertFalse(pass.isDisplayed());
		loginButton.click(); // exista in DOM, dar nu vizibile, deci le pot declara mai sus 
		//WebElement password = driver.findElement(By.id("password"));
		assertTrue(email.isDisplayed());
		assertTrue(pass.isDisplayed());
	}
}
