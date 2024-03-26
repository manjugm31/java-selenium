import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestingEndToEndReg {

    public static void main(String[] args) throws InterruptedException {
        // Initialize WebDriver for Chrome
        WebDriver driver = new ChromeDriver();
        
        // Open tutorialninja e-cart website
        driver.get("https://tutorialsninja.com/");
        
        // Clicking on the link to navigate to the registration page
        driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/section/div/div/div/div/div/p/a")).click();
        
        // Clicking on the registration button in the navigation bar
        driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/i")).click();
        
        // Selecting the registration option from the dropdown menu
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
        
        // Filling out the registration form
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("abc");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("gm");
        driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("abc123");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("manj132@gmail.com");
        
        // Checking the checkbox for agreeing to terms and conditions
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input")).click();
        
        // Clicking on the continue button to proceed with registration
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
        
        // Confirming the password by entering it again
        driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys("abc123");
        
        // Clicking on the continue button to complete registration
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
        
        // Adding a short delay for page transition
        Thread.sleep(1000);
        
        // Navigating back to the homepage after registration is complete
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
    }
}
