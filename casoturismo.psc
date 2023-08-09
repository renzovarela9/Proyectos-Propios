Algoritmo caso_turismo
	//analisis
	//Entrada                      Proceso                                                                    salida
	//agencia                      menores_costo = 0,15                                                       cant_total_agenciaA
	//mes                          mayores_costo = 2                                                          cant_total_agenciaB 
	//destino                      cant_total_agenciaA = cant_agenciaA      //A                               cant_total_per_mayores_patagonia 
	//cantidad_per_mayores         cant_total_agenciaB = cant_agenciaB                                        cant_total_per_menores_patagonia 
	//cantidad_per_menores         cant_agenciaA = cant_agenciaA + 1                                          saldo_pagar
	//                             cant_agenciaB = cant_agenciaB +1                                           monto_total_facturado_destino
	//                             cant_mayores_patagonia = cant_mayores_patagonia +1                  //B    
	//                             cant_menores_patagonia = cant_menores_patagonia +1
	//                             cant_total_per_mayores_patagonia =  cant_mayores_patagonia                 
	//                             cant_total_per_menores_patagonia =  cant_menores_patagonia
	//                             
	//                             numero_pedido =   numero_pedido +1
	
	//                            saldo_pagar_costa = 100000.00
	//                            saldo_pagar_sierra = 199000.99
	//                            saldo_pagar_patagonia = 299999.99
	//
	//
	//                            saldo a pagar x destino x cantidad de personas en total
	
	//ENTRADA
	Definir agencia como entero
	Definir mes Como Entero
	definir destino Como Entero
	definir cantidad_per_mayores Como Entero
	definir cantidad_per_menores Como Entero
	definir carga Como Caracter
	
	//Proceso 
	Definir numero_pedido Como Entero
	Definir menores_costo Como Real
	definir mayores_costo Como Real
	definir cant_agenciaA como entero 
	definir cant_agenciaB Como Entero
	definir cant_mayores_patagonia Como Entero
	definir cant_menores_patagonia Como Entero
	definir saldo_pagar_costa como real
	definir saldo_pagar_sierra Como Real
	definir saldo_pagar_patagonia como real
	
	//SALIDA
	Definir cant_total_agenciaA Como Entero
	definir cant_total_agenciaB Como Entero
	Definir cant_total_per_mayores_patagonia Como Entero
	definir cant_total_per_menores_patagonia Como Entero
	Definir saldo_pagar Como Real
	definir monto_total_facturado_destino Como Real
	
	
	//++++++++++++++++++++++++++++++++++++++ PROGRAMA PRINCIPAL ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	//ENTRADA
	agencia = 0
	mes = 0  
	destino = 0 
    cantidad_per_mayores = 0 
	cantidad_per_menores = 0  
	carga = "s"
	
	//Proceso 
	numero_pedido = 0 
	menores_costo = 0.00 
	cant_agenciaB = 0
	cant_mayores_patagonia = 0 
	cant_menores_patagonia = 0 
	saldo_pagar_costa = 0.00
	saldo_pagar_sierra = 0.00 
	saldo_pagar_patagonia = 0.00 
	
	//SALIDA
	cant_total_agenciaA = 0
	cant_total_agenciaB = 0
	cant_total_per_mayores_patagonia = 0
	cant_total_per_menores_patagonia = 0
	saldo_pagar = 0.00
	monto_total_facturado_destino =  0.00
	
	
	//Validacion de datos 
	
	mientras carga == "s"
		
		//agencia
		mientras agencia <=0 o agencia >=3
			mostrar "Ingrese la agencia 1 o 2"
			leer agencia
			
			//mensaje de error
			si agencia <=0 o agencia >=3 Entonces
				mostrar "Error-ingrese un valor valido"
			FinSi//Fin mensaje 
		FinMientras//Fin agencia 
		
		
		//mes
		mientras mes <=0 o mes >=13
			mostrar "Ingrese mes de 1 a 12"
			leer mes
			
			//mensaje de error
			si mes <=0 o mes >=13 Entonces
				mostrar "Error-ingrese un valor valido"
			FinSi//Fin mensaje 
		FinMientras//Fin mes
		
		//destino
		mientras destino <=0 o destino >=4
			mostrar "Ingrese el destino 1: Costa 2: Sierra 3: Patagonia; "
			leer destino
			
			//mensaje de error
			si destino <=0 o destino >=4 Entonces
				mostrar "Error-ingrese un valor valido"
			FinSi//Fin mensaje 
		FinMientras//Fin destino
		
		
		
		
		
		
		
		
		
		//cargar datos de nuevo
		Mostrar "¿Desea seguir con la carga de datos?: s/n"
		leer carga
	FinMientras//Fin de cargar
	
	
	
	
FinAlgoritmo
