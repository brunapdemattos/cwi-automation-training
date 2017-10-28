package br.com.cwi.automation_training.pages.treinamento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.cwi.automation_training.util.TestRule;

public class TreinamentoPage extends TreinamentoElementMap {

	public TreinamentoPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void pesquisarProduto(String produto){
		search_query_top.sendKeys(produto);
		botaoPesquisar.click();
		logPrint("Buscou pelo produto " + produto);
	}

	public void clicarBotao(String botao) {
		Actions actions = new Actions(driver);
		if(botao.equals("Add to cart")) {
			//botoesAddToCart.get(0).click();
			//botaoAddToCart.click();
		} else if(botao.equals("Send")) {
			actions.moveToElement(botaoSend).click().perform();
			//botaoSend.click();
		} else if(botao.equals("Create an account")) {
			actions.moveToElement(SubmitCreate).click().perform();
		} else if(botao.equals("Register")) {
			actions.moveToElement(SubmitAccount).click().perform();
		}
		logPrint("Clicou no botão " + botao);
	}

	public boolean verificaMensagem(String mensagem) {
		logPrint("Validou mensagem de sucesso: " + mensagem);
		//return mensagemAddedToCart.getText().equals(mensagem);
		return mensagemContactUs.getText().equals(mensagem);
	}

	public void acessarMenu(String nomeMenu) {
		//Actions actions = new Actions(driver);
		
		//for (WebElement menu : menusFooter) {
			//if(menu.getText().equals(nomeMenu)) {
				//actions.moveToElement(menu).click().perform();
				//logPrint("Acessou menu " + nomeMenu);
			//}
		//}
		//logPrint("Não encontrou o " + nomeMenu);
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"center_column\"]/h1")));
	
		if(nomeMenu.equals("Contact us")) {
			menuContactUs.click();
		} else if (nomeMenu.equals("Sign in")) {
			menuSignIn.click();
		}
		logPrint("Acessou menu " + nomeMenu);
	}

	public void selecionarOpcaoNoCampo(String opcao, String campo) {
		//campoSubjectHeading.selectByIndex(0);
		//campoSubjectHeading.selectByValue(opcao);
		id_contact.sendKeys(opcao);
		logPrint("Selecionou opção " + opcao + " no campo " + campo);
	}

	public void inserirDadoNoCampo(String dado, String campo) {
		WebElement meuCampo = null;
		if(campo.equals("Email address")) {
			meuCampo = email;
		} else if (campo.equals("Order reference")) {
			meuCampo = order;
		} else if (campo.equals("Message")) {
			meuCampo = message;
		} else if (campo.equals("Email cadastro")) {
			meuCampo = email_create;
		}
		meuCampo.sendKeys(dado);
		logPrint("Inseriu o dado " + dado + " no campo " + campo);
	}

	public void preencherTodosCamposCadastroUsuario() {
		//campo
		
	}
	
}