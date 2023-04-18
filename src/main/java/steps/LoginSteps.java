package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.ContextoSetup;

public class LoginSteps {

    ContextoSetup contextoSetup;

    public LoginSteps (ContextoSetup contextoSetup){
        this.contextoSetup = contextoSetup;
    }

    @Dado("^que eu esteja logado na Swag Labs$")
    public void queEuEstejaLogadoNaSwagLabs() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        contextoSetup.driver = new ChromeDriver(options);

        contextoSetup.driver.manage().window().maximize();
        contextoSetup.driver.get("https://www.saucedemo.com/");

        contextoSetup.driver.findElement(By.id("user-name")).sendKeys("standard_user");
        contextoSetup.driver.findElement(By.name("password")).sendKeys("secret_sauce");
        contextoSetup.driver.findElement(By.id("login-button")).click();

        Thread.sleep(5000);

        String texto = contextoSetup.driver.findElement(By.xpath("//div[contains(text(),'Swag Labs')]")).getText();
        Assert.assertEquals("Swag Labs", texto);
    }
}