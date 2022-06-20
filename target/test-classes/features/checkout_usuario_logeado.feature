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

Scenario: Soriana_Chekcout_004

Given el usuario ingresa a la pagina de soriana
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario registra y finca la orden con paypal
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


Scenario: Soriana_Chekcout_008

Given el usuario ingresa a la pagina de soriana
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
When El usuario selecciona entrega en tienda
And el usuario finca la orden con paypal cuenta registrada
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




Scenario: Soriana_Chekcout_010

Given el usuario ingresa a la pagina de soriana
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de un producto general
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con paypal cuenta registrada
Then el sistema valida que se finque bien la orden
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
Then el usuario cierra el navegador

Scenario: Soriana_Chekcout_012

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
Then el usuario cierra el navegador


Scenario: Soriana_Chekcout_013
Given el usuario ingresa a la pagina de soriana
When El usuario continua como invitado
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP como invitado
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con una tdc nueva como invitado agregando dirección
Then el usuario cierra el navegador


Scenario: Soriana_Chekcout_014
Given el usuario ingresa a la pagina de soriana
When El usuario continua como invitado
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP como invitado
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con vales como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador



Scenario: Soriana_Chekcout_015
Given el usuario ingresa a la pagina de soriana
When El usuario continua como invitado
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP como invitado
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con efectivo como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador



Scenario: Soriana_Chekcout_016
Given el usuario ingresa a la pagina de soriana
When El usuario continua como invitado
Then El usuario selecciona un CP como invitado
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario registra y finca la orden con paypal como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador




Scenario: Soriana_Chekcout_017
Given el usuario ingresa a la pagina de soriana
When El usuario continua como invitado
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP como invitado
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
When El usuario selecciona entrega en tienda
And el usuario finca la orden con una tdc nueva como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: Soriana_Chekcout_018
Given el usuario ingresa a la pagina de soriana
When El usuario continua como invitado
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP como invitado
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
When El usuario selecciona entrega en tienda
And el usuario finca la orden con vales como invitado en entrega en tienda
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador



Scenario: Soriana_Chekcout_019
Given el usuario ingresa a la pagina de soriana
When El usuario continua como invitado
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP como invitado
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
When El usuario selecciona entrega en tienda
When el usuario finca la orden con efectivo en entrega en tienda
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador



Scenario: Soriana_Chekcout_021
Given el usuario ingresa a la pagina de soriana
When El usuario continua como invitado
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP como invitado
And el usuario realiza la busqueda de un producto general
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con una tdc nueva como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador


Scenario: Soriana_Chekcout_023

Given el usuario ingresa a la pagina de soriana
When El usuario continua como invitado
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP como invitado
And el usuario realiza la busqueda de un producto general
And Agrega el producto al Carrito
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
When el usuario va al checkout como invitado
And el usuario finca la orden con una tdc nueva como invitado
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador

Scenario: Soriana_Chekcout_024

Given el usuario ingresa a la pagina de soriana
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de una bebida alcoholica
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con vale
Then el sistema no permite fincar la orden
Then el usuario cierra el navegador


