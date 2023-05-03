package steps;

import cucumber.api.java.pt.Dado;
import pageObjects.LoginPage;
import utils.ContextoSetup;

public class LoginSteps {

    ContextoSetup contextoSetup;

    public LoginSteps (ContextoSetup contextoSetup){
        this.contextoSetup = contextoSetup;
    }

    @Dado("^que eu esteja logado na Swag Labs$")
    public void queEuEstejaLogadoNaSwagLabs() throws InterruptedException {
        LoginPage loginPage = contextoSetup.gerenciarPO.getLoginPage();
        loginPage.realizarLogin();
        loginPage.validacaoSucessoLogin();
    }
}