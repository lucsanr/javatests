package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class NumerosPrimosRecursivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;

        // loop até que um número válido seja inserido
        while (n <= 1) {
            System.out.print("Digite um número maior que 1: ");
            try {
                n = scanner.nextInt();
                if (n <= 1) {
                    System.out.println("O número deve ser maior que 1.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next();
            }
        }

        List<Integer> primos = encontrarPrimosRecursivo(n, new ArrayList<>(), 2);
        System.out.println("Números primos até " + n + ": " + primos);
        scanner.close();
    }

    // função recursiva para encontrar números primos
    public static List<Integer> encontrarPrimosRecursivo(int n, List<Integer> primos, int atual) {
        if (atual > n) {
            return primos;
        }
        if (ehPrimo(atual)) {
            primos.add(atual);
        }
        return encontrarPrimosRecursivo(n, primos, atual + 1);
    }

    // função auxiliar para verificar se um número é primo
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
