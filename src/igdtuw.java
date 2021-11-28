import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class igdtuw {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/anirudhagupta/Desktop/STLab/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "http://www.igdtuw.ac.in";
        driver.get(url);

    }
}
