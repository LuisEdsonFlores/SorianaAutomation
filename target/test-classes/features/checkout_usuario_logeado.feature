Feature: Como usuario registrado quiero poder realizar compas en el sitio de soriana

Scenario: Soriana_Chekcout_001

Given el usuario ingresa a la pagina de soriana
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con tdc
Then el usuario cierra el navegador


Scenario: Soriana_Chekcout_002

Given el usuario ingresa a la pagina de soriana
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con vale
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: Soriana_Chekcout_003

Given el usuario ingresa a la pagina de soriana
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con efectivo
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: Soriana_Chekcout_005

Given el usuario ingresa a la pagina de soriana
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
When El usuario selecciona entrega en tienda
And el usuario finca la orden con tdc 
Then el usuario cierra el navegador


Scenario: Soriana_Chekcout_006

Given el usuario ingresa a la pagina de soriana
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
When El usuario selecciona entrega en tienda
And el usuario finca la orden con vale
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: Soriana_Chekcout_007

Given el usuario ingresa a la pagina de soriana
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
When El usuario selecciona entrega en tienda
And el usuario finca la orden con efectivo
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: Soriana_Chekcout_009

Given el usuario ingresa a la pagina de soriana
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de un producto general
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con una tdc nueva
Then el usuario cierra el navegador

Scenario: Soriana_Chekcout_011

Given el usuario ingresa a la pagina de soriana
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
And el usuario realiza la busqueda de un producto general
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con una tdc nueva
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador