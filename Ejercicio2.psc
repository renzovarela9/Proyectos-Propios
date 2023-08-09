Algoritmo Ejercicio1
	//Declaracion de variables 
	Definir monto_pagar Como Entero
	definir saldo_pagar Como Entero
	Definir monto_final Como Entero
	definir opsion Como Entero
	
	//inicializar variables
	monto_pagar = 0
	monto_final = 0
	saldo_pagar = 0
	opsion = 0
	
    //Menu + validacion
	Mientras opsion <=0 o opsion >=4 Hacer
		Mostrar "Elija el medio de pago en que desea abonar la cuota"
		Mostrar "1_ Efectivo: descuento del 10%"
		Mostrar "2_ Tarjeta de debido: recargo del 7% "
		Mostrar "3_ Tarjeta de crédito: recargos según la cantidad de pagos que desee el socio:"
		Mostrar "                              1 pago: 5%"
	    Mostrar "                              3 pagos: 10%"
	    Mostrar "                              6 pagos: 20%"

		leer opsion
		
		//Medios de pago
		Si opsion == 1 Entonces
			//Validacion del monto a pagar
			Mientras monto_pagar <=0 o monto_pagar>= 1351 Hacer
				mostrar "Ingrese el monto a pagar de la cuota"
				Mostrar "Monto a pagar $1350 aplicado el 10% de descuento del 20/3"
				leer monto_pagar
				
				Si monto_pagar <=0 o monto_pagar>= 1351 Entonces
					mostrar "Error-Ingrese un valor correcto"
				Fin Si
			Fin Mientras
			monto_final= 1350
			saldo_pagar = monto_final - monto_pagar//Efectivo 
			
		SiNo
			Si opsion == 2 Entonces
				//Validacion del monto a pagar
				Mientras monto_pagar <=0 o monto_pagar>= 1606 Hacer
					mostrar "Ingrese el monto a pagar de la cuota"
					Mostrar "Monto a pagar $1605 aplicado un recargo de 7% del 20/3"
					leer monto_pagar
					
					Si monto_pagar <=0 o monto_pagar>= 1606 Entonces
						mostrar "Error-Ingrese un valor correcto"
					Fin Si
				Fin Mientras
				monto_final = 1605
				saldo_pagar = monto_final - monto_pagar  //Tarjeta de debito
			Fin Si//Fin de opcion 2
	
		Fin Si//Fin de opcion 1
		
		si opsion == 3 Entonces
			opsion = 0
			Mientras opsion <=0 o opsion >=4 Hacer
				//Validacion del monto a pagar
				Mostrar "Elija una opcion:"
				Mostrar "(1) 1 pago: 5%"
				Mostrar "(2) 3 pagos: 10%"
				Mostrar "(3) 6 pagos: 20%"
				
				Leer  opsion
				
				si opsion == 1 Entonces
					Mientras monto_pagar <=0 o monto_pagar>= 1576 Hacer
						mostrar "Ingrese el monto a pagar de la cuota"
						Mostrar "Monto a pagar $1575 aplicado un recargo de 5% en un pago del 20/3"
						leer monto_pagar
						
						Si monto_pagar <=0 o monto_pagar>= 1576 Entonces
							Mostrar ""
							mostrar "Error-Ingrese un valor correcto"
							Mostrar ""
						Fin Si
					Fin Mientras
					monto_final = 1575
					saldo_pagar = monto_final - monto_pagar
					
				FinSi//Recargo del 5%
				
				si opsion == 2 Entonces
					Mientras monto_pagar <=0 o monto_pagar>= 551 Hacer
						mostrar "Ingrese el monto a pagar de la cuota"
						Mostrar "Monto a pagar $550 aplicado un recargo de 10% en 3 pagos del 20/3"
						leer monto_pagar
						
						Si monto_pagar <=0 o monto_pagar>= 551 Entonces
							Mostrar ""
							mostrar "Error-Ingrese un valor correcto"
							Mostrar ""
						Fin Si
					Fin Mientras
					monto_final = 550
					saldo_pagar = monto_final - monto_pagar
					
				FinSi//Recargo del 10%
				
				si opsion == 3 Entonces
					Mientras monto_pagar <=0 o monto_pagar>= 301 Hacer
						mostrar "Ingrese el monto a pagar de la cuota"
						Mostrar "Monto a pagar $300 aplicado un recargo de 20% en 6 pagos del 20/3"
						leer monto_pagar
						
						Si monto_pagar <=0 o monto_pagar>= 301 Entonces
							Mostrar ""
							mostrar "Error-Ingrese un valor correcto"
							Mostrar ""
						Fin Si
					Fin Mientras
					monto_final = 300
					saldo_pagar = monto_final - monto_pagar
					
				FinSi//Recargo del 20%
			FinMientras//Fin de opcion 3
			
		FinSi //Fin de opcion 3
		
	fin mientras //MENU

	Mostrar "el valor restante es a pagar es de: ", saldo_pagar, "$"
	
	
	

FinAlgoritmo// Fin de programa
