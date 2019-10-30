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
public class Fracao {

    private int numerador, denominador;

    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void apresentar() {
        System.out.println(numerador + "/" + denominador);
    }

    public Fracao soma(Fracao f) {

    }
}
