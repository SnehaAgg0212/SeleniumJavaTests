import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/anirudhagupta/Desktop/STLab/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.linkedin.com/login";
        driver.get(url);
        driver.findElement(By.id("username")).sendKeys("aggarwalsneha1999@gmail.com");
        driver.findElement(By.id("password")).sendKeys("abc");
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        driver.close();
        driver.quit();
    }
}
