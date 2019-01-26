package br.pro.diegoquirino.calculadora.ux.REQ001_CalcularDesonto;

import net.thucydides.core.annotations.Steps;
import cucumber.api.DataTable;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import java.util.Map;

public class REQ001_CalcularDescontoGWT {

	@Steps
	REQ001_CalcularDescontoSteps steps;

	@E("^verifico se estou listagem de produtos$")
	public void verifico_se_estou_listagem_de_produtos(DataTable tabela) {
		Map<String, String> dados = tabela.asMap(String.class, String.class);
		steps.verifico_se_estou_listagem_de_produtos(dados.get("titulo"));
	}

	@E("^seleciono o primeiro produto para calcular desconto$")
	public void seleciono_o_primeiro_produto_para_calcular_desconto() {
		steps.selecionar_primeiro_produto();
	}

	@E("^verifico se estou na página de desconto$")
	public void verifico_se_estou_na_página_de_desconto(DataTable tabela) {
		Map<String, String> dados = tabela.asMap(String.class, String.class);
		steps.verifico_se_estou_na_tela_desconto(dados.get("pagDesconto"));
	}

	@E("^informo os daods para calcular o desconto$")
	public void informo_os_daods_para_calcular_o_desconto(DataTable tabela) {
		Map<String, String> dados = tabela.asMap(String.class, String.class);
		steps.selecionar_o_tipo_cliente(dados.get("tipo_cliente"));
		steps.informar_quantidade(dados.get("quantidade"));
	}

	@E("^clico no botão calcular desconto$")
	public void clico_no_botão_calcular_desconto() {
		steps.submeter_calculo_desconto();
	}

	@Entao("^verifico se o resultado corresponde ao esperado$")
	public void verifico_se_o_resultado_corresponde_ao_esperado(DataTable tabela) {
		Map<String, String> dados = tabela.asMap(String.class, String.class);
		steps.verificar_fator_desconto(dados.get("fatorDesconto"));
		steps.verificar_msg_sucesso(dados.get("msg"));
	}
}
