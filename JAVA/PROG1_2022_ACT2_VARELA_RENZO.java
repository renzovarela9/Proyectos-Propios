/* ***********************************************************************************
             A N A L I S I S 
/* ***********************************************************************************
 
--------------------------------------------------------------------------------------   
    ENTRADA          |           PROCESOS                        |   SALIDAS
--------------------------------------------------------------------------------------
usuario              |//Ingreso 1                                |max=riverPlate
opcion               |riverPlate=17                              |min=26
                     |lanus=13
                     |racing=26
                     |bocaJuniors=39
                     |acumulador=riverPlate + lanus
                     |riverPlate=acumulador
                     |acumulador=riverPlate + racing
                     |
                     |//Ingreso 2
                     |bocaJuniors=16
                     |banfield=11
                     |independiente=12
                     |riverPlate=56
                     |acumulador=bocaJuniors + banfield
                     |bocaJuniors=acumulador
                     |acumulador=bocaJuniors + independiente
                     |bocaJuniors=acumulador
                     |
                     |//Ingreso 3
                     |independiente=12
                     |newells=14
                     |acumulador=newells - independiente
                     |independiente=acumulador
                     |
                     |//Ingreso 4
                     |racing=16
                     |rosarioCentral=10
                     |riverPlate=30
                     |acumulador=racing + rosarioCentral
                     |racing=acumulador
                     |acumulador=riverPlate - racing;                                   
                     |racing=acumulador
                     |
                     |//Ingreso 5
                     |racing=16
                     |rosarioCentral=10
                     |acumulador=racing - rosarioCentral            
                     |rosarioCentral=acumulador
                     |
                     |//Ingreso 6
                     |independiente=12
                     |newells=14
                     |bocaJuniors=27
                     |acumulador=independiente + newells             
                     |newells=acumulador;                                             
                     |acumulador=bocaJuniors - newells                                  
                     |newells=acumulador
                     |
                     |//Ingreso 7
                     |bocaJuniors=16
                     |banfield=11            
                     |acumulador=bocaJuniors - banfield           
                     |banfield=acumulador
                     |
                     |//Ingreso 8
                     |riverPlate=17
                     |lanus=13         
                     |acumulador=riverPlate - lanus
                     |lanus=acumulador                      
--------------------------------------------------------------------------------------*/
/* ************************************************************************
                          L I B R E R I A S
*  ***********************************************************************/
import java.util.Scanner;

/* ************************************************************************
   Materia: Programación I
   Fecha: 19/5/22
   Autor: Renzo Varela
   Descripción: Copa de la Liga Profesional de AFA.
                Enfrentamientos y progreso del torneo.
                Elije tu equipo y podras ver si es
                capaz de ganar la copa.
   Paradigma empleado: programación modular
   Ultima actualización: 23/5/22 01:10hs.
************************************************************************ */

public class CopaLigadeAFA_modular{
	/* ************************************************************************
                 P R O G R A M A     P R I N C I P A L
    *  ***********************************************************************/
	
