Algoritmo Ejercicio9
	//Declaracion de variables 
	Definir codigo_deposito  Como Caracter
	definir modelo_vehiculo Como Caracter
	Definir unidades como entero
	Definir continuar Como Caracter
	
	definir cant_mov_stock, cantidad, stock_deposito, stock_max_uni, stock_movimiento, maxmov, maxunidades, total_stock Como Entero
	Definir stockDCMA, stockDCMB, stockDCMC, stockDNMA, stockDNMB, stockDNMC, stockDSMA, stockDSMB, stockDSMC Como Entero
	//Programa principal
	
	codigo_deposito = "A"
	modelo_vehiculo = "Z"
	unidades = 0
	precio_a=500000
	precio_b=600000
	precio_c=750000
	maxmov=0
	maxcant=0
	
	
	//Defenir variables
	continuar = "S"
	
	mientras continuar <> "N"
		
		//CODIGO DEL DEPOSITO
		Mientras codigo_deposito <> "C" Y codigo_deposito <> "N" Y codigo_deposito <> "S"
			mostrar "Ingrese el codigo deposito: "
			leer codigo_deposito
			
			si codigo_deposito <> "C" Y codigo_deposito <> "N" Y codigo_deposito <> "S" Entonces
				Mostrar "ERROR-Ingrese un valor valido"
			FinSi//Fin deL MENSAJE DEPOSITO
			
		FinMientras//Fin de la validacion del deposito
		
		//DEPOSITO C
		Si codigo_deposito == "C" Entonces
			
			//MODELO DE VEHICULO
			Mientras modelo_vehiculo <> "A" Y modelo_vehiculo <> "B" Y modelo_vehiculo <> "C"
				mostrar "Ingrese el Modelo del vehiculo: "
				leer modelo_vehiculo
				
				si modelo_vehiculo <> "A" Y modelo_vehiculo <> "B" Y modelo_vehiculo <> "C" Entonces
					Mostrar "ERROR-Ingrese un valor valido"
				FinSi//Fin deL MENSAJE MODELO DE VEHICULO
				
				//UNIDADES
				Mientras unidades <= 0
					mostrar "Ingrese las unidades del modelo: "
					leer unidades
					
					si unidades <= 0 
						Mostrar "ERROR-Ingrese un valor valido"
					FinSi//Fin deL MENSAJE unidades
					
				FinMientras//Fin del bucle
				
				//PUNTO B
				//Contador de stock x deposito x modelo
				stockDCMA=stockDCMA + unidades
				stockDCMB=stockDCMB + unidades
				stockDCMC=stockDCMC + unidades
				
				
				// Punto C
				//stock valorizado
				stock_movimientoC = (stockDCMA*precio_a) + (stockDCMB*precio_b) + (stockDCMC*precio_c)
				
				
				
			FinMientras//Fin del bucle
			
		FinSi//Fin de deposito C
		
		//DEPOSITO N
		Si codigo_deposito == "N" Entonces
			
			//MODELO DE VEHICULO
			Mientras modelo_vehiculo <> "A" Y modelo_vehiculo <> "B" Y modelo_vehiculo <> "C"
				mostrar "Ingrese el Modelo del vehiculo: "
				leer modelo_vehiculo
				
				si modelo_vehiculo <> "A" Y modelo_vehiculo <> "B" Y modelo_vehiculo <> "C" Entonces
					Mostrar "ERROR-Ingrese un valor valido"
				FinSi//Fin deL MENSAJE MODELO DE VEHICULO
				
				//UNIDADES
				Mientras unidades <= 0
					mostrar "Ingrese las unidades del modelo: "
					leer unidades
					
					si unidades <= 0 
						Mostrar "ERROR-Ingrese un valor valido"
					FinSi//Fin deL MENSAJE unidades
					
				FinMientras//Fin del bucle
				
			FinMientras
			
			//PUNTO B
			//Contador de stock x deposito x modelo
			stockDNMA= stockDNMA +unidades
			stockDNMB = stockDNMB +unidades
			stockDNMC = stockDNMC +unidades
			
			
			// Punto C
			//stock valorizado
			stock_movimientoN = (stockDNMA*precio_a) + (stockDNMB*precio_b) + (stockDNMC*precio_c)
			
		FinSi//Fin de deposito N
		
		//DEPOSITO S
		Si codigo_deposito == "S" Entonces
			
			//MODELO DE VEHICULO
			Mientras modelo_vehiculo <> "A" Y modelo_vehiculo <> "B" Y modelo_vehiculo <> "C"
				mostrar "Ingrese el Modelo del vehiculo: "
				leer modelo_vehiculo
				
				si modelo_vehiculo <> "A" Y modelo_vehiculo <> "B" Y modelo_vehiculo <> "C" Entonces
					Mostrar "ERROR-Ingrese un valor valido"
				FinSi//Fin deL MENSAJE MODELO DE VEHICULO
				
				//UNIDADES
				Mientras unidades <= 0
					mostrar "Ingrese las unidades del modelo: "
					leer unidades
					
					si unidades <= 0 
						Mostrar "ERROR-Ingrese un valor valido"
					FinSi//Fin deL MENSAJE unidades
					
				FinMientras//Fin del bucle
				
			FinMientras
			
			//PUNTO B
			//Contador de stock x deposito x modelo
			stockDSMA = stockDSMA + unidades
			stockDSMB = stockDSMB + unidades
			stockDSMC = stockDSMC + unidades
			
			// Punto C
			//stock valorizado
			stock_movimientoS = (stockDSMA*precio_a) + (stockDSMB*precio_b) + (stockDSMC*precio_c)
			
		FinSi//Fin de deposito S
		
		
		//continuar
		Mostrar "Desea cargar otro movimiento de stock: S/N"
		Leer continuar
		
		//Contador por movimientos de stock
		cant_mov_stock = cant_mov_stock +1 //A
		
		//max
		//variable.... maxmov=0
		si (cant_mov_stock=1) Entonces
			maxmov= cant_mov_stock//identificacion
			maxunidades=unidades //guardamos el stock actual
		sino 
			si (unidades > maxcant) Entonces
				maxmov =cant_mov_stock
				maxunidades=unidades
			FinSi
		FinSi
		
		//INICIALIZAR
		codigo_deposito = "A"
		modelo_vehiculo = "Z"
		unidades = 0
		
	FinMientras// FIn del movimiento
	
	//MONTO TOTAL DEL MOVIMIENTO DE STOCK 
	total_stock= stock_movimientoC + stock_movimientoN + stock_movimientoS
	
	
	mostrar "Cantidad de movimientos de stock:", cant_mov_stock
	mostrar "Stock total valorizado:",total_stock
	mostrar "Deposito S - Stock del modelo A (en unidades):", stockDSMA
	mostrar "Deposito S - Stock del modelo B:(en unidades)", stockDSMB
	mostrar "Deposito S - Stock del modelo C:(en unidades)", stockDSMC
	mostrar "Movimiento de stock con maximo stock:", maxmov



	

FinAlgoritmo
 