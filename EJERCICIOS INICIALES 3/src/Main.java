// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //EJERCICIO 1
        Scanner var = new Scanner(System.in);
        System.out.println("Escribe un numero entero: ");
        int x = var.nextInt();
        System.out.println("Uno nuevo para sumarselo ");
        int y = var.nextInt();
        System.out.println("Y otro: ");
        int v = var.nextInt();
        System.out.println("El resultado de tu operación es: " + (x+y+v));

        //EJERCICIO 2
        System.out.print("Materia  "); System.out.println("Nota");
        System.out.print("PRO       "); int pro = var.nextInt();
        System.out.print("SSF       "); int ssf = var.nextInt();
        System.out.print("BAE       "); int BAE = var.nextInt();
        System.out.print("LNT       "); int LNT = var.nextInt();
        System.out.print("FOL       "); int FOL = var.nextInt();
        System.out.print("LND       "); int LND = var.nextInt();
        System.out.print("ETS       "); int ETS = var.nextInt();
        System.out.println("Promedio: " + (pro+ssf+BAE+LNT+FOL+LND+ETS)/7);

        //EJERCICIO 4
        System.out.println("Declara un numero entero que se llamará X: ");
        int X = var.nextInt();
        System.out.println("Declara otro numero entero que se llamará Y: ");
        int Y = var.nextInt();

        System.out.println("Declara un numero mayor que un entero que se llamará N: ");
        double N = var.nextDouble();
        System.out.println("Declara otro numero mayor que un entero que se llamara M: ");
        double M = var.nextDouble();

        System.out.println("La suma X+Y es: " + (X+Y));
        System.out.println("La resta X-Y es: " + (X-Y));
        System.out.println("La multiplicación X*Y es: " + (X*Y));
        System.out.println("La división X/Y es: " + (X/Y));
        System.out.println("El resto de X/Y es: " + (X%Y));
        System.out.println("La suma N+M es: " + (N+M));
        System.out.println("La suma N-M es: " + (N-M));
        System.out.println("La mulltiplicación N*M es: " + (N*M));
        System.out.println("La división N/M es: " + (N/M));
        System.out.println("El resto de N/M es: " + (N%M));
        System.out.println("El doble de N es: " + (N*2));
        System.out.println("El doble de M es: " + (M*2));
        System.out.println("La suma de todas las variables es: " + (X+Y+N+M));
        System.out.println("La suma de todas las variables es: " + (X*Y*N*M));
        







    }
}