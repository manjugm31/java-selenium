import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestingEndToEnd {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("https://tutorialsninja.com/demo")).click();
		driver.findElement(By.name("search")).clear();
		Thread.sleep(3000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.name("search")).sendKeys("iphone");
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/span/button/i")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div[2]/div/input[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div[2]/div/input[1]")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//*[@id=\"cart-total\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong")).click();
//		driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[5]/a/i")).click();
		 String a=driver.findElement(By.xpath("/html/body/div[2]/div[1]")).getText();
		 System.out.println(a);
		
		
		
		
		
		
		
		

	}

}
