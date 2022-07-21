Feature: Como usuario registrado quiero poder realizar compas en el sitio de soriana

Background:
Given el usuario ingresa a la pagina de soriana


Scenario: id1.- Invitado	Web	con cobertura	Envio a domicilio	grocery			efectivo

When El usuario continua como invitado
Then El usuario selecciona un CP como invitado
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con efectivo como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: id2.- Invitado	Web	con cobertura	Entrega en tienda	mixta			tdc

When El usuario continua como invitado
Then El usuario selecciona una tienda para recoger en ella
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con una tdc nueva como invitado agregando dirección
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador




Scenario: id3.- Invitado	Web	con cobertura	Envio a domicilio	MG			tdc

When El usuario continua como invitado
Then El usuario selecciona un CP como invitado
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con una tdc nueva como invitado agregando dirección
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: id4.- Invitado	Web	con cobertura	Entrega en tienda MG			vales

When El usuario continua como invitado
Then El usuario selecciona una tienda para recoger en ella
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con vales como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: id5.- Invitado	Web	con cobertura	Envio a domicilio	grocery	producto		efectivo

When El usuario continua como invitado
Then El usuario selecciona un CP como invitado
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con efectivo como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: id6.- Invitado	Web	con cobertura	Entrega en tienda	mixta	orden		tdc

When El usuario continua como invitado
Then El usuario selecciona una tienda para recoger en ella
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con una tdc nueva como invitado agregando dirección
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: id7.- Invitado	Web	con cobertura	Envio a domicilio	MG	envio	vales

When El usuario continua como invitado
Then El usuario selecciona un CP como invitado
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con vales como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador



Scenario: id8.- con cobertura	Entrega en tienda	grocery		Producto	paypal

When El usuario continua como invitado
Then El usuario selecciona una tienda para recoger en ella
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario registra y finca la orden con paypal como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador



Scenario: id9.- Invitado	Web	con cobertura	Envio a domicilio	mixta		orden	mercado pago

When El usuario continua como invitado
Then El usuario selecciona un CP como invitado
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con mercado pago como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador

Scenario: id10.- con cobertura	Entrega en tienda	MG		envio 	Dinero electronico

When El usuario continua como invitado
Then El usuario selecciona una tienda para recoger en ella
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario registra y finca la orden con dinero electronico como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: id11.- Invitado	Web	con cobertura	Envio a domicilio	grocery	producto		efectivo

When El usuario continua como invitado
Then El usuario selecciona un CP como invitado
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con efectivo como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: id12.- con cobertura	Entrega en tienda	mixta		orden	tdc

When El usuario continua como invitado
Then El usuario selecciona una tienda para recoger en ella
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con una tdc nueva como invitado agregando dirección
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: id13.- con cobertura	Envio a domicilio	MG		envio	vales
When El usuario continua como invitado
Then El usuario selecciona un CP como invitado
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con vales como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: id14.- con cobertura	Entrega en tienda	grocery		Producto	paypal
When El usuario continua como invitado
Then El usuario selecciona una tienda para recoger en ella
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario registra y finca la orden con paypal como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador

Scenario: id15.- con cobertura	Envio a domicilio	mixta		orden	mercado pago
When El usuario continua como invitado
Then El usuario selecciona un CP como invitado
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con mercado pago como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: id16.- con cobertura	Entrega en tienda	MG		envio	Dinero electronico
When El usuario continua como invitado
Then El usuario selecciona una tienda para recoger en ella
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario registra y finca la orden con dinero electronico como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: id17.- con cobertura	Envio a domicilio	grocery		Producto	Dinero en efectivo
When El usuario continua como invitado
Then El usuario selecciona un CP como invitado
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con efectivo como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador



Scenario: id18.- con cobertura	Envio a domicilio	grocery			tdc
When El usuario continua como invitado
Then El usuario ingresa el cp '66220'
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con una tdc nueva como invitado agregando dirección
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador



Scenario: id19.- Entrega en tienda	mixta		orden	tdc
When El usuario continua como invitado
Then El usuario selecciona una tienda para recoger en ella
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con una tdc nueva como invitado agregando dirección
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: id20.- con cobertura	Envio a domicilio	MG		envio	tdc
When El usuario continua como invitado
Then El usuario ingresa el cp '66220'
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con una tdc nueva como invitado agregando dirección
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador

Scenario: id21.- con cobertura	Entrega en tienda	grocery		Producto	vales
When El usuario continua como invitado
Then El usuario selecciona una tienda para recoger en ella
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con vales como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador



Scenario: id22.- con cobertura	Envio a domicilio	mixta		orden	paypal
When El usuario continua como invitado
Then El usuario ingresa el cp '66220'
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
And el usuario realiza la busqueda de el producto '11116851' que tenga descuento y_o con cupon
And Agrega producto al Carrito
When El usuario va a el carrito
And Agrego el cupon 'FACEBOOK'
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con vales como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador
And el usuario registra y finca la orden con paypal como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador












