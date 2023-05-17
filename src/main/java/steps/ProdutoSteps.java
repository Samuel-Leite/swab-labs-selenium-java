package steps;

import io.cucumber.java.pt.Quando;
import pageObjects.ProdutoPage;
import utils.ContextoSetup;

public class ProdutoSteps {

    ContextoSetup contextoSetup;

    public ProdutoSteps (ContextoSetup contextoSetup){
        this.contextoSetup = contextoSetup;
    }

    @Quando("^eu incluo o produto no carrinho$")
    public void euIncluoOProdutoNoCarrinho() throws InterruptedException {
        ProdutoPage produtoPage = contextoSetup.gerenciarPO.getProdutoPage();
        produtoPage.addBackpack();
    }
}
