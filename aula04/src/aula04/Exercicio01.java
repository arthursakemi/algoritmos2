/*
Dadas duas matrizes A e B e mesmo tamanho:
1- Criar uma função que receba as duas matrizes e retorne uma nova matriz com
a soma das outras duas
2- idem para a multiplicação
 */
package aula04;

import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {

    static Scanner in = new Scanner(System.in);
    static Random rng = new Random();

    public static void main(String[] args) {

        int t, op;
        int[][] A, B, C;

        System.out.println("Informe o tamanho da matriz");
        t = in.nextInt();

        System.out.println("Soma - 1\n"
                + "Multiplicação - 2");

        op = in.nextInt();

        A = newMatrix(t);
        B = newMatrix(t);
        C = op == 1 ? addMatrix(A, B) : multMatrix(A, B);

        System.out.println("A:");
        print(A);
        System.out.println("B:");
        print(B);
        System.out.println("C:");
        print(C);

    }

    public static int[][] newMatrix(int t) {
        int[][] matrix = new int[t][t];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rng.nextInt(5);
            }
        }
        return matrix;
    }

    public static int[][] addMatrix(int[][] A, int[][] B) {
        int[][] matrix = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                matrix[i][j] = A[i][j] + B[i][j];
            }
        }
        return matrix;
    }

    public static void print(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("{");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                if (j < matriz[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
    }

    public static int[][] multMatrix(int[][] A, int[][] B) {
        int[][] matrix = new int[A.length][A[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i].length; k++) {
                    matrix[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return matrix;
    }

}
