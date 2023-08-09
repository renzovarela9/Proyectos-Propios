import java.util.Scanner;
//8. Ventas por sucursal Ingresar una serie de números por teclado que 
//representan la cantidad de ventas realizadas en las diferentes
// sucursales de un país de una determinada empresa. Los requerimientos del programa son:
// Informar la cantidad de ventas ingresadas
//Total de ventas .Cantidad de ventas cuyo valores te comprendido entre 100 y 300 unidades
// Cantidad de ventas con 400,500y600 unidades.
//Indicar si hubo una cantidad de ventas inferior a 50 unidades. 
//Usted deberá ingresar cantidades de ventas hasta que se ingrese un valor negativo

//Analisis
//Entrada---------proceso------------------------------------------------------------------------------salida
//ventas          total_can_ventas = total_can_ventas + ventas                                        total_cant_ventas
//                if ventas <=300 || ventas >=100                                                     cant_ventas_100_300
//                    cant_ventas400 = cant_ventas400 +1                                              cant_ventas400
//                                                                                                    cant_ventas500
//                if ventas <=599 || ventas >=500                                                     cant_ventas600
//                    cant_ventas500 = cant_ventas500 +1                                              cant_ventas_inferior
//                
//                if ventas <=699 || ventas >=600                                                     
//                    cant_ventas600 = cant_ventas600 +1
//
//                if ventas <50
//                     cant_ventas_inferior = cant_ventas_inferior +1
//
//
//                                    
public class Ejercicio8 {
    public static void main(String[] args) {
    
        //Declaracion de objeto
        Scanner in = new Scanner(System.in);

        //Declaracion de variables
        int  ventas, total_cant_ventas, cant_ventas_100_300, cant_ventas400, cant_ventas500, cant_ventas600, cant_ventas_inferior;

        //Defino variables
        ventas = 1;
        total_cant_ventas = 0;
        cant_ventas_100_300 = 0;
        cant_ventas400 = 0;
        cant_ventas500 = 0;
        cant_ventas600 = 0;
        cant_ventas_inferior = 0;

        //Inicio Prgrama con un ciclo while
        while (ventas != 0){
            System.out.println("Ingrese la cantidad de unidades que ha vendido: ");
            ventas = in.nextInt();

            total_cant_ventas = total_cant_ventas + ventas;

            if (ventas <301 && ventas >99){
                System.out.println("Ventas entre 100 y 300: " + ventas + " Hubo");
                    cant_ventas_100_300 = cant_ventas_100_300 +1;

            }//Fin ventas entre 100 y 300                                                     
                                                                
            
            if (ventas <500 && ventas >399){
                System.out.println("Ventas entre 400: " + ventas + " Hubo");
                cant_ventas400 = cant_ventas400 +1;
            }//Fin ventas 400                                                    
                                                             
                          
            if (ventas <600 && ventas >499){
                System.out.println("Ventas entre 500: " + ventas + " Hubo");
                cant_ventas500 = cant_ventas500 +1;
            }//Fin ventas 500                                                     
                

            if (ventas <700 && ventas >599){
                System.out.println("Ventas entre 600: " + ventas + " Hubo");
                cant_ventas600 = cant_ventas600 +1;
            }//fin ventas 600                                                     
                
            
            if (ventas <50){
                System.out.println("Ventas inferior a 50: " + ventas + " Hubo");
                cant_ventas_inferior = cant_ventas_inferior +1;
            }//fin cantidad de ventas inferior a 50
                



        }//fin bucle

        System.out.println("Las veces el usuario ingreso ventas entre 100 y 300 fueron: " + cant_ventas_100_300 );
        System.out.println("Las veces el usuario ingreso ventas entre 400 fueron: " + cant_ventas400 );
        System.out.println("Las veces el usuario ingreso ventas entre 500 fueron: " + cant_ventas500 );
        System.out.println("Las veces el usuario ingreso ventas entre 600 fueron: " + cant_ventas600 );
        System.out.println("Las veces el usuario ingreso ventas inferior a 50 fueron: " + cant_ventas_inferior);
        System.out.println("El total de ventas es de: " + total_cant_ventas + " Ventas");
    }//fin de programa
}//Fin de programa
