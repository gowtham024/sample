package Kar.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Longint {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", " C:\\Users\\Admin\\eclipse-workspace\\Prabakaran\\lib\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}