	public static void main(String args[]){
		//Declaración de objetos
		Scanner in=new Scanner(System.in);

		//Declaracion e inicialzación de variables
        String usuario="";
        int opcion=0;
        int acumulador=0;
        int max=0, min=0;
        int riverPlate=0, bocaJuniors=0, independiente=0, racing=0, rosarioCentral=0, newells=0, banfield=0, lanus=0;



        usuario= usuario_str(); //Llamo a la Funcion INGRESE SU NOMBRE
        System.out.println(usuario + " aquí te mostramos los enfrentamientos de la Copa Profesional de AFA");

        enfrentamientos(); //llamo al procedimiento ENFRENTAMIENTOS  INICIO

        //Ciclo Do While menu
        do{
            menu(); ////Llamo al procedimiento menu
            opcion=ingresar_opcion(); //llamo a la funcion ingresar una opción

        }while(opcion <=0 ||opcion >=9);

        //Depende de lo que ingrese se llamara a la funcion de su equipo
        if(opcion==1){
            opcion_1(opcion, riverPlate, lanus, acumulador, racing, bocaJuniors);
        }else if(opcion==2){
            opcion_2(opcion, riverPlate, lanus, acumulador, racing, bocaJuniors, banfield, independiente);
        }else if(opcion==3){
            opcion_3(opcion, independiente, newells, acumulador);
        }else if(opcion==4){
            opcion_4(opcion, racing, rosarioCentral, riverPlate, acumulador);
        }else if(opcion==5){
            opcion_5(opcion, rosarioCentral, racing, acumulador);
        }else if(opcion==6){
            opcion_5(opcion, rosarioCentral, racing, acumulador);
        }else if(opcion==7){
            opcion_7(opcion, bocaJuniors, banfield, acumulador);
        }else if(opcion==8){
            opcion_8(opcion, riverPlate, lanus, acumulador);
        }

        enfrentamientosFin(); //llamo al procedimiento ENFRENTAMIENTOS  FINAL

        //Resultado final del TORNEO. Maximos y minimos 
        max_min(riverPlate, max, min); //Llamo al procedimiento con parametros de maximos y minimos

        //Inicializar Variables
        usuario="";
        opcion=0;
        acumulador=0;
        max=0;
        min=0;
        riverPlate=0;
        bocaJuniors=0;
        independiente=0;
        racing=0;
        rosarioCentral=0;
        newells=0; 
        banfield=0;
        lanus=0;

    }//F I N A L  D E  P R O G R A M A  P R I N C I P A L

    /* ************************************************************************
                                   M O D U L O S
    *  ***********************************************************************/

    /* ************************************************************************
                         I N G R E S E  S U  N O M B R E
    *  ************************************************************************
     	Descripción: Ingre su nombre por teclado
		tipo: Función
		párametros de entrada: ninguno
		páramentros de salida: Nombre de usuario

    ********************************************************************** */
    //Nombre de usuario
    public static String usuario_str(){
        //Declaración de objeto
        Scanner in=new Scanner(System.in);
        //Declaración de Variable
        String pusuario="";
        //Imprime mensaje 
        System.out.println("Bienvenido a 4tos de final");
        System.out.println("ingrese su nombre: ");
        
        //Devolución de paametro de salida
        return pusuario=in.nextLine(); 
        
    }//Fin de ingresar su nombre

    /* ************************************************************************
                 E N F R E N T A M I E N T O S  I N I C I O
    *  ************************************************************************
     	Descripción: Imprime enfrentamientos de 4to de final
		tipo: procedimiento
		párametros de entrada: ninguno
		páramentros de salida: ninguno

    ********************************************************************** */
    //ENFRENTAMIENTOS FASE INICIO
    public static void enfrentamientos(){
        System.out.println("");
        System.out.println("**********************************************************************************************************************************************");
        System.out.println(" _______________                                                                                                 _______________              ");
        System.out.println("|Rosario Central|                                                                                               | independiente |             ");
        System.out.println("        |             _______________                                                      _______________             |                      ");
        System.out.println("        | ---------- |               |                                                    |               | ---------- |                      ");
        System.out.println("        |                                                                                                              |                      ");
        System.out.println(" _______________             |                                                                    |              _______________              ");
        System.out.println("|    Racing     |            |                                                                    |             |   Newell's    |             ");
        System.out.println("                             | S E M I    _______________  F I N A L   _______________  S E M I   |                                           ");
        System.out.println("   C U A R T O S             | --------- |               | ---------- |               | --------- |              C U A R T O S                ");
        System.out.println("   D E F I N A L             | F I N A L                                                F I N A L |              D E F I N A L                ");
        System.out.println(" _______________             |                                                                    |              _______________              ");
        System.out.println("|     Lanus     |            |                                                                    |             |   Banfield    |             ");
        System.out.println("        |             _______________                                                      _______________             |                      ");
        System.out.println("        | ---------- |               |                                                    |               | ---------- |                      ");
        System.out.println("        |                                                                                                              |                      ");
        System.out.println(" _______________                                                                                                 _______________              ");
        System.out.println("|  River Plate  |                                                                                               | Boca Juniors  |             ");
        System.out.println("                                                                                                                                              ");
        System.out.println("**********************************************************************************************************************************************");
    }//FIN DE ENFRENTAMIENTOS
	
