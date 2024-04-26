package curs17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {

	@Test
	public void openBrowser() {
		
		//FireFoxDriver() sau EdgeDriver()
		WebDriver browser = new ChromeDriver();
		browser.get("https://keyfood.ro/");
		
		//Testng => runner-ul nostru
		//psvm exista, inseamna ca adnotarea @Test ne trimite catre psvm
		//Testng -> are multe adnotari 
		// @Test, singura adnotare cu referinta catre main
	}
	
	
	
}
