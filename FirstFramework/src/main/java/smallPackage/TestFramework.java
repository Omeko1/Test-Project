package smallPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFramework {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver","driver");
    
    WebDriver driver = new ChromeDriver();
    
    driver.navigate().to("https://www.youtube.com/");
    
		

	}

}
