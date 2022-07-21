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
Then el usuario cierra el navegador


Scenario: id2.- usuario	web	con cobertura	Envio a domicilio	grocery	N/A	N/A	tdc
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


Scenario: id3.-  usuario	web	con cobertura	Envio a domicilio	grocery	descuento %	producto	tdc

When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de el producto '1041251' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11586912' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon '1SUAVIZANTE110'
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con tdc
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador



Scenario: id4.- usuario	web	con cobertura	Envio a domicilio	grocery	Cupon	envio	Pago contra entrega/Efectivo

When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario ingresa el cp '66220'
And el usuario realiza la busqueda de el producto '11586912' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11346945' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11461750' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon '1SUAVIZANTE110'
And Agrego el cupon 'ENVIOGRATIS'
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con efectivo
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador



Scenario: id5.- usuario	web	con cobertura	Entrega en tienda	MG	N/A	N/A	N/A

When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona una tienda para recoger en ella
And el usuario realiza la busqueda de el producto '11532528' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con efectivo
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador



Scenario: id6.- usuario	web	con cobertura	Envio a domicilio	mixta	trespor2	envio + orden	tdc

When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11579523' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
When El usuario aplica el trespordos
And Agrego el cupon 'ENVIOGRATIS'
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con tdc
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: id7.- usuario	web	con cobertura	Envio a domicilio	mixta	trespor2	envio + orden	tdc

When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona una tienda para recoger en ella
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11579523' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
When El usuario aplica el trespordos
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con pago contra entrega tdc
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador



Scenario: id8.- usuario	web	con cobertura	Entrega en tienda	grocery	cupon	N/A	Pago contra entrega/tdc

When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona una tienda para recoger en ella
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11579523' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con tdc
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador



Scenario: id9.- usuario	web	con cobertura	Entrega en tienda	grocery	N/A	N/A	tdc
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona una tienda para recoger en ella
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con tdc
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: id10.- usuario	web	con cobertura	Entrega en tienda	mixta	N/A	producto + orden	paypal
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona una tienda para recoger en ella
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
And Agrego el cupon '1SUAVIZANTE110'
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario registra y finca la orden con paypal
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: id11.-usuario	web	con cobertura	Entrega en tienda	MG	puntos	producto + orden	Pago contra entrega/efectivo
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona una tienda para recoger en ella
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
And Agrego el cupon '1SUAVIZANTE110'
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con efectivo
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: id12.-usuario	web	con cobertura	Envio a domicilio	mixta	N/A	orden	mercado pago
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario ingresa el cp '66220'
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con Merado Pago*******



Scenario: id13.-usuario	web	con cobertura	Envio a domicilio	mixta	N/A	orden	paypal
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario ingresa el cp '66220'
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario registra y finca la orden con paypal
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador

Scenario: id14.-usuario	web	con cobertura	Envio a domicilio	grocery	N/A	N/A	paypal
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario ingresa el cp '66220'
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario registra y finca la orden con paypal
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: id15.-usuario	web	con cobertura	Envio a domicilio	MG	N/A	envio + orden	tdc
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario ingresa el cp '66220'
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
And Agrego el cupon 'ENVIOGRATIS'
And el usuario finca la orden con tdc
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador

Scenario: id16.-usuario	web	con cobertura	Envio a domicilio	MG	N/A	N/A	paypal
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario ingresa el cp '66220'
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
And Agrego el cupon 'ENVIOGRATIS'
And el usuario registra y finca la orden con paypal
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador