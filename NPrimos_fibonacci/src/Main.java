import java.util.Scanner;

public class Main {
    // Atributo de la clase
    int n;

    // Constructor de la clase
    Main(int n) {
        this.n = n;
    }

    // Método para calcular los primeros n números primos
    int[] N_Primos() {
        int[] primos = new int[n];
        int num = 2;
        int count = 0;
        while (count < n) {
            if (Verificar_Primo(num)) {
                primos[count] = num;
                count++;
            }
            num++;
        }
        return primos;
    }

    // Método para calcular los primeros n números de la sucesión de Fibonacci
    int[] Fibonacci() {
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        if (n > 1) {
            fibonacci[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        return fibonacci;
    }

    // Método para verificar si un número es primo
    boolean Verificar_Primo(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa la cantidad de números a calcular:");
        int n = scanner.nextInt();
        Main numeros = new Main(n);

        int[] primos = numeros.N_Primos();
        int[] fibonacci = numeros.Fibonacci();

        System.out.println("Números primos:");
        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i] + ", ");
        }
        System.out.println("\n");

        System.out.println("Sucesión de Fibonacci:");
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + ", ");
        }
    }
}
