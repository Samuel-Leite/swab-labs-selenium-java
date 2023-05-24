package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoPage {

    public WebDriver driver;

    public ProdutoPage(WebDriver driver){
        this.driver = driver;
    }

    By btnProdutoBackpack = By.xpath("//*[contains(text(),'Sauce Labs Backpack')]");
    By btnAddProduto = By.id("add-to-cart-sauce-labs-backpack");
    By btnVoltarPagina = By.name("back-to-products");

    public void addBackpack() throws InterruptedException {
        driver.findElement(btnProdutoBackpack).click();
        Thread.sleep(5000);
        driver.findElement(btnAddProduto).click();
        Thread.sleep(5000);
        driver.findElement(btnVoltarPagina).click();
    }
}