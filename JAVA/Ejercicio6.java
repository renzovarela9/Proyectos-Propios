
//EJERCICIO 6
//Una empresa requiere un programa que le permita registrar sus ventas, 
//por ello lo han contratado a usted.. 
//Los datos que necesita ingresar el usuario son:
//
//Número de factura 
//Número de artículo (existen tres artículos cuyos códigos son A,B,y C)
//Cantidad vendida
//Precio unitario (sin IVA)
// 
//La carga de datos finaliza con el número de factura 0, 
//cada factura sólo permite cargar hasta tres artículos. 
// 
//Se desea saber:
//
// A. Monto total de cada factura.
// En el caso de que la factura sea del tipo “A” se deberá discriminar 
// el IVA mostrando el monto total sin IVA, el IVA (21% del monto sin IVA), 
// y el monto total IVA incluido). En el caso de que la factura 
// sea del tipo “B” debe mostrarse el monto total IVA Incluido.

// B. Facturación total
// C. Cuánto se vendió del artículo “B” en cantidad.
// D. Cuantas facturas mayores de $3000 se hicieron.
// E. Qué porcentaje representa el monto vendido por cada artículo sobre el total.


//Analisis
//entrada             proceso                                                                        saldia
//--------------------------------------------------------------------------------------------------------------------------
//num_factura         IVA=0.21                                                                       monto_total_A
//numero_art          monto_total_A = cant_vendida * precio_sin_iva                                  monto_total_B
//cant_vendida        monto_total_B = cant_vendida * (precio_sin_iva +(precio_sin_iva * IVA))        monto_total_C
//precio_sin_iva      monto_total_C = cant_vendida * (precio_sin_iva +(precio_sin_iva * IVA))        monto_total_facturado
//                    -------------------A----------------------------                               can_vendida_B
//                    monto_total_facturado =  monto_total_A + monto_total_B + monto_total_C         mayores_facturas_3000
//                    cant_vendida_acum = cant_vendida_A + cant_vendida_B + cant_vendida_C           porcentaje_A
//                    cant_vendida_A = cant_vendida                                                  porcentaje_B
//                    cant_vendida_B = cant_vendida                                                  porcentaje_C 
//                    cant_vendida_C = cant_vendida
//                    ------------------B----------------------------
//                    cant_vendida_B = cant_vendida
//                    ------------------C----------------------------
//                    if (cant_vendida > max){
//                       mayores_facturas_3000 = mayores_facturas_3000 +1 
//                    }//fin mayores a 3000
//                    ------------------D----------------------------
//                    porcentaje_A = (monto_total_A / (monto_total_facturado / 100));
//                    porcentaje_B = (monto_total_B / (monto_total_facturado / 100));
//                    porcentaje_C = (monto_total_C / (monto_total_facturado / 100));
//                    ------------------E----------------------------


