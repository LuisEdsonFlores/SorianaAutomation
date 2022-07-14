Feature: Como usuario registrado quiero poder realizar compas en el sitio de soriana

Background:
Given el usuario ingresa a la pagina de soriana

Scenario: Soriana_Chekcout_001

When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de un producto grosery
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
And el usuario finca la orden con tdc
Then el sistema valida que se finque bien la orden
Then el usuario cierra el navegador

