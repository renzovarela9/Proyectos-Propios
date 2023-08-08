import java.util.Scanner;
//Programa principal
public class Ejercicio1{
    public static void main(String[] args){
        //Declaracion de objeto
        Scanner in = new Scanner(System.in);
        //Declaracion de variables 
        int monto_pagar = 0, monto_final = 0, saldo_pagar = 0;
        
        //Inicializar variables 
        monto_pagar = 0;
        monto_final = 0;
        saldo_pagar = 0;

        //Menu + validacion

        while (monto_pagar <=0){
            System.out.println("Ingrese el monto a pagar de la cuota. Monto a pagar $1500 del 20/3: ");
            monto_pagar = in.nextInt();

            if (monto_pagar <=0){
                System.out.println("Error-Ingrese un valor correcto");
            }

        }

        //Hacemos un calculo para evaluar si le resta pagar la cuota
	    saldo_pagar= 1500;
	    monto_final = saldo_pagar - monto_pagar;
	    System.out.println("El saldo a pagar de la cuota es de: $" +monto_final);

        

    }
}// Fin de programa