	/* ************************************************************************
                                   M E N U
    *  ************************************************************************
     	Descripción: Dibuja un menu en panalla con las opciones
		tipo: procedimiento
		párametros de entrada: ninguno
		páramentros de salida: ninguno

    ********************************************************************** */
    // M E N  U
    public static void menu(){
        System.out.println("Elija un equipo de fútbol");
        System.out.println("1. River Plate");
        System.out.println("2. Boca Juniors ");
        System.out.println("3. independiente");
        System.out.println("4. Racing");
        System.out.println("5. Rosario Central");
        System.out.println("6. Newell's");
        System.out.println("7. Banfield");
        System.out.println("8. Lanús ");
    }//Final de menu

    /* ************************************************************************
                      I N G R E S A R    O P C I O N
    *  ************************************************************************
     	Descripción: ingreso y valido la opción elegida por el usuario
		tipo: funcion
		párametros de entrada: ninguno
		páramentros de salida: opcion

    ********************************************************************** */
    //Ingrese una opcion
	public static int ingresar_opcion(){
		
		//Declaración de objetos
		Scanner in=new Scanner(System.in);
		
		//Declaracón de variables locales
		int opcion=0;
		
		do  {
				System.out.println("Seleccione una opcion:");
				opcion=in.nextInt();

                //Mensaje de error
		        if(opcion<=0 || opcion >=9){
                    System.out.println("Error - Ingrese una opción valida");
                    System.out.println("");
		        }
        }while(opcion<1 || opcion >=9);
	
		//Devuelvo un párametro
		return opcion;

    }//Fin de ingresar opcion

    /* ************************************************************************
                      I N G R E S A R    O P C I O N  U N O
    *  ************************************************************************
     	Descripción: ingreso 1
		tipo: funcion
		párametros de entrada: ninguno
		páramentros de salida: opcion 1

    ********************************************************************** */
    //I N G R E S O  1
    public static void opcion_1(int popcion, int priverPlate, int planus, int pacumulador, int pracing, int pbocaJuniors){
        
        if(popcion ==1){
            //River
            priverPlate=17;
            planus=13;
            //River pasa a semis
            if(priverPlate > planus){
                pacumulador=priverPlate + planus;
    
                //Igualo acumulador al equipo con mas pts
                priverPlate=pacumulador;
                pracing=26;
                
    
                //River pasa a la final
                if(priverPlate > pracing){
                    pacumulador=priverPlate + pracing;
                
                    //Igualo acumulador al equipo con mas pts
                    priverPlate=pacumulador;
                    System.out.println("Con " + priverPlate + " Pts.");
                
                    //River gana la final
                    pbocaJuniors=39;
                    if(priverPlate > pbocaJuniors){
                        System.out.println("El ganador de la copa de la Liga Profesional de AFA es River Plate");
                    }
                }      
            }
        }
        
    }//Fin de ingreso 1

