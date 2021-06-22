package main;

import java.util.Scanner;

public class digitoUnicoT {
    public static int somaNumero(int n, int somaN) {
        if (n < 1)
            return somaN;
        somaN += (n % 10);
        return somaNumero(n / 10, somaN);


    }
        public static int somaTotal(int multnk, int somaT) {
            if (multnk < 1)
                return somaT;
            somaT += (multnk % 10);
            return somaTotal(multnk / 10, somaT);


        }

        public static void main(String[] args) {
            System.out.println("Bem Vindo a Calculadora de Digito Unico");
            System.out.println("Digite um numero (n): ");
            int n = new Scanner(System.in).nextInt();
            System.out.println("Digite um numero (K): ");
            int k = new Scanner(System.in).nextInt();
            if (n > 9) {
                int soma = somaNumero(n, 0);
                int multnk = soma * k;
                int somatotal = somaTotal(multnk, 0);
                System.out.printf("========================================\n");
                System.out.println("digitoUnico("+multnk+") = " + somatotal);
                System.out.printf("========================================\n");
            } else {
                int multnk = n * k;
                int soma = somaNumero(multnk, 0);
                System.out.printf("========================================\n");
                System.out.println("digitoUnico("+multnk+") = " +soma);
                System.out.printf("========================================\n");
            }
        }
    }





