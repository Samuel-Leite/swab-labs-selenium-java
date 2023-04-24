package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagamentoPage {

    public WebDriver driver;

    public PagamentoPage(WebDriver driver){
        this.driver = driver;
    }

    By btnCarrinho = By.xpath("//*[contains(@class,'shopping_cart_link')]");
    By btnCheckout = By.id("checkout");
    By txtFirstName = By.xpath("//input[@id = 'first-name']");
    By txtLastName = By.xpath("//input[@id = 'last-name']");
    By txtPostalCode = By.xpath("//input[@id = 'postal-code']");
    By btnContinue = By.id("continue");

    public void acessarCarrinho() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(btnCarrinho).click();
        Thread.sleep(5000);
        driver.findElement(btnCheckout).click();
    }

    public void preencherDadosPagamento() throws InterruptedException {
        driver.findElement(txtFirstName).sendKeys("Samuel");
        driver.findElement(txtLastName).sendKeys("Leite");
        driver.findElement(txtPostalCode).sendKeys("123456");
        Thread.sleep(5000);
        driver.findElement(btnContinue).click();
    }
}