    /* ************************************************************************
                      I N G R E S A R    O P C I O N   D O S
    *  ************************************************************************
     	Descripción: ingreso 2
		tipo: funcion
		párametros de entrada: ninguno
		páramentros de salida: opcion 2

    ********************************************************************** */
    // I N G R E S O  2
    public static void opcion_2(int ropcion,int rriverPlate, int rlanus, int racumulador, int rracing, int rbocaJuniors, int rbanfield, int rindependiente) {
        if(ropcion ==2){
            //Boca
            rbocaJuniors=16;
            rbanfield=11;
            //Boca pasa a semis
            if(rbocaJuniors > rbanfield){
                racumulador=rbocaJuniors + rbanfield;

                //Igualo acumulador al equipo con mas pts
                rbocaJuniors=racumulador;
                rindependiente=12;
            
                //Boca pasa a la final
                if(rbocaJuniors > rindependiente){
                    racumulador=rbocaJuniors + rindependiente;
            
                    //Igualo acumulador al equipo con mas pts
                    rbocaJuniors=racumulador;

                    rriverPlate=56;
                    //Boca pierde la final
                    if(rbocaJuniors < rriverPlate){
                        System.out.println("Con " + rbocaJuniors + " Pts.");
                        System.out.println("Lamentablemente Boca Juniors ha perdido la final de la copa de la Liga Profesional de AFA, frente a River Plate.");
                    }
                } 
            }
        }

    }//Fin ingreso 2
   
    /* ************************************************************************
                      I N G R E S A R    O P C I O N    T R E S
    *  ************************************************************************
     	Descripción: ingreso 3
		tipo: funcion
		párametros de entrada: ninguno
		páramentros de salida: opcion 3

    ********************************************************************** */
    //I N G R E S O  3
    public static void opcion_3(int sopcion, int sindependiente, int snewells, int sacumulador){
        if(sopcion ==3){
            //Independiente
            sindependiente=12;
            snewells=14;
            //Independiente perdie en 4tos
            if(sindependiente < snewells){
                sacumulador=snewells - sindependiente;
                //Igualo acumulador al equipo con menos pts
                sindependiente=sacumulador;
                //Dif 2 pts (Pierde en 4tos)
                System.out.println("Lamentablemente Independiente con 12 Pts. Y a diferencia de " + sindependiente + " Pts. Ha perdido 4tos de final frente a Newell´s.");
            }
        }    
    }//Fin de ingreso 3

    /* ************************************************************************
                      I N G R E S A R    O P C I O N    C U A T R O
    *  ************************************************************************
     	Descripción: ingreso 4
		tipo: funcion
		párametros de entrada: ninguno
		páramentros de salida: opcion 4

    ********************************************************************** */
    //I N G R E S O  4
    public static void opcion_4(int bopcion, int bracing, int brosarioCentral, int briverPlate, int bacumulador){
        if(bopcion ==4){
            //Racing
            bracing=16;
            brosarioCentral=10;
            //Racing pasa a semis
            if(bracing > brosarioCentral){
                bacumulador=bracing + brosarioCentral;

                //Igualo acumulador al equipo con menos pts
                bracing=bacumulador;
                briverPlate=30;
                 
                //Racing pierde semis
                if(bracing < briverPlate){
                    bacumulador=briverPlate - bracing;
                 
                    //Igualo acumulador al equipo con menos pts
                    bracing=bacumulador;
                    //Dif 4 pts (Pierde en semis)
                    System.out.println("Lamentablemente Racing con 26 Pts.(Por acumulación) y a diferencia de " + bracing + " Pts. Ha perdido Semifinal frente a River Plate.");
 
                } 
            }
        }    
    }//Fin de ingreso 4

    /* ************************************************************************
                      I N G R E S A R    O P C I O N    C I N C O
    *  ************************************************************************
     	Descripción: ingreso 5
		tipo: funcion
		párametros de entrada: ninguno
		páramentros de salida: opcion 5

    ********************************************************************** */
    //I N G R E S O 5
    public static void opcion_5(int qopcion, int qrosarioCentral,int qracing, int qacumulador){
        if(qopcion ==5){
            //Rosario Central
            qracing=16;
            qrosarioCentral=10;
            //Rosario Central pierde en 4tos
            if(qracing > qrosarioCentral){
                qacumulador=qracing - qrosarioCentral;
                //Igualo acumulador al equipo con menos pts
                qrosarioCentral=qacumulador;
                //Dif 6 pts (Pierde en 4tos)
                System.out.println("Lamentablemente Rosario Central con 10 Pts. Y a diferencia de " + qrosarioCentral + " Pts. Ha perdido 4tos de final frente a Racing.");

            }
        }    
    }//Fin de ingreso 5

