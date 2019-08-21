/*4) A INTERCALAÇÃO é o processo utilizado para construir uma vetor ordenado
crescentemente, de tamanho n+m, a partir de dois vetores já ordenados de tamanhos
n e m. Por exemplo, a partir das sequências abaixo:

Exemplo:
	A[] = { 1, 3, 6, 7} e B[] = {2, 4, 5}, o novo vetor C é feito a partir de A[] e B[]:
	C = { 1, 2, 3, 4, 5, 6, 7}
 */
package listaexercicios01;

public class Exercicio04 {

    static int[] arrayA = {10, 16, 24, 27, 35, 12, 16, 22, 34};
    static int[] arrayB = {2, 4, 5, 401, 7, 10};
    static int[] arrayC = new int[arrayA.length + arrayB.length];

    public static void main(String[] args) {

        intercalarOrdenado();
        print(arrayC);

    }

    static void intercalarOrdenado() {
        int countA = 0;
        int countB = 0;
        int countC = 0;

        while (countA < arrayA.length && countB < arrayB.length) {
            arrayC[countC++] = arrayA[countA] < arrayB[countB] ? arrayA[countA++] : arrayB[countB++];
        }
        while (countA < arrayA.length) {
            arrayC[countC++] = arrayA[countA++];
        }
        while (countB < arrayB.length) {
            arrayC[countC++] = arrayB[countB++];
        }
    }

    static void print(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    static void sort(int[] array) {
        int x;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
    }

}
