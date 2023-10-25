import java.util.Scanner;
import static java.lang.Math. *;

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
        System.out.println("El resultado de tu operación es: " + (x + y + v));

        //EJERCICIO 2
        System.out.print("Materia  ");
        System.out.println("Nota");
        System.out.print("PRO       ");
        int pro = var.nextInt();
        System.out.print("SSF       ");
        int ssf = var.nextInt();
        System.out.print("BAE       ");
        int BAE = var.nextInt();
        System.out.print("LNT       ");
        int LNT = var.nextInt();
        System.out.print("FOL       ");
        int FOL = var.nextInt();
        System.out.print("LND       ");
        int LND = var.nextInt();
        System.out.print("ETS       ");
        int ETS = var.nextInt();
        System.out.println("Promedio: " + (pro + ssf + BAE + LNT + FOL + LND + ETS) / 7);

        //Ejercicio 3
        System.out.println("Precio del móvil iphone 20: ");
        float preciomovil= var.nextFloat();
        System.out.println("Precio por mes: " + (preciomovil/24));
        System.out.println("Intereses totales de sobrecoste: " + (preciomovil*0.14));



        //EJERCICIO 4
        System.out.println("Declara un numero entero que se llamará X: ");
        int X = var.nextInt();
        System.out.println("Declara otro numero entero que se llamará Y: ");
        int Y = var.nextInt();

        System.out.println("Declara un numero mayor que un entero que se llamará N: ");
        double N = var.nextDouble();
        System.out.println("Declara otro numero mayor que un entero que se llamara M: ");
        double M = var.nextDouble();

        System.out.println("La suma X+Y es: " + (X + Y));
        System.out.println("La resta X-Y es: " + (X - Y));
        System.out.println("La multiplicación X*Y es: " + (X * Y));
        System.out.println("La división X/Y es: " + (X / Y));
        System.out.println("El resto de X/Y es: " + (X % Y));
        System.out.println("La suma N+M es: " + (N + M));
        System.out.println("La suma N-M es: " + (N - M));
        System.out.println("La mulltiplicación N*M es: " + (N * M));
        System.out.println("La división N/M es: " + (N / M));
        System.out.println("El resto de N/M es: " + (N % M));
        System.out.println("El doble de N es: " + (N * 2));
        System.out.println("El doble de M es: " + (M * 2));
        System.out.println("La suma de todas las variables es: " + (X + Y + N + M));
        System.out.println("La multiplicación de todas las variables es: " + (X * Y * N * M));


        //Ejercio 5
        System.out.println("Escribe un número: ");
        double num = var.nextDouble();
        System.out.println("Potencia: ");
        double pot = var.nextDouble();
        System.out.println(pow (num,pot));

        //Ejercicio 6
        System.out.println("Escribe un número: ");
        int num2 = var.nextInt();
        System.out.println("Raíz cuadrada" + sqrt(num2));

        //Ejercicio 7
        System.out.println("Radio de la esfera: ");
        int sup = var.nextInt();
        System.out.println("Superficie de la esfera " + (4*PI*sup*sup));

        System.out.println("Volumen de la esfera " + (4/3)*PI*sup*sup*sup);

        //Ejercicio 8
        System.out.println("Introduce tu peso en kg: ");
        float peso = var.nextFloat();
        System.out.println("Introduce tu altura: ");
        float altura = var.nextFloat();

        System.out.println("IMS= " + peso/(altura*altura));

        //Ejercicio 9
        System.out.println("Cantidad: ");
        int cantidad = var.nextInt();
        System.out.println("Unidades: ");
        int unidades = var.nextInt();
        System.out.println("Precio: ");
        double precio = var.nextDouble();


        System.out.println("Importe total: " + (cantidad*unidades*precio));

        System.out.println("IGIC " + ((cantidad*unidades*precio)*0.07));
        System.out.println("Total: " + (cantidad*unidades*precio)+((cantidad*unidades*precio)*0.07));





















    }
}