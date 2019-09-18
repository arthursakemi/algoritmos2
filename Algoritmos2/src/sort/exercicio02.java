/*
considere um vetor quase ordenado, somente o ultimo elemento esta na posiçao errada
ordene o vetor em n passos onde n = tamanho vetor
sem utilizar o metodo bolha
 */
package sort;

/**
 *
 * @author arthur.msakemi
 */
public class exercicio02 {

    public static void main(String[] args) {
        int[] v = {3, 5, 9, 11, 15, 17, 19, 6};
        sort(v);

        bubleSort.printVetor(v);
    }

    public static void sort(int[] v) {

        int x;
        for (int i = v.length - 1; i > 0; i--) {
            if (v[i] < v[i - 1]) {
                x = v[i];
                v[i] = v[i - 1];
                v[i - 1] = x;
            }
        }
    }

    public static void sort2(int[] v) {
        int j = v.length - 1;
        int x = v[j];

        while (j > 0 && x < v[j - 1]) {
            v[j] = v[j - 1];
            j--;
        }
        v[j] = x;
    }

}
