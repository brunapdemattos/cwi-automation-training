#language: pt
#encoding: iso-8859-1
Funcionalidade: Compra

	@treinamento1
  Cenario: Adicionar produto ao carrinho
    Dado que estou na homepage do site "http://automationpractice.com/"
    E pesquiso pelo produto "Dress"
    Quando clico no botao "Add to cart"
    Entao deve apresentar a mensagem "Product sucessfully added to cart"
    
  @treinamento2
  Cenario: Enviar mensagem atraves do menu Contact Us
  	Dado que estou na homepage do site "http://automationpractice.com/"
  	E acesso o menu "Contact us"
  	Quando seleciono a opcao "Customer service" no campo "Subject Heading"
  	E insiro o dado "bruna.mattos@cwi.com.br" no campo "Email address"
  	E insiro o dado "123" no campo "Order reference"
  	E insiro o dado "Teste" no campo "Message"
  	E clico no botao "Send"
  	Entao deve apresentar a mensagem "Your message has been successfully sent to our team."
  	
  @treinamento3
  Cenario: Efetuar Cadastro
 	 Dado que estou na homepage do site "http://automationpractice.com/"
 	 E acesso o menu "Sign in"
 	 E insiro o dado "bruna.mattos@cwi.com.br" no campo "Email cadastro"
 	 E clico no botao "Create an account"
 	 #Quando preencho todos os campos do cadastro de usuario
 	 E clico no botao "Register"
 	 Entao deve apresentar a mensagem "teste"
 	 
 	 