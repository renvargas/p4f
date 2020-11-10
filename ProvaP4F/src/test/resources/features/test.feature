#language: pt
#Author: renato.vargas@gmail.com.br
@allTest
Funcionalidade: Realizar compra
  Eu como usuario quero acessar o site para realizar a compra de produtos

  @positivo
  Cenario: CT01 - Realizar compra de produtos
    Dado que eu esteja site "http://automationpractice.com/index.php"
    Quando pesquisar "T-SHIRT"
    E Adicionar no carrinho
    E Confirmar detalhes da compra
    E Realizar todos os passos para completar a transacao
    Entao compra é realizada com sucesso

  @negativo
  Cenario: CT02 - Compra com login invalido
    Dado que eu esteja site "http://automationpractice.com/index.php"
    Quando pesquisar "T-SHIRT"
    E Adicionar no carrinho
    E Confirmar detalhes da compra
    Mas informar login invalido
    Entao compra não será realizada
