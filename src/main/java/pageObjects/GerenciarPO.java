package pageObjects;

import org.openqa.selenium.WebDriver;

public class GerenciarPO {

    public WebDriver driver;
    public LoginPage loginPage;
    public ProdutoPage produtoPage;
    public PagamentoPage pagamentoPage;

    public GerenciarPO(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage getLoginPage(){
        loginPage = new LoginPage(driver);
        return loginPage;
    }

    public ProdutoPage getProdutoPage(){
        produtoPage = new ProdutoPage(driver);
        return produtoPage;
    }

    public PagamentoPage getPagamentoPage(){
        pagamentoPage = new PagamentoPage(driver);
        return pagamentoPage;
    }
}
