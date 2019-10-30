/*
6) Escreva uma função que recebe um vetor como parâmetro, a sua função seleciona o primeiro elemento de um vetor e rearranja o vetor de forma que todos elementos menores ou iguais ao primeiro elemento fiquem a sua esquerda e os maiores a sua direita.

No vetor {5, 6, 2, 7, 9, 1, 8, 3, 7} após ser rearranjado teríamos
{1, 3, 2, 5, 9, 7, 8, 6, 7}.

 */
package algoritmos2;

/**
 *
 * @author arthur.msakemi
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] A = {5, 6, 2, 7, 9, 1, 8, 3, 7};

    }

    public static void part(int[] A, int inicio, int fim) {
        int i = inicio + 1,
                j = fim,
                pivo = A[inicio],
                temp;

        while (i <= j) {
            if (A[i] <= pivo) {
                i++;
            } else if (A[j] >= pivo) {
                j--;
            } else {
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
    }

}
