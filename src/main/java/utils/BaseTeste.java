package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTeste {

    public WebDriver driver;

    public WebDriver webDriverManager() throws IOException {

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//global.properties");
        Properties properties = new Properties();
        properties.load(fis);
        String url = properties.getProperty("baseUrl");

        String browser_properties = properties.getProperty("browser");
        String browser_maven = System.getProperty("browser"); // valor que será fornecido no terminal

//        uso do operador do Java
//        result = testCondition!=null ? value1 : value2 ===> se for verdadeiro testCondition não é igual nulo é value1, se for falso value2
        String browser = browser_maven!=null ? browser_maven : browser_properties;


        if(driver == null){

            if(browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//test//resources//drivers//chromedriver.exe");

                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
            }
            else if(browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//src//test//resources//drivers//geckodriver.exe");
                driver = new FirefoxDriver();
            }
            else if(browser.equalsIgnoreCase("edge")){
                System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "//src//test//resources//drivers//msedgedriver.exe");

                EdgeOptions options = new EdgeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new EdgeDriver(options);
            }

            driver.manage().window().maximize();
            driver.get(url);
        }
        return driver;
    }
}
