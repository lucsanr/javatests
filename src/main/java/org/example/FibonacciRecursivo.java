package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciRecursivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;

        // loop até que um número válido seja inserido
        while (n < 0) {
            System.out.print("Digite um número maior ou igual a 0: ");
            try {
                n = scanner.nextInt();
                if (n < 0) {
                    System.out.println("O número deve ser maior ou igual a 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next();
            }
        }

        try {
            System.out.println("Fibonacci de " + n + " é: " + fibonacciRecursivo(n));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int fibonacciRecursivo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser maior ou igual a 0.");
        }
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            //retorna a soma dos dois números anteriores na sequência
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }
}
