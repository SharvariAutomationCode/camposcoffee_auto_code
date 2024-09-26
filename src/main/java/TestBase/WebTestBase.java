package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import static util.WaitHandle.PAGE_LOAD_TIMEOUT;
import static util.WaitHandle.PAGE_LOAD_TIMEOUT;

public class WebTestBase {
    public static WebDriver driver;
    public static Properties props;

    public WebTestBase() {
        try (FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties")) {
            props = new Properties();
            props.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Configuration file not found", e);
        } catch (IOException e) {
            throw new RuntimeException("Error loading configuration file", e);
        }
    }
    public static void  initialization() {
        String browserName = props.getProperty("browser");
        if (browserName.equalsIgnoreCase("Chrome")){
        driver = new ChromeDriver();
    } else if (browserName.equalsIgnoreCase("Firebox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }else {
            throw new RuntimeException("Please select the correct browser name");
        }
        driver.manage().window().maximize();
        driver.get(props.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
        driver.manage().deleteAllCookies();



    }
}

