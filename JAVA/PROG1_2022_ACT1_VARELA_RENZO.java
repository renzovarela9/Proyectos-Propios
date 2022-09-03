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
   Paradigma empleado: programación lineal
   Ultima actualización: 20/5/22 15:55hs.
************************************************************************ */
public class CopaLigadeAFA {
    //Programa Principal
    public static void main(String args[]){
        
        //DECLARACIÓN DE OBJETO
        Scanner in=new Scanner(System.in);

        //DECLARACIÓN E INICIALIZACIÓN DE VARIABLES
        String usuario="";
        int opcion=0;
        int acumulador=0;
        int max=0, min=0;
        int riverPlate=0, bocaJuniors=0, independiente=0, racing=0, rosarioCentral=0, newells=0, banfield=0, lanus=0;

        //Programa Principal 
        System.out.println("Bienvenido a 4tos de final");
        System.out.println("ingrese su nombre: ");
        usuario=in.nextLine();
        System.out.println(usuario + " aquí te mostramos los enfrentamientos de la Copa Profesional de AFA");
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

        //Ciclo do While M E N U 
        do{
            System.out.println("Elija un equipo de fútbol");
            System.out.println("1. River Plate");
            System.out.println("2. Boca Juniors ");
            System.out.println("3. independiente");
            System.out.println("4. Racing");
            System.out.println("5. Rosario Central");
            System.out.println("6. Newell's");
            System.out.println("7. Banfield");
            System.out.println("8. Lanús ");
            opcion=in.nextInt();

            //Mensaje de error
			if(opcion<=0 || opcion >=9){
				System.out.println("Error - Ingrese una opción valida");
                System.out.println("");
			}
        }while(opcion <=0 ||opcion >=9);
        
        //I N G R E S O  1
        if(opcion ==1){
            //River
            riverPlate=17;
            lanus=13;
            //River pasa a semis
            if(riverPlate > lanus){
                acumulador=riverPlate + lanus;

                //Igualo acumulador al equipo con mas pts
                riverPlate=acumulador;
                racing=26;
                

                //River pasa a la final
                if(riverPlate > racing){
                    acumulador=riverPlate + racing;
                
                    //Igualo acumulador al equipo con mas pts
                    riverPlate=acumulador;
                    System.out.println("Con " + riverPlate + " Pts.");
                
                    //River gana la final
                    bocaJuniors=39;
                    if(riverPlate > bocaJuniors){
                        System.out.println("El ganador de la copa de la Liga Profesional de AFA es River Plate");
                    }

                }      
            }
            
            


        // I N G R E S O  2
        }else if(opcion ==2){
            //Boca
            bocaJuniors=16;
            banfield=11;
            //Boca pasa a semis
            if(bocaJuniors > banfield){
                acumulador=bocaJuniors + banfield;

                //Igualo acumulador al equipo con mas pts
                bocaJuniors=acumulador;
                independiente=12;
                

                //Boca pasa a la final
                if(bocaJuniors > independiente){
                    acumulador=bocaJuniors + independiente;
                
                    //Igualo acumulador al equipo con mas pts
                    bocaJuniors=acumulador;

                    riverPlate=56;
                    //Boca pierde la final
                    if(bocaJuniors < riverPlate){
                        System.out.println("Con " + bocaJuniors + " Pts.");
                        System.out.println("Lamentablemente Boca Juniors ha perdido la final de la copa de la Liga Profesional de AFA, frente a River Plate.");
                    }

                } 
            }
            

        // I N G R E S O  3
        }else if(opcion ==3){
            //Independiente
            independiente=12;
            newells=14;
            //Independiente perdie en 4tos
            if(independiente < newells){
                acumulador=newells - independiente;
                //Igualo acumulador al equipo con menos pts
                independiente=acumulador;
                //Dif 2 pts (Pierde en 4tos)
                System.out.println("Lamentablemente Independiente con 12 Pts. Y a diferencia de " + independiente + " Pts. Ha perdido 4tos de final frente a Newell´s.");
            }
            

        // I N G R E S O  4
        }else if(opcion ==4){
            //Racing
            racing=16;
            rosarioCentral=10;
            //Racing pasa a semis
            if(racing > rosarioCentral){
                acumulador=racing + rosarioCentral;

                //Igualo acumulador al equipo con menos pts
                racing=acumulador;
                riverPlate=30;
                 
                //Racing pierde semis
                if(racing < riverPlate){
                    acumulador=riverPlate - racing;
                 
                    //Igualo acumulador al equipo con menos pts
                    racing=acumulador;
                    //Dif 4 pts (Pierde en semis)
                    System.out.println("Lamentablemente Racing con 26 Pts.(Por acumulación) y a diferencia de " + racing + " Pts. Ha perdido Semifinal frente a River Plate.");
 
                } 
            }
           

        // I N G R E S O  5   
        }else if(opcion ==5){
            //Rosario Central
            racing=16;
            rosarioCentral=10;
            //Rosario Central pierde en 4tos
            if(racing > rosarioCentral){
                acumulador=racing - rosarioCentral;
                //Igualo acumulador al equipo con menos pts
                rosarioCentral=acumulador;
                //Dif 6 pts (Pierde en 4tos)
                System.out.println("Lamentablemente Rosario Central con 10 Pts. Y a diferencia de " + rosarioCentral + " Pts. Ha perdido 4tos de final frente a Racing.");

            }
           

        // I N G R E S O  6
        }else if(opcion ==6){
            //Newell´s
            independiente=12;
            newells=14;
            if(independiente < newells){
                acumulador=independiente + newells;
                //Igualo acumulador al equipo con menos pts
                newells=acumulador;
                bocaJuniors=27;
                 
                //Newell´s pierde semis
                if(newells < bocaJuniors){
                    acumulador=bocaJuniors - newells;
                 
                    //Igualo acumulador al equipo con menos pts
                    newells=acumulador;
                    //Dif 1 pts (Pierde en semis)
                    System.out.println("Lamentablemente Newell´s con 26 Pts.(Por acumulación) y a diferencia de " + newells + " Pts. Ha perdido Semifinal frente a Boca Juniors.");
 
                } 
            }

        // I N G R E S O  7
        }else if(opcion ==7){
            //Banfield
            bocaJuniors=16;
            banfield=11;
            //Banfield pierde en 4tos
            if(bocaJuniors > banfield){
                acumulador=bocaJuniors - banfield;
                //Igualo acumulador al equipo con menos pts
                banfield=acumulador;
                //Dif 5 pts (Pierde en 4tos)
                System.out.println("Lamentablemente Banfield con 11 Pts. Y a diferencia de " + banfield + " Pts. Ha perdido 4tos de final frente a Boca Juniors.");
                
            }
            
          
        // I N G R E S O 8    
        }else if(opcion ==8){
            //Lanús
            riverPlate=17;
            lanus=13;
            //Lanús pierde en 4tos
            if(riverPlate > lanus){
                acumulador=riverPlate - lanus;
                //Igualo acumulador al equipo con menos pts
                lanus=acumulador;
                //Dif 4 pts (Pierde en 4tos)
                System.out.println("Lamentablemente Lanús con 13 Pts. Y a diferencia de " + lanus + " Pts. Ha perdido 4tos de final frente a River Plate.");
            }

        }


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
        //Max y min
        riverPlate=56;
        if(riverPlate > max){
            max=riverPlate; //River Plate tiene 56 pts
            min=26; //Racing y Newell´s tienen ambos 26 pts
            System.out.println("El mayor equipo con puntos acumulados es: River Plate con " + max + " Pts.");
            System.out.println("Los menores equipos con puntos acumulados son: Racing y Newell´s con " + min + " Pts.");
        }
        //Limpiar Variables
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