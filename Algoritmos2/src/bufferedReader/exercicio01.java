/*
01 - Escreva um programa que abre um arquivo e le todas as linhas do arquivo
e imprime na tela. O nome do arquivo deve ser informado pelo usuario(teclado).

 */
package bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class exercicio01 {

    public static void main(String[] args) throws Exception {

        int n = diferencaAbsoluta(input());

        System.out.println(n);

    }

    public static int[] input() throws Exception {
        FileReader arquivo = new FileReader("vetor.txt");
        BufferedReader br = new BufferedReader(arquivo);

        String[] arrayString = br.readLine().split(" ");
        int[] input = new int[arrayString.length];

        for (int i = 0; i < arrayString.length; i++) {
            input[i] = Integer.parseInt(arrayString[i]);
        }
        return input;
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
