Feature: Como usuario registrado quiero poder realizar compas en el sitio de soriana

Background:
Given el usuario ingresa a la pagina de soriana

Scenario: usuario	web	con cobertura	Envio a domicilio	grocery	descuento %	tdc

When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de el producto '11132' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon '1CHOCHO25'
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con tdc
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario:  usuario	web	con cobertura	Envio a domicilio	grocery	N/A	N/A	tdc
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de un producto grosery
And Agrega producto al Carrito
When El usuario va a el carrito
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con tdc
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: usuario	web	con cobertura	Envio a domicilio	grocery	descuento %	producto	tdc

When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de el producto '11132' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon '1CHOCHO25'
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con tdc
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador

Scenario: usuario	web	con cobertura	Envio a domicilio	grocery	Cupon	envio	Pago contra entrega/Efectivo

When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de el producto '11132' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon '1CHOCHO25'
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con efectivo
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador

Scenario: usuario	web	con cobertura	Entrega en tienda	MG	N/A	envio	N/A

When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de el producto 'cocina' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon '1CHOCHO25'
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con efectivo
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: usuario	web	con cobertura	Envio a domicilio	mixta	trespor2	envio + orden	tdc

When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de el producto 'cocina' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto 'melon' que tenga descuento y_o con cupon
When El usuario va a el carrito

Then El usuario coloca el trespordos

And Agrego el cupon '1CHOCHO25'
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con efectivo
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador



































