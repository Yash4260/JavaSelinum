import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {
        // Launch Chrome (No need to set System.setProperty if using Selenium 4.6+ with WebDriverManager)
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Maximize window
        driver.manage().window().maximize();

        // Find search box and type "Selenium 4"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium 4 new features");

        // Submit the search
        searchBox.submit();

        // Print the page title
        System.out.println("Page Title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
