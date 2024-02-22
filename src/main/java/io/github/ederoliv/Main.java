package io.github.ederoliv;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calculadora1");

        double valorFinal = 0;
        double valorInicial = 1000;
        double taxaJuros = 10;
        double tempoInvestimento = 12;


        valorFinal =  valorInicial + (Math.pow(1 + taxaJuros, tempoInvestimento));

        System.out.println("Valor final: " + valorFinal);

        /*

        A = P (1 + i) ^ t

    Para entender melhor a fórmula segue a explicação de cada variável:

    A = valorFinal, ou seja, o resultado que você terá;
    P = valorInicial depositado;
    i = taxaJuros;
    t = tempo do investimento.

         */
    }
}