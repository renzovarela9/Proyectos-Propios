import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String args[]){
        //Declaracion de objeto
        Scanner in = new Scanner(System.in);
        //Declaracion de variables 
        int monto_pagar = 0, monto_final = 0, saldo_pagar = 0, opsion = 0;
        
        //Inicializar variables 
        monto_pagar = 0;
        monto_final = 0;
        saldo_pagar = 0;
        opsion = 0;

        //Menu de opciones + validacion
        while(opsion <=0 || opsion >=4){
            System.out.println("Elija el medio de pago en que desea abonar la cuota");
		    System.out.println( "1_ Efectivo: descuento del 10%");
		    System.out.println( "2_ Tarjeta de debido: recargo del 7% ");
		    System.out.println( "3_ Tarjeta de crédito: recargos según la cantidad de pagos que desee el socio:");
		    System.out.println( "                              1 pago: 5%");
	        System.out.println( "                              3 pagos: 10%");
	        System.out.println( "                              6 pagos: 20%");

		    opsion = in.nextInt();

            //Medios de pago
            if(opsion == 1){
                //Validacion del monto a pagar
                while(monto_pagar <=0 || monto_pagar >=1351){
                    System.out.println( "Ingrese el monto a pagar de la cuota");
				    System.out.println( "Monto a pagar $1350 aplicado el 10% de descuento del 20/3");
				    monto_pagar = in.nextInt();

                    if (monto_pagar <=0 || monto_pagar>= 1351){
                        System.out.println("Error-Ingrese un valor correcto");
                    }//fin mensaje de validacion

                    monto_final= 1350;
			        saldo_pagar = monto_final - monto_pagar;//Efectivo 
		
                }//Fin de validacion 1

            }//Fin de opcion 1

            if(opsion == 2){
                //Validacion del monto a pagar
                while(monto_pagar <=0 || monto_pagar >=1606){
                    System.out.println( "Ingrese el monto a pagar de la cuota");
				    System.out.println( "Monto a pagar $1605 aplicado un recargo del 7% del 20/3");
				    monto_pagar = in.nextInt();

                    if (monto_pagar <=0 || monto_pagar>= 1606){
                        System.out.println("Error-Ingrese un valor correcto");
                    }//fin mensaje de validacion

                    monto_final= 1605;
			        saldo_pagar = monto_final - monto_pagar;//Tarjeta de debito
		
                }//Fin de validacion 2 

            }//Fin de opcion 2

            if(opsion == 3){
                opsion = 0;

                while(opsion <=0 || opsion >=4){
                   
				//Validacion del monto a pagar
				System.out.println( "Elija una opcion:");
				System.out.println( "(1) 1 pago: 5%");
				System.out.println( "(2) 3 pagos: 10%");
				System.out.println( "(3) 6 pagos: 20%");

                opsion = in.nextInt();

                if(opsion == 1){
                    //Validacion del monto a pagar
                    while(monto_pagar <=0 || monto_pagar >=1576){
                        System.out.println( "Ingrese el monto a pagar de la cuota");
				        System.out.println( "Monto a pagar $1575 aplicado un recargo del 5% del 20/3");
				        monto_pagar = in.nextInt();

                        if (monto_pagar <=0 || monto_pagar>= 1576){
                            System.out.println("Error-Ingrese un valor correcto");
                    }//fin mensaje de validacion

                    monto_final= 1575;
			        saldo_pagar = monto_final - monto_pagar;//Tarjeta de credito
		
                }//Fin de recargo 5%

                }//Opcion 1

                if(opsion == 2){
                    //Validacion del monto a pagar
                    while(monto_pagar <=0 || monto_pagar >=551){
                        System.out.println( "Ingrese el monto a pagar de la cuota");
				        System.out.println( "Monto a pagar $550 aplicado un recargo del 5% del 20/3");
				        monto_pagar = in.nextInt();

                        if (monto_pagar <=0 || monto_pagar>= 551){
                            System.out.println("Error-Ingrese un valor correcto");
                    }//fin mensaje de validacion

                    monto_final= 550;
			        saldo_pagar = monto_final - monto_pagar;//Tarjeta de credito
		
                }//Fin de recargo 10%

                }//Opcion 2

                if(opsion == 3){
                    //Validacion del monto a pagar
                    while(monto_pagar <=0 || monto_pagar >=301){
                        System.out.println( "Ingrese el monto a pagar de la cuota");
				        System.out.println( "Monto a pagar $300 aplicado un recargo del 5% del 20/3");
				        monto_pagar = in.nextInt();

                        if (monto_pagar <=0 || monto_pagar>= 301){
                            System.out.println("Error-Ingrese un valor correcto");
                    }//fin mensaje de validacion

                    monto_final= 300;
			        saldo_pagar = monto_final - monto_pagar;//Tarjeta de credito
		
                }//Fin de recargo 20%

                }//Opcion 3
				

                }//Menu

                

            }//Fin de opcion 3
		
		
        }//Fin de menu
        
        System.out.println("el valor restante es a pagar es de: "+ saldo_pagar +"$");

    }//Fin main
}//Fin de programa principal
