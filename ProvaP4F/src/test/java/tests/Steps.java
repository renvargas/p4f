package tests;

import java.io.IOException;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import elementos.ElementosWeb;
import pages.Metodos;

public class Steps extends Metodos {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Given("^que eu esteja site \"([^\"]*)\"$")
	public void que_eu_esteja_site(String arg1) throws Throwable {
		metodos.abrirNavegador(arg1, "CHROME", "iniciando o teste abrindo o navegador");
	}

	@When("^pesquisar \"([^\"]*)\"$")
	public void pesquisar(String arg1) throws Throwable {
		metodos.preencher(el.getPesquisar(), arg1, "pesquisando um texto no google");
		metodos.submit(el.getPesquisar(), "enter para pesquisar texto");
	}

	@Quando("^Adicionar no carrinho$")
	public void adicionarNoCarrinho() throws Throwable {
		metodos.clicar(el.getClicarProduto(), "clicar no produto escolhido");
		metodos.clicar(el.getAddCart(), "adicionado no carrinho");
	}

	@Quando("^Confirmar detalhes da compra$")
	public void confirmarDetalhesDaCompra() throws Throwable {
		metodos.esperarClicavel(el.getBtnCheckout1(), "esperar elemento ser clicavel");
		System.out.println(el.getBtnCheckout1());
		metodos.clicarText("Proceed to checkout", "Clicando no checkout");
		// metodos.clicar(el.getBtnCheckout1(), "clicar botão checkout");
	}

	@Quando("^Realizar todos os passos para completar a transacao$")
	public void realizarTodosOsPassosParaCompletarATransacao() throws Throwable {
		metodos.clicarText("Proceed to checkout", "Clicando no checkout");
		metodos.preencher(el.getCampoEmail(), "guilhermevargascarmo@gmail.com", "incluindo email");
		metodos.preencher(el.getCampoPassword(), "12345", "incluindo senha");
		metodos.clicar(el.getSubmit(), "confirmar login");
		metodos.esperarClicavel(el.getProcedCheckout(), "");
		metodos.clicar(el.getProcedCheckout(), "");
		metodos.clicar(el.getCheckBox(), "checkout");
		metodos.clicar(el.getProcedShipping(), "Clicando no checkout");
		metodos.clicar(el.getPayBycheck(), "");
		metodos.clicar(el.getBtnConfirm(), "");
	}

	@Entao("^compra é realizada com sucesso$")
	public void compraÉRealizadaComSucesso() throws Throwable {
		metodos.validarPagina("Order confirmation - My Store", "validando página de confirmação");
		metodos.validarTexto(el.getMsgConfirm(), "Your order on My Store is complete.", "validar msg de confirmação");
		metodos.screnShoot("CT01 - Realizar compra de produtos");
	}

	@Quando("^informar login invalido$")
	public void informarLoginInvalido() throws Throwable {
		metodos.clicarText("Proceed to checkout", "Clicando no checkout");
		metodos.preencher(el.getCampoEmail(), "usuario@invalido.com.br", "incluindo email errado");
		metodos.preencher(el.getCampoPassword(), "errada", "incluindo senha errada");
		metodos.clicar(el.getSubmit(), "confirmar login");
	}

	@Entao("^compra não será realizada$")
	public void compraNãoSeráRealizada() throws Throwable {
		metodos.validarTexto(el.getMsgFalhaAut(), "Authentication failed.",
				"validando falha ao usar dados invalidados na autenticação");
		metodos.screnShoot("CT02 - Compra com login invalido");

	}

	@cucumber.api.java.After
	public void fechar() throws IOException {
		metodos.fecharBrowser("finalizando o teste");

	}

	@cucumber.api.java.Before
	public void iniciar() {
		System.out.println("Iniciando o teste");

	}

}
