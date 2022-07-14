Feature: Como usuario registrado quiero poder realizar compas en el sitio de soriana

Background:
Given el usuario ingresa a la pagina de soriana

Scenario: usuario	web	con cobertura	Envio a domicilio	grocery	descuento %	tdc

When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
And Agrego el cupon "1CHOCHO25"
Then Valida si se agrego producto a carrito y voy al checkout
