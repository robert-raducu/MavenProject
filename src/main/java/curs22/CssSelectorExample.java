package curs22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class CssSelectorExample extends BaseTest{

	//@Test
	public void cssExample1() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//direct child 
		driver.findElement(By.cssSelector("li[class='menu_user_login']>a[href='#popup_login']")).click();
		
		//descendant -> intre elementul parinte si elementul descendant
		//punem un caracter spatiu
		
		WebElement username = driver.findElement(By.cssSelector("ul[id='menu_user'] input[name='log']"));
		
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				username);
		
		
		WebElement pass = driver.findElement(By.cssSelector("ul#menu_user form.login_form>div>input[name='pwd']"));
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				pass);
		
		
		//NOT
		WebElement submitButton = driver.findElement(By.cssSelector("ul form[name='login_form'] "
				+ "input:not([type='text'],[type='password'],[type='hidden'],[type='checkbox'])"));
		
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				submitButton);
	}
	
	//@Test
	public void cssSelectorExample2() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//first-of-type
		WebElement newReleasesMenu = driver.findElement(By.cssSelector("ul[class*='sc_tabs_titles']"
				+ ">li:first-of-type"));
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				newReleasesMenu);
		
		//nth-of-type
		
		WebElement comingSoon = driver.findElement(By.cssSelector("ul[class*='sc_tabs_titles']"
				+ ">li:nth-of-type(2)"));
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				comingSoon);
		
		WebElement bestSellers = driver.findElement(By.cssSelector("ul[class*='sc_tabs_titles']"
				+ ">li:nth-of-type(3)"));
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				bestSellers);
		
		//last-of-type
		WebElement awardWinners = driver.findElement(By.cssSelector("ul[class*='sc_tabs_titles']"
				+ ">li:last-of-type"));
		js.executeScript("arguments[0].setAttribute('style', 'background:blue ;border:10px solid red')", 
				awardWinners);
	}
	
	@Test
	public void cssSelectorExample3() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.findElement(By.cssSelector("div[class='menu_main_wrap'] a[href*='shop/']")).click();
		
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 1250).perform();
		
		//first-child
		WebElement category1 = driver.findElement(By.cssSelector("ul[class='product-categories']>li:first-child"));
		
		js.executeScript("arguments[0].setAttribute('style', 'background:blue ;border:10px solid red')", 
				category1);
		
		
		//last-child
        WebElement category11 = driver.findElement(By.cssSelector("ul[class='product-categories']>li:last-child"));
		
		js.executeScript("arguments[0].setAttribute('style', 'background:blue ;border:10px solid red')", 
				category11);
		
		
        WebElement category4 = driver.findElement(By.cssSelector("ul[class='product-categories']>li:nth-child(4)"));
		
		js.executeScript("arguments[0].setAttribute('style', 'background:green ;border:10px solid yellow')", 
				category4);
		
		//selectez din n in n (n=ce numar vreau eu)
		//-->ul[class='product-categories']>li:nth-child(3n)
		
		//se porneste cu nr de la nr 5 si selectez din 3 in 3(adica acel 3n)
		//ul[class='product-categories']>li:nth-child(3n+5)
	}
}
