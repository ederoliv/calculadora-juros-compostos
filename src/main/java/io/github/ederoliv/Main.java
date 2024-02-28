package io.github.ederoliv;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calculadora de Juros compostos");

        double valorFinal;
        double valorInicial = 1500;
        double taxaJuros = 10;
        double tempoInvestimento = 1;


        valorFinal =  valorInicial * Math.pow(1 + taxaJuros, tempoInvestimento);

        System.out.println("Valor final: " + valorFinal);

    }
}