# language: pt
# charset: UTF-8

  @wip
Funcionalidade: Comprar um produto
  Eu como usuario
  Gostaria de acessar a Swag Labs
  Adquirir um produto com sucesso

  Cenário: Comprar o produto Sauce Labs Backpack
    Dado que eu esteja logado na Swag Labs
    Quando eu incluo o produto no carrinho
    E eu efetuo o pagamento
    Então eu irei visualizar a mensagem "Thank you for your order!"