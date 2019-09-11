package algoritmos2;

import java.util.Scanner;

public class aula04ex3 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(diferencaAbsoluta(A));

    }

    public static int diferencaAbsoluta(int[] A) {

        int menor = A[0];
        int maior = A[0];

        for (int i = 0; i < A.length; i++) {
            maior = A[i] > maior ? A[i] : maior;
            menor = A[i] < menor ? A[i] : menor;
        }

        return maior - menor;
    }

}
