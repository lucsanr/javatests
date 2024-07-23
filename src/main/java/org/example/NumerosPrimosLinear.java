package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class NumerosPrimosLinear {

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

        List<Integer> primos = encontrarPrimosLinear(n);
        System.out.println("Números primos até " + n + ": " + primos);
        scanner.close();
    }

    // função linear para encontrar números primos
    public static List<Integer> encontrarPrimosLinear(int n) {
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (ehPrimo(i)) {
                primos.add(i);
            }
        }
        return primos;
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
