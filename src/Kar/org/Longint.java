package Kar.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Longint {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", " C:\\Users\\Admin\\eclipse-workspace\\Prabakaran\\lib\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	private void kavi() {
		// TODO Auto-generated method stub

		 System.out.println("sister");
	}
	 
	
	

	private void mano() {
		System.out.println("mano is a good boy ");

	}
	 private void prabhu() {
		// TODO Auto-generated method stub
System.out.println("prabhu is a bad boy ");
	}
	 
	 private void kavi() {
		// TODO Auto-generated method stub

		 System.out.println("sister");
	}
	 
	 
	 private void call() {
		// TODO Auto-generated method stub
System.out.println("loose ");
	}
	 

}
