package steps;

import cucumber.api.java.pt.Dado;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.LoginPage;
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

        LoginPage loginPage = new LoginPage(contextoSetup.driver);
        loginPage.realizarLogin();
        loginPage.validacaoSucessoLogin();
    }
}