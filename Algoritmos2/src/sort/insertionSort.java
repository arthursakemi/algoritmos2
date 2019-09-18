/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

public class insertionSort {

    public static void main(String[] args) {
        int[] x = {9, 6, 4, 3, 5, 7, 2, 1, 8};
        insertionSort(x);

        bubleSort.printVetor(x);
    }

    public static void insertionSort(int[] v) {
        for (int i = 1; i < v.length; i++) {
            int j = i;
            int x = v[j];
            while (j > 0 && x < v[j - 1]) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = x;
        }
    }
}
