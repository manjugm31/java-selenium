import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicMethod {

    public static void main(String[] args) {
        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the specified URL
        driver.get(("https://iamsandesh23.github.io/selenium.github.io/"));
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Find the element by name and input text
        WebElement passwordElement = driver.findElement(By.name("pswrd"));
        passwordElement.sendKeys("abc");
        
        // Find the radio button by ID and click on it
        WebElement radioButton = driver.findElement(By.id("radio1"));
        radioButton.click();
        
        // Find the element by class name and retrieve text
        WebElement titleElement = driver.findElement(By.className("title"));
        String titleText = titleElement.getText();
        System.out.println(titleText);
        
        // Find the element by ID and retrieve its attribute value
        String alertType = driver.findElement(By.id("alert1")).getAttribute("type");
        System.out.println(alertType);
        
        // Get the current URL of the web page and print it
        String getCurrentUrl = driver.getCurrentUrl();
        System.out.println(getCurrentUrl);
        
        // Clear the password field
        WebElement clear = driver.findElement(By.name("pswrd"));
        clear.clear();
        
        // Get text of the multi-select dropdown
        String getText = driver.findElement(By.id("multiselect1")).getText();
        System.out.println(getText);
        
        // Navigate to a new URL, wait for 3 seconds, then navigate back
        driver.navigate().to("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_layout_float");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().back();
        
        // Wait for 3 seconds, then navigate forward
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().forward();
        
        // Refresh the page
        driver.navigate().refresh();
        
        // Check if checkbox1 is selected and print the result
        boolean isSelected = driver.findElement(By.id("checkbox1")).isSelected();
        System.out.println(isSelected);
        
        // Close the browser
        driver.quit();
    }
}
