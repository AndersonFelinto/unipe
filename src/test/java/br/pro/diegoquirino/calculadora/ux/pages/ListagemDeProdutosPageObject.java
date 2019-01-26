package br.pro.diegoquirino.calculadora.ux.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class ListagemDeProdutosPageObject extends PageObject {

	@FindBy(xpath = "/html/body/div[1]/div[2]/h1")
	private  WebElement pageTitle;

	@FindBy (xpath = "/html/body/div[1]/div[2]/table/tbody/tr[1]/td[4]/a[1]")
	private WebElement produtoDaLista;

	public String getListagemDeProdutosPageTitle() {
		return this.pageTitle.getText();
	}


	public void clicarButtonCalcularDescontoDoProduto() {
		this.produtoDaLista.click();
	}
}
