Feature: Como usuario registrado quiero poder realizar compas en el sitio de soriana

Background:
Given el usuario ingresa a la pagina de soriana

Scenario: id1.- usuario	web	con cobertura	Envio a domicilio	grocery	descuento %	tdc

When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de el producto '1041251' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con tdc
Then el sistema valida que se finque bien la orden
Given El sistema valida en el BM la orden