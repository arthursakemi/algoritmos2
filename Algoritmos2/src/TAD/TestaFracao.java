/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAD;

/**
 *
 * @author arthur.msakemi
 */
public class TestaFracao {

    public static void main(String[] args) {
        Fracao f1 = new Fracao(3, 4);
        Fracao f2 = new Fracao(2, 3);

        Fracao r = f1.soma(f2);
        f1.apresentar();
    }
}
