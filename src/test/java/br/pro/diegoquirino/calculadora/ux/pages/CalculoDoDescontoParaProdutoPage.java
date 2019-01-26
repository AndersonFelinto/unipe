package br.pro.diegoquirino.calculadora.ux.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import net.serenitybdd.core.pages.PageObject;

public class CalculoDoDescontoParaProdutoPage extends PageObject {

	@FindBy(xpath = "/html/body/div[1]/div[2]/h1")
	private  WebElement pageTitle;

	@FindBy(id="tipoCliente")
	private WebElement selectTipoCliente;

	@FindBy(id="quantidade")
	private WebElement campoQuantidade;

	@FindBy(id = "calculardesconto.button.calcular")
	private WebElement buttonCalcularDescontoDoProduto;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/strong")
	private  WebElement sucessoTitle;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[2]/p[3]")
	private  WebElement fatorObtidoText;

	public String getCalculoDoDescontoParaProdutoPageTitle() {
		return this.pageTitle.getText();
	}

	public void escolherTipoCliente(String tipoCliente) {
		Select s = new Select(selectTipoCliente);
		s.selectByVisibleText(tipoCliente);
	}
	
	public void preencherQuantidade(String quantidade) {
		campoQuantidade.clear();
		campoQuantidade.sendKeys(quantidade);
	}
	
	public void clicarButtonCalculoDoDescontoParaProduto() {
		this.buttonCalcularDescontoDoProduto.click();
	}
	
	public String getMensagemSucessoTitle() {
		return this.sucessoTitle.getText();
	}
	
	public String getFatorObtido() {
		return this.fatorObtidoText.getText();
	}
}
