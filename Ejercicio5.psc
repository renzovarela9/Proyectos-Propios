Algoritmo Ejercicio5
	//Declaracion de variables
	tiempo_part=-1
	minimo_tiempo=999999
	max_tiempo= 0
	tiempo_total_par=0
	acumulo_tiempo=0
	promedio=0.00
	contador = 1
	primero_meta = 0
	ultimo_meta = 0
	
    //MUESTRO EL MENU POR PANTALLA
	mientras contador <=10
		//validacion 
		mientras (tiempo_part <0 )
			mostrar "Ingrese el tiempo hecho en la carrera"
			leer tiempo_part
			
			si(tiempo_part <0) entonces
				mostrar "Error -INGRESE UN VALOR VALIDO"
			finsi
		finmientras
		
		//Ultimo y Primero en la meta
		//Primero
		si  tiempo_part < minimo_tiempo entonces
			minimo_tiempo =tiempo_part
			primero_meta= contador //uso una variable para guardar en el momento exacto donde el participante n completa la carrera en el minimo tiempo 
		finsi
		
		//Ultimo
		si tiempo_part > max_tiempo entonces
			max_tiempo = tiempo_part
			ultimo_meta=contador //uso una variable para guardar en el momento exacto donde el participante n completa la carrera en el maximo tiempo
		FinSi
		
		
		//Acumulador de tiempo
		tiempo_total_par=tiempo_total_par + tiempo_part
		
		//incremento de contador
		contador= contador +1

		//Inizializo las variables 
		tiempo_part=-1
		

	FinMientras
	
	// Tiempo promedio de los participantes
	promedio = tiempo_total_par/10
	
	//Salida por pantalla
	mostrar "El corredor numero ",primero_meta, " es el primero en terminar la carrera"
    mostrar "El corredor numero ",ultimo_meta, " es el ultimo en terminar la carrera"
	mostrar "El promedio de los 10 participantes es: ", promedio
	
FinAlgoritmo



//Prueba de escritorio
//tiempo_part=-1    minimo_timepo=999999   max_tiempo= 0   tiempo_total_par=0   acumulo_tiempo=0    promedio=0.00   contador = 1    primero_meta = 0   	ultimo_meta = 0
//   12                       12               12                12                    12                                   2               2                   2
//   7                        7
//
//
//
//
