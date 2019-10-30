/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurssion;

/**
 *
 * @author arthur.msakemi
 */
public class Factorial {

    public static void main(String[] args) {

        System.out.println(fib(5));

    }

    static int fat(int n) {
        if (n < 1) {
            return 1;
        }
        return n * fat(n - 1);
    }

    static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static void binario(int n) {
        if (n == 2) {
            System.out.print(n);
        }

    }

}
