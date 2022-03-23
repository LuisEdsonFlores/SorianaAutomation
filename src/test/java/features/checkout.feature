Feature: probar escenarios de Checkout

Scenario: Soriana_Chekcout

Given el usuario ingresa a la pagina de soriana
When El usuario inicia sesion
Then Validamos que el carro de compras este vacio
Then El usuario selecciona un CP
And el usuario realiza la busqueda de un producto
And Agrega el producto al Carrito
Then Valida si se agrego producto a carrito y voy al checkout
Given el usuario finca la orden

