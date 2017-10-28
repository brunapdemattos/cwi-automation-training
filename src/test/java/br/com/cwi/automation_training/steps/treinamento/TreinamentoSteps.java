package br.com.cwi.automation_training.steps.treinamento;

import org.junit.Assert;

import br.com.cwi.automation_training.pages.treinamento.TreinamentoPage;
import br.com.cwi.automation_training.util.TestRule;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TreinamentoSteps {	
	
	@Dado("que estou na homepage do site \"(.*)\"")
	public void acessarHomePage(String url) {
		TestRule.openApplicationChrome(url);
	}
	
	@E("pesquiso pelo produto \"(.*)\"")
	public void pesquisarProduto(String nomeProduto) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.pesquisarProduto(nomeProduto);
	}
	
	@E("acesso o menu \"(.*)\"")
	public void acessarMenu(String nomeMenu) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.acessarMenu(nomeMenu);
	}
	
	@Quando("clico no botao \"(.*)\"")
	//@E ("clico no botao \"(.*)\"")
	public void clicarBotao(String nomeBotao) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.clicarBotao(nomeBotao);
	}
	
	@Quando("seleciono a opcao \"(.*)\" no campo \"(.*)\"")
	public void selecionarOpcaoNoCampo(String opcao, String campo) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.selecionarOpcaoNoCampo(opcao, campo);
	}
	
	@E("insiro o dado \"(.*)\" no campo \"(.*)\"")
	public void inserirDadoNoCampo(String dado, String campo) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.inserirDadoNoCampo(dado, campo);
	}
	
	@Entao("deve apresentar a mensagem \"(.*)\"")
	public void verificarMensagem(String mensagem) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		Assert.assertTrue("Mensagem exibida esta incorreta", treinamentoPage.verificaMensagem(mensagem));
	}
    
}
