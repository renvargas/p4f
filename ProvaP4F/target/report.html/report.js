$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#Author: renato.vargas@gmail.com.br"
    }
  ],
  "line": 4,
  "name": "Realizar compra",
  "description": "Eu como usuario quero acessar o site para realizar a compra de produtos",
  "id": "realizar-compra",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@allTest"
    }
  ]
});
formatter.before({
  "duration": 4597300,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "CT01 - Realizar compra de produtos",
  "description": "",
  "id": "realizar-compra;ct01---realizar-compra-de-produtos",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@positivo"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que eu esteja site \"http://automationpractice.com/index.php\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "pesquisar \"T-SHIRT\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "Adicionar no carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "Confirmar detalhes da compra",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "Realizar todos os passos para completar a transacao",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "compra é realizada com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 20
    }
  ],
  "location": "Steps.que_eu_esteja_site(String)"
});
formatter.result({
  "duration": 12506736000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "T-SHIRT",
      "offset": 11
    }
  ],
  "location": "Steps.pesquisar(String)"
});
formatter.result({
  "duration": 2362902800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.adicionarNoCarrinho()"
});
formatter.result({
  "duration": 2832784300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.confirmarDetalhesDaCompra()"
});
formatter.result({
  "duration": 3113724400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.realizarTodosOsPassosParaCompletarATransacao()"
});
formatter.result({
  "duration": 14001744300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.compraÉRealizadaComSucesso()"
});
formatter.result({
  "duration": 370594700,
  "status": "passed"
});
formatter.after({
  "duration": 715332300,
  "status": "passed"
});
formatter.before({
  "duration": 222300,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "CT02 - Compra com login invalido",
  "description": "",
  "id": "realizar-compra;ct02---compra-com-login-invalido",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 16,
      "name": "@negativo"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "que eu esteja site \"http://automationpractice.com/index.php\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 19,
  "name": "pesquisar \"T-SHIRT\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 20,
  "name": "Adicionar no carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "Confirmar detalhes da compra",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "informar login invalido",
  "keyword": "Mas "
});
formatter.step({
  "line": 23,
  "name": "compra não será realizada",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 20
    }
  ],
  "location": "Steps.que_eu_esteja_site(String)"
});
formatter.result({
  "duration": 13463733900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "T-SHIRT",
      "offset": 11
    }
  ],
  "location": "Steps.pesquisar(String)"
});
formatter.result({
  "duration": 1605057200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.adicionarNoCarrinho()"
});
formatter.result({
  "duration": 1788136500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.confirmarDetalhesDaCompra()"
});
formatter.result({
  "duration": 3181758200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.informarLoginInvalido()"
});
formatter.result({
  "duration": 3145850600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.compraNãoSeráRealizada()"
});
formatter.result({
  "duration": 335400300,
  "status": "passed"
});
formatter.after({
  "duration": 736864200,
  "status": "passed"
});
});