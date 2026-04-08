package easyMytrip;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class hotelPage {

    public static void main(String[] args) throws Throwable {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.easemytrip.com/");

        // Click Hotels tab
        driver.findElement(By.xpath("//span[normalize-space()='Hotels']")).click();
        Thread.sleep(2000);
        // Enter city
        driver.findElement(By.id("txtCity")).sendKeys("Bangalore");
        Thread.sleep(2000); // wait for suggestions
        driver.findElement(By.xpath("//li[contains(text(),'Bangalore')]")).click();
        Thread.sleep(2000);

        // Select check-in date
        driver.findElement(By.id("txtCheckIn")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[@data-date='2026-04-10']")).click();

        // Select check-out date
        driver.findElement(By.id("txtCheckOut")).click();
        driver.findElement(By.xpath("//td[@data-date='2026-04-14']")).click();

        // Select guests
        driver.findElement(By.id("divPax")).click();
        driver.findElement(By.id("AdultsPlus")).click(); // make 2 adults
        driver.findElement(By.id("btnDonePax")).click();

        // Search hotels
        driver.findElement(By.id("btnHotelSearch")).click();

        System.out.println("Page Title: " + driver.getTitle());
        driver.quit();
    }
}

	

