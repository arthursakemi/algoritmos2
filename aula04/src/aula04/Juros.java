package aula04;

import java.util.Scanner;

public class Juros {

    static Scanner in = new Scanner(System.in);

    static double[] juros = {0.2, 0.21, 0.19, 0.18, 0.03, 0.08, 0.1, 0.15, 0.2, 0.3, 0.32, 0.4};
    static double[] produtos = {10.0, 49.90, 99.90, 5.40, 4.20, 3.30, 56.60, 20.0, 7.90};
    static double[] preçoAtualizado;

    public static void main(String[] args) {
        juros();
        print(produtos);
    }

    static void produtos() {
        System.out.print("Informe a quantidade de produtos: ");
        int q = in.nextInt();
        double[] produtos = new double[q];
    }

    static void juros() {
        for (int i = 0; i < produtos.length; i++) {
            for (int j = 0; j < juros.length; j++) {
                produtos[i] += produtos[i] * juros[j];
            }
        }
    }

    static void print(double[] vetor) {
        System.out.print("{");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.2f", vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
