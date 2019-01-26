package br.pro.diegoquirino.calculadora.ux.REQ001_CalcularDesonto;

import br.pro.diegoquirino.calculadora.ux.EyesSingleton;
import br.pro.diegoquirino.calculadora.ux.pages.CalculoDoDescontoParaProdutoPage;
import br.pro.diegoquirino.calculadora.ux.pages.ListagemDeProdutosPageObject;
import br.pro.diegoquirino.calculadora.ux.pages.PaginaInicialPageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.webdriver.WebDriverFacade;

import static org.junit.Assert.*;

public class REQ001_CalcularDescontoSteps extends ScenarioSteps {

	PaginaInicialPageObject initialPage;
	ListagemDeProdutosPageObject listagemDeProdutosPage;
	CalculoDoDescontoParaProdutoPage calculoDoDescontoPage;


	@Step
	public void verifico_se_estou_listagem_de_produtos(String titulo) {
		assertTrue(this.listagemDeProdutosPage.getListagemDeProdutosPageTitle().equalsIgnoreCase(titulo));
	}

	@Step
	public void selecionar_primeiro_produto() {
		this.listagemDeProdutosPage.clicarButtonCalcularDescontoDoProduto();
	}

	@Step
	public void verifico_se_estou_na_tela_desconto(String titulo){
		assertTrue(this.calculoDoDescontoPage.getCalculoDoDescontoParaProdutoPageTitle().equalsIgnoreCase(titulo));
	}

	@Step
	public void selecionar_o_tipo_cliente (String tipo){
		this.calculoDoDescontoPage.escolherTipoCliente(tipo);
	}

	@Step
	public void informar_quantidade (String quantidade){
		this.calculoDoDescontoPage.preencherQuantidade(quantidade);
	}

	@Step
	public void submeter_calculo_desconto (){
		this.calculoDoDescontoPage.clicarButtonCalculoDoDescontoParaProduto();
	}

	@Step
	public void verificar_fator_desconto (String fator) {
		assertTrue(this.calculoDoDescontoPage.getFatorObtido().contains(fator));
	}

	public void verificar_msg_sucesso(String msg) {
		EyesSingleton.simpleCheck((WebDriverFacade)this.getDriver(),
				"Tela de Calcular Desconto",
				"msg.calculo.desconto");

		assertTrue(
				calculoDoDescontoPage.getMensagemSucessoTitle().contains(msg)
		);

	}
}