import java.util.Scanner;
//Programa principal
public class Ejercicio6 {
    public static void main (String args[]){
        //Declaracion de objeto
        Scanner in = new Scanner(System.in);

        //Declaracion de variables 
        int num_factura, cant_vendida, precio_sin_iva, monto_total_A, cant_vendida_B, mayores_facturas_3000, mayores_facturas_3000A, mayores_facturas_3000B, mayores_facturas_3000C, cant_vendida_acum, max;
        double monto_total_facturado;
        double monto_total_C;
        double monto_total_B;
        double IVA, porcentaje_A, porcentaje_B, porcentaje_C;
        char numero_art;
        
        //Definir variables
        num_factura = -1;
        cant_vendida = 0;
        precio_sin_iva = 0;
        IVA = 0.21;
        monto_total_A = 0;
        monto_total_B = 0;
        monto_total_C = 0;
        monto_total_facturado = 0;
        cant_vendida_B = 0;
        mayores_facturas_3000 = 0;
        mayores_facturas_3000A = 0;
        mayores_facturas_3000B = 0;
        mayores_facturas_3000C = 0;
        cant_vendida_acum = 0;
        max = 3000;
        porcentaje_A = 0.0;
        porcentaje_B = 0.0;
        porcentaje_C = 0.0;
        numero_art = 'Z';



        //validacion de entradas
        while (num_factura != 0){
            System.out.println("Bienvenido al registro de ventas, le recordamos que para finalizar la carga de datos, la factura tiene que ser igual a 0");
            System.out.println("");
     
            System.out.println("Ingrese su numero de factura: ");
            num_factura = in.nextInt();
            if(num_factura == 0){       
                break;     

            }
               

            if(num_factura < 0){
                System.out.println("Error- Ingrese un valor valido");
            }//Mensaje de error
         

        while (numero_art != 'A' && numero_art != 'B' && numero_art != 'C'){
            System.out.println("Ingrese el codigo de su articulo: ");
            numero_art = in.next().charAt(0);

            if(numero_art != 'A' && numero_art != 'B' && numero_art != 'C'){
                System.out.println("Error- Ingrese un valor valido");
            }//Mensaje de error

         
        }//FIN NUMERO DE ARTICULO

        while (cant_vendida <= 0){
            System.out.println("Ingrese la cantidad vendida: ");
            cant_vendida = in.nextInt();

            if(cant_vendida <= 0){
                System.out.println("Error- Ingrese un valor valido");
            }//Mensaje de error

         
        }//FIN CANTIDAD VENDIDA

        while (precio_sin_iva <= 0){
            System.out.println("Ingrese el precio unitario: ");
            precio_sin_iva = in.nextInt();

            if(precio_sin_iva <= 0){
                System.out.println("Error- Ingrese un valor valido");
            }//Mensaje de error

         
        }//FIN PRECIO UNITARIO

         

        if(numero_art == 'A'){
            monto_total_A = cant_vendida * precio_sin_iva;

          if (cant_vendida > max){

            mayores_facturas_3000A = mayores_facturas_3000A +1; 
        }//fin mayores a 3000


        }//Fin art A

        if(numero_art == 'B'){
            cant_vendida_B = cant_vendida; 
            monto_total_B = (cant_vendida * (precio_sin_iva + (precio_sin_iva * IVA) ));
            
            if (cant_vendida > max){
            mayores_facturas_3000B = mayores_facturas_3000B +1; 
        }//fin mayores a 3000
            

        }//Fin art B

        if(numero_art == 'C'){
            monto_total_C = (cant_vendida * (precio_sin_iva + (precio_sin_iva * IVA) ));

            if (cant_vendida > max){
            mayores_facturas_3000C = mayores_facturas_3000C +1; 
        }//fin mayores a 3000

        }//Fin art C
    

       //iNICIALIZAR VARIABLES
        num_factura = -1;
        cant_vendida = 0;
        precio_sin_iva = 0;
        IVA = 0.21;
        numero_art = 'Z';

        }//bucle principal

        monto_total_facturado =  (monto_total_A + monto_total_B + monto_total_C); //Fin monto total facturado
        
        //A
        System.out.println("Monto total facturado por art A es de: "+ monto_total_A);
        System.out.println("Monto total facturado por art B es de: "+ monto_total_B);
        System.out.println("Monto total facturado por art C es de: "+ monto_total_C);
        System.out.println("");
        //B
        System.out.println("Monto total facturado  es de: "+ monto_total_facturado);
        System.out.println("");
        //C
        System.out.println("El art B vendio en cantidad: "+ cant_vendida_B);
        System.out.println("");
        //D
        mayores_facturas_3000 = mayores_facturas_3000A + mayores_facturas_3000B + mayores_facturas_3000C; //Fin de cantidad de ventas mas de 3000
        System.out.println("La cantidad de facturas mayor a 3000 son: "+ mayores_facturas_3000);

        //E
        porcentaje_A = (monto_total_A / (monto_total_facturado / 100));
        porcentaje_B = (monto_total_B / (monto_total_facturado / 100));
        porcentaje_C = (monto_total_C / (monto_total_facturado / 100));
        System.out.println("");
        System.out.println("El porcentaje que representa el ART A sobre el total es de: "+ porcentaje_A + "%");
        System.out.println("El porcentaje que representa el ART B sobre el total es de: "+ porcentaje_B + "%");
        System.out.println("El porcentaje que representa el ART C sobre el total es de: "+ porcentaje_C + "%");

    
    }
}// Fin de programa
