import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the URL
        driver.get("https://iamsandesh23.github.io/selenium.github.io/");

        // Maximize the window
        driver.manage().window().maximize();

        // Click on the link to open a popup window
        driver.findElement(By.linkText("Open a popup window")).click();

        // Get handles of all windows
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();

        // Print all window handles
        while (iterator.hasNext()) {
            String handle = iterator.next();
            System.out.println("Window Handle: " + handle);
        }

        // Switch to the child window
        String mainWindowHandle = iterator.next(); // Main window handle
        String popupWindowHandle = iterator.next(); // Popup window handle
        driver.switchTo().window(popupWindowHandle);

        // Find an element in the child window
        WebElement popupHeading = driver.findElement(By.xpath("/html/body/h2"));

        // Print the text of the element
        System.out.println("Popup Window Heading: " + popupHeading.getText());

        // Close the child window
        driver.close();

        // Switch back to the main window
        driver.switchTo().window(mainWindowHandle);

        // Close the WebDriver
        driver.quit();
    }
}
