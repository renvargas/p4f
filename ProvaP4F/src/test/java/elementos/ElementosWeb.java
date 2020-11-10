package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	// ***********************************************************
	// ELEMENTOS WEB ENCAPSULADOS
	// ***********************************************************

	private By pesquisar = By.name("search_query");
	private By clicarProduto = By
			.cssSelector("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img");
	private By addCart = By.name("Submit");
	private By btnCheckout1 = By.cssSelector(
			"#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span");
	private By campoEmail = By.id("email");
	private By campoPassword = By.id("passwd");
	private By checkBox = By.id("cgv");
	private By submit = By.id("SubmitLogin");
	private By procedCheckout = By.name("processAddress");
	private By procedShipping = By.name("processCarrier");
	private By payBycheck = By.cssSelector("#HOOK_PAYMENT > div:nth-child(2) > div > p > a");
	private By btnConfirm = By.cssSelector("#cart_navigation > button > span");
	private By msgConfirm = By.cssSelector("#center_column > p.alert.alert-success");
	private By msgFalhaAut = By.cssSelector("#center_column > div.alert.alert-danger > ol > li");

	// ***********************************************************
	// MÉTODOS DE ACESSO
	// ***********************************************************

	public By getPesquisar() {
		return pesquisar;
	}

	public By getClicarProduto() {
		return clicarProduto;
	}

	public By getAddCart() {
		return addCart;
	}

	public By getBtnCheckout1() {
		return btnCheckout1;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getCampoPassword() {
		return campoPassword;
	}

	public By getCheckBox() {
		return checkBox;
	}

	public By getSubmit() {
		return submit;
	}

	public By getProcedCheckout() {
		return procedCheckout;
	}

	public By getProcedShipping() {
		return procedShipping;
	}

	public By getPayBycheck() {
		return payBycheck;
	}

	public By getBtnConfirm() {
		return btnConfirm;
	}

	public By getMsgConfirm() {
		return msgConfirm;
	}

	public By getMsgFalhaAut() {
		return msgFalhaAut;
	}

}
