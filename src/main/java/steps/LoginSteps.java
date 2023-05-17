package steps;

import io.cucumber.java.pt.Dado;
import pageObjects.LoginPage;
import utils.ContextoSetup;

import java.io.IOException;

public class LoginSteps {

    ContextoSetup contextoSetup;

    public LoginSteps (ContextoSetup contextoSetup){
        this.contextoSetup = contextoSetup;
    }

    @Dado("^que eu esteja logado na Swag Labs$")
    public void queEuEstejaLogadoNaSwagLabs() throws InterruptedException, IOException {
        LoginPage loginPage = contextoSetup.gerenciarPO.getLoginPage();
        loginPage.realizarLogin();
        loginPage.validacaoSucessoLogin();
    }
}