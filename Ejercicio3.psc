Algoritmo Ejercicio3
	//Declaracion de variables
	definir peso_dolares Como Entero
	definir dolares Como Real
	definir conversion Como Real
	Definir impuesto Como Real
	
	peso_dolares = 0
	dolares = 0.00
	monto_pagar = 0.00
	impuesto = 0.00
	pago = 0.00
	
	//validacion de conversion a dolares 
	mientras peso_dolares <= 0 o peso_dolares > 42244
		mostrar "Ingrese la cantidad de pesos que desea convertr, no olvide que la maxima cantidad de dolares que puede comprar es de 200 y tiene un 30% del impuesto: "
		Leer peso_dolares
		
		si peso_dolares <= 0 o peso_dolares > 42244 Entonces
			Mostrar "Error-Ingrese un monto correcto"
		FinSi
	FinMientras // fin menu
	
	//impuesto
	impuesto = (peso_dolares * 30)/ 100
	
	//dolares
	dolares = peso_dolares / 211.22 //La cantidad de dolares
	
	//Monto a pagar + impuesto 
	monto_pagar = peso_dolares + impuesto
	
	

	//Validacion para que pague lo que corresponda
	Mientras pago <> monto_pagar
		Mostrar dolares," es la cantidad de dolares que ha comprado."
		Mostrar "Ingrese el monto a pagar que es: ", monto_pagar
		leer pago 
		
		si pago <> monto_pagar Entonces
			Mostrar "Error-Ingrese un monto correcto"
		FinSi
		
	FinMientras// fin validacion del pago
	
	
	Mostrar "se ha abonado correctamente: ", pago 
	
	
FinAlgoritmo
