Algoritmo Ejercicio1
	//Declaracion de variables 
	Definir monto_pagar Como Entero
	definir saldo_pagar Como Entero
	Definir monto_final Como Entero
	
	//inicializar variables
	monto_pagar = 0
	monto_final = 0
	saldo_pagar = 0
	//Menu + validacion
	Mientras monto_pagar <=0 Hacer
		Mostrar "Ingrese el monto a pagar de la cuota"
		Mostrar "Monto a pagar $1500 del 20/3"
		leer monto_pagar
		
		Si monto_pagar <=0 Entonces
			Mostrar "Error-Ingrese un valor correcto"
		Fin Si
	Fin Mientras
	
	//Hacemos un calculo para evaluar si le resta pagar la cuota
	saldo_pagar= 1500
	monto_final = saldo_pagar - monto_pagar 
	mostrar "El saldo a pagar de la cuota es de: $", monto_final
FinAlgoritmo
