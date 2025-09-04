import java.util.Scanner;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n1, n2, suma;
        System.out.println("Digite el primer valor");
        n1 = teclado.nextInt();
        System.out.println("Digite el segundo valor");
        n2 = teclado.nextInt();
        suma = n1 + n2;
        System.out.println("La suma es: " + suma);


        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int numero = random.nextInt(200) + 1;
            System.out.println("Número " + (i + 1) + ": " + numero);
            suma += numero;
        }

        System.out.println("La suma de los 100 números es: " + suma);


    }
}



