Algoritmo Ejercicio7guia2
	//Analisis
	//Entrada               proceso                                                                                                                         salida
	
	//num_uno             cont_aciertos = cont_aciertos +1                                                                                         cont_aciertos            //A
	//num_dos             cant_jugador_aciertos =  cant_jugador_aciertos + cont_aciertos                                                           cant_jugador_aciertos    //1
	//num_tres            monto_total_por_lote = monto_total_por_lote + premio                                                                     monto_total_por_lote     //2
	//premio              cantidad_total_aciertos =  cantidad_total_aciertos + cant_jugador_aciertos                                               cantidad_total_aciertos  //3                            
	//nombre_apellido     max_jugador_aciertos / cant_jugador_aciertos > max // max_jugador_aciertos = nombre_apellido //Pasa por un condicional   max_jugador_aciertos     //4
	//
	
	
	// Declarion de variables 
	//Entrada
	Definir num_uno Como entero
	Definir num_dos Como Entero
	Definir num_tres Como Entero
	Definir premio Como entero
	Definir nombre_apellido Como Caracter
	//Proceso
	Definir continuar Como Caracter
	Definir cliente1 Como Entero
	Definir cliente2 Como Entero
	Definir cliente3 Como Entero
	//Salida
	Definir cont_aciertos Como Entero
	Definir cant_jugador_aciertos Como Entero
	Definir monto_total_por_lote Como Entero
	Definir cantidad_total_aciertos Como Entero
	Definir max_jugador_aciertos Como caracter
	
	//Inicializar variables 
	num_uno = 0
	num_dos = 0
	num_tres = 0
	cliente1 = 0
	cliente2 = 0
	cliente3 = 0
	PREMIO = 10000
	nombre_apellido = ""
	continuar = "S"
	cont_aciertos = 0
	cant_jugador_aciertos = 0
	monto_total_por_lote = 0
	cantidad_total_aciertos = 0
	max_jugador_aciertos = ""
	
	//Programa Principal 
	mientras continuar == "S"
		
		//Comerciante
		mientras num_uno <=0
			Mostrar "Ingrese el primer numero para que su cliente acierte"
			leer num_uno
			
			si num_uno <=0 Entonces
				Mostrar "Error- Ingrese un numero valido"
			FinSi//Fin mensaje 
			
		FinMientras//Fin num_uno
		
		mientras num_dos <=0
			Mostrar "Ingrese el segundo numero para que su cliente acierte"
			leer num_dos
			
			si num_dos <=0 Entonces
				Mostrar "Error- Ingrese un numero valido"
			FinSi//Fin mensaje 
			
		FinMientras//Fin num_dos
		
		mientras num_tres <=0
			Mostrar "Ingrese el tercer numero para que su cliente acierte"
			leer num_tres
			
			si num_tres <=0 Entonces
				Mostrar "Error- Ingrese un numero valido"
			FinSi//Fin mensaje 
			
		FinMientras//Fin num_tres
		
		
		
		//cliente
		mientras nombre_apellido == ""
			Mostrar "Ingrese su nombre y apellido para registrar su jugada"
			leer nombre_apellido
			
			si nombre_apellido == "" Entonces
				Mostrar "Error- Ingrese un caracter valido"
			FinSi//Fin mensaje 
			
		FinMientras//Fin Nombre y Apellido
		
		
		mientras cliente1 <=0 o cliente1 >= 42
			Mostrar "Ingrese el primer numero para que acierte y pueda ganar un premio"
			leer cliente1
			
			si cliente1 <=0 o cliente1 >= 42 Entonces
				Mostrar "Error- Ingrese un numero valido"
			FinSi//Fin mensaje 
			
		FinMientras//Fin cliente1
		
		mientras cliente2 <=0 o cliente2 >= 42
			Mostrar "Ingrese el segundo numero para que acierte y pueda ganar un premio"
			leer cliente2
			
			si cliente2 <=0 o cliente2 >= 42 Entonces
				Mostrar "Error- Ingrese un numero valido"
			FinSi//Fin mensaje 
			
		FinMientras//Fin cliente2
		
		mientras cliente3 <=0 o cliente3 >= 42
			Mostrar "Ingrese el tercer numero para que acierte y pueda ganar un premio"
			leer cliente3
			
			si cliente3 <=0 o cliente3 >= 42 Entonces
				Mostrar "Error- Ingrese un numero valido"
			FinSi//Fin mensaje 
			
		FinMientras//Fin cliente1
		
		
		
		//Contador de aciertos
		si cliente1 == num_uno Entonces
			cont_aciertos = cont_aciertos +1         
			
		FinSi
		
		si cliente2 == num_dos Entonces
			cont_aciertos = cont_aciertos +1         
			
		FinSi
		
		si cliente3 == num_tres Entonces
			cont_aciertos = cont_aciertos +1         
			
		FinSi
		
		
		//1
		cant_jugador_aciertos =  cant_jugador_aciertos + cont_aciertos  
		
		si cont_aciertos == 3 Entonces
			Mostrar "Felicidades has ganado: ", PREMIO
		FinSi
		
		//2
		monto_total_por_lote = monto_total_por_lote + premio
		
		//3
		cantidad_total_aciertos =  cantidad_total_aciertos + cant_jugador_aciertos 
		
		//4
		si cant_jugador_aciertos > max entonces
			max = cant_jugador_aciertos
			max_jugador_aciertos = nombre_apellido 
		FinSi
		
		//Desea continuar
		Mostrar "¿Desea continuar?, S/N"
		Leer continuar
		
		//INICIALIZAR VARIABLES
		num_uno = 0
		num_dos = 0
		num_tres = 0
		cliente1 = 0
		cliente2 = 0
		cliente3 = 0
		nombre_apellido = ""
	FinMientras//Fin continuar
	
	

	
	//Informe
	//1
	Mostrar "La cantidad de aciertos que tuvo fueron: ", cant_jugador_aciertos //A
	
	//2
	Mostrar "El monto total pagado por loteria es: ", monto_total_por_lote //CORREGIR
	
	//3
	Mostrar "La cantidad total de aciertos son: ", cantidad_total_aciertos //CORREGIR
	
	//4
	Mostrar "El mayor jugador con aciertos es: ", max_jugador_aciertos

	
FinAlgoritmo
