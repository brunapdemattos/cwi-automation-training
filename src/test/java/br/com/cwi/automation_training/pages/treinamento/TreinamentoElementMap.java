package br.com.cwi.automation_training.pages.treinamento;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import br.com.cwi.automation_training.pages.BasePage;

public class TreinamentoElementMap extends BasePage {
	
	protected WebElement search_query_top;

	@FindBy(css = ".button-search")
	protected WebElement botaoPesquisar;
	
	//@FindBy(css = "*center_column .ajax_add_to_cart_button")
	@FindBy(xpath = "//*[@id='center_column']//*[contains(@class, 'ajax_add_to_cart_button')]")
	protected List<WebElement> botoesAddToCart;
	
	//@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
	//protected WebElement botaoAddToCart;
	
	@FindBy(css = ".layer_cart_product h2")
	protected WebElement mensagemAddedToCart;
	
	@FindBy(css = ".toggle-footer a")
	protected List<WebElement> menusFooter;
	
	@FindBy(xpath = "//*[@id=\"contact-link\"]/a")
	protected WebElement menuContactUs;
	
	//@FindBy(xpath = "//*[@id=\"block_various_links_footer\"]/ul/li[5]/a")
	//protected WebElement menuContactUs;
	
	//@FindBy(xpath = "//*[@id=\'id_contact\']")
	//protected Select campoSubjectHeading;
	//protected WebElement campoSubjectHeading;
	protected WebElement id_contact;
	
	protected WebElement email;
	
	protected WebElement email_create;
	
	@FindBy(id = "id_order")
	protected WebElement order;
	
	protected WebElement message;
	
	@FindBy(xpath = "//*[@id='submitMessage']")
	protected WebElement botaoSend;
	
	@FindBy(xpath = "//*[@id='center_column']/p")
	protected WebElement mensagemContactUs;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	protected WebElement menuSignIn;
	
	protected WebElement SubmitCreate;
	
	protected WebElement SubmitAccount;
}