    /* ************************************************************************
                      I N G R E S A R    O P C I O N    S E I S
    *  ************************************************************************
     	Descripción: ingreso 6
		tipo: funcion
		párametros de entrada: ninguno
		páramentros de salida: opcion 6

    ********************************************************************** */
    //I N G R E S O  6
    public static void opcion_6(int lopcion, int lindependiente, int lnewells, int lbocaJuniors, int lacumulador){
        if(lopcion ==6){
            //Newell´s
            lindependiente=12;
            lnewells=14;
            if(lindependiente < lnewells){
                lacumulador=lindependiente + lnewells;
                //Igualo acumulador al equipo con menos pts
                lnewells=lacumulador;
                lbocaJuniors=27;
                 
                //Newell´s pierde semis
                if(lnewells < lbocaJuniors){
                    lacumulador=lbocaJuniors - lnewells;
                 
                    //Igualo acumulador al equipo con menos pts
                    lnewells=lacumulador;
                    //Dif 1 pts (Pierde en semis)
                    System.out.println("Lamentablemente Newell´s con 26 Pts.(Por acumulación) y a diferencia de " + lnewells + " Pts. Ha perdido Semifinal frente a Boca Juniors.");
 
                } 
            }
        }    
    }//Fin de ingreso 6

    /* ************************************************************************
                      I N G R E S A R    O P C I O N    S I E T E
    *  ************************************************************************
     	Descripción: ingreso 7
		tipo: funcion
		párametros de entrada: ninguno
		páramentros de salida: opcion 7

    ********************************************************************** */
    //I N G R E S O 7
    public static void opcion_7(int mopcion, int mbocaJuniors, int mbanfield, int macumulador){
        if(mopcion ==7){
            //Banfield
            mbocaJuniors=16;
            mbanfield=11;
            //Banfield pierde en 4tos
            if(mbocaJuniors > mbanfield){
                macumulador=mbocaJuniors - mbanfield;
                //Igualo acumulador al equipo con menos pts
                mbanfield=macumulador;
                //Dif 5 pts (Pierde en 4tos)
                System.out.println("Lamentablemente Banfield con 11 Pts. Y a diferencia de " + mbanfield + " Pts. Ha perdido 4tos de final frente a Boca Juniors.");
                
            }
        }    
    }//Fin de ingreso 7

    /* ************************************************************************
                      I N G R E S A R    O P C I O N    O C H O
    *  ************************************************************************
     	Descripción: ingreso 8
		tipo: funcion
		párametros de entrada: ninguno
		páramentros de salida: opcion 8

    ********************************************************************** */
    //I N G R E S O 8
    public static void opcion_8(int uopcion, int uriverPlate, int ulanus, int uacumulador){
        if(uopcion ==8){
            //Lanús
            uriverPlate=17;
            ulanus=13;
            //Lanús pierde en 4tos
            if(uriverPlate > ulanus){
                uacumulador=uriverPlate - ulanus;
                //Igualo acumulador al equipo con menos pts
                ulanus=uacumulador;
                //Dif 4 pts (Pierde en 4tos)
                System.out.println("Lamentablemente Lanús con 13 Pts. Y a diferencia de " + ulanus + " Pts. Ha perdido 4tos de final frente a River Plate.");
            }

        }
    }//Fin de ingreso 8

