package selenium2;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
public class browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/");
driver.manage().window().fullscreen();
System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl());
//driver.close();

	}

}
