package Zoro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleBasics {

	public static void main(String[] args) {
	//WebDriver driver= new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rrave\\Downloads\\chrome-win64\\chrome-win64\\chromedriver");
	
	WebDriver driver = new FirefoxDriver();
	System.setProperty("webdriver.gecko.driver", "\\Users\\rrave\\OneDrive\\Documents\\geckodriver.exe");
	
	driver.get("https://www.shoprite.com/sm/pickup/rsid/812");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();
	
	
	
	}

}