    /* ************************************************************************
                 E N F R E N T A M I E N T O S  F I N A L
    *  ************************************************************************
     	Descripción: Imprime enfrentamientos de 4to de final
		tipo: procedimiento
		párametros de entrada: ninguno
		páramentros de salida: ninguno

    ********************************************************************** */
    //ENFRENTAMIENTOS FASE FINAL
    public static void enfrentamientosFin(){
        //Final de enfrentamientos
        System.out.println("");
        System.out.println("**********************************************************************************************************************************************");
        System.out.println(" _______________                                                                                                 _______________              ");
        System.out.println("|Rosario Central|                                                                                               | independiente |             ");
        System.out.println("        |             _______________                                                      _______________             |                      ");
        System.out.println("        | ---------- |   Racing      |                                                    |    Newell's   | ---------- |                      ");
        System.out.println("        |                                                                                                              |                      ");
        System.out.println(" _______________             |                                                                    |              _______________              ");
        System.out.println("|    Racing     |            |                                                                    |             |   Newell's    |             ");
        System.out.println("                             | S E M I    _______________  F I N A L   _______________  S E M I   |                                           ");
        System.out.println("   C U A R T O S             | --------- |  River Plate  | ---------- |  Boca Juniors | --------- |              C U A R T O S                ");
        System.out.println("   D E F I N A L             | F I N A L                                                F I N A L |              D E F I N A L                ");
        System.out.println(" _______________             |                                                                    |              _______________              ");
        System.out.println("|     Lanus     |            |                                                                    |             |   Banfield    |             ");
        System.out.println("        |             _______________                                                      _______________             |                      ");
        System.out.println("        | ---------- |   River Plate |                                                    |  Boca Juniors | ---------- |                      ");
        System.out.println("        |                                                                                                              |                      ");
        System.out.println(" _______________                                                                                                 _______________              ");
        System.out.println("|  River Plate  |                                                                                               | Boca Juniors  |             ");
        System.out.println("                                                                                                                                              ");
        System.out.println("**********************************************************************************************************************************************"); 
    }//FIN DE ENFRENTAMIENTOS
    
    /* ************************************************************************
                 M A X I M O S  Y  M I N I M O S
    *  ************************************************************************
     	Descripción: Del torneo evaluamos el mejor equipo y el peor equipo.
		tipo: Función
		párametros de entrada: ninguno
		páramentros de salida: ninguno

    ********************************************************************** */
    //Max y min PARAMETRO
    private static void max_min(int priverPlate, int pmax, int pmin){
        
        priverPlate=56;
        if(priverPlate > pmax){
            pmax=priverPlate; //River Plate tiene 56 pts
            pmin=26; //Racing y Newell´s tienen ambos 26 pts
            System.out.println("El mayor equipo con puntos acumulados es: River Plate con " + pmax + " Pts.");
            System.out.println("Los menores equipos con puntos acumulados son: Racing y Newell´s con " + pmin + " Pts.");
        }
        
    }//Fin de max y min

}//F I N A L  D E  C L A S E 
/* *****************************************************************************************************************************
                                         P R U E B A     D E    E S C R I T O R I O
/* *****************************************************************************************************************************
 
--------------------------------------------------------------------------------------------------------------------------------
usuario  opcion  acumulador  max  min  riverPlate  bocaJuniors  independiente  racing  rosarioCentral  newells  banfield  lanus
--------------------------------------------------------------------------------------------------------------------------------
""         0        0         0    0       0           0              0          0          0            0          0       0
Renzo      0        0         0    0       0           0              0          0          0            0          0       0
Renzo      1        0         0    0       0           0              0          0          0            0          0       0
Renzo      1        0         0    0      17           0              0          0          0            0          0      13
Renzo      1       30         0    0      17           0              0          0          0            0          0      13
Renzo      1       30         0    0      17           0              0         26          0            0          0      13
Renzo      1       56         0    0      56           0              0         26          0            0          0      13
Renzo      1       56         0    0      56          39              0         26          0            0          0      13
""         0        0         0    0       0           0              0          0          0            0          0       0
--------------------------------------------------------------------------------------------------------------------------------*/