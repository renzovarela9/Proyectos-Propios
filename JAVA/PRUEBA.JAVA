import java.util.Scanner; // Importar la clase Scanner

public class BucleFactura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
        int factura = 0; // Inicializar la variable factura
        boolean salir = false; // Inicializar la variable salir
        while (!salir) { // Iniciar el bucle while
            System.out.println("Ingrese el número de factura: ");
            try { // Intentar leer un número entero
                factura = sc.nextInt();
                if (factura == 0) { // Si el número es 0, salir del bucle
                    salir = true;
                } else if (factura == -1) { // Si el número es -1, mostrar un error
                    System.out.println("Error: no se puede ingresar -1");
                } else { // Si el número es válido, hacer algo con él
                    System.out.println("El número de factura es: " + factura);
                    // Aquí puedes agregar más código para procesar la factura
                }
            } catch (Exception e) { // Capturar cualquier excepción
                System.out.println("Error: debe ingresar un número entero");
                sc.next(); // Limpiar el buffer del Scanner
            }
        }
        System.out.println("Fin del programa");
        sc.close(); // Cerrar el Scanner
    }
}