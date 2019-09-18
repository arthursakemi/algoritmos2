package sort;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arthur.msakemi
 */
public class bubleSort {

    public static void main(String[] args) {
        int[] x = {9, 6, 4, 3, 5, 7, 2, 1, 8};

        bubleSort(x);

        printVetor(x);

    }

    public static void bubleSort(int[] a) {

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    int x = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = x;
                }
            }
        }
    }

    public static void printVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

}
