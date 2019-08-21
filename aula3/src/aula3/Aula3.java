/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author arthur.msakemi
 */
public class Aula3 {

    public static void main(String[] args) {
        int[] array1 = {3, 8, 7, 5, 4};

        inversor(array1);
        print(array1);
    }

    static int[] inversor(int[] array) {
        int x;
        for (int i = 0; i < array.length / 2; i++) {
            x = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = x;
        }

        return array;
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

}
