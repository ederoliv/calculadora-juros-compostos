package io.github.ederoliv;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        menu();

        double valorFinal;
        double valorInicial = 1500;
        double taxaJuros = 10;
        double tempoInvestimento = 1;


        valorFinal =  valorInicial * Math.pow(1 + taxaJuros, tempoInvestimento);

        System.out.println("Valor final: " + valorFinal);

    }

    public static void menu() {

        var inputUsuario = new BufferedReader(new InputStreamReader(System.in));

        String letreiro = """
                ::::::'##:::::::'##::'######:::'#######::'##::::'##:'########::
                :::::: ##::::::: ##:'##... ##:'##.... ##: ###::'###: ##.... ##:
                :::::: ##::::::: ##: ##:::..:: ##:::: ##: ####'####: ##:::: ##:
                :::::: ##::::::: ##: ##::::::: ##:::: ##: ## ### ##: ########::
                '##::: ##:'##::: ##: ##::::::: ##:::: ##: ##. #: ##: ##.....:::
                 ##::: ##: ##::: ##: ##::: ##: ##:::: ##: ##:.:: ##: ##::::::::
                . ######::. ######::. ######::. #######:: ##:::: ##: ##::::::::
                :......::::......::::......::::.......:::..:::::..::..:::::::::
                :::::::::Calculadora de Juros Compostos em Java!:::::::::::::::
                """;
        System.out.println(letreiro + "\n Deseja fazer o cálculo por mês(1) ou ano(20) ? \n Escolha uma opção");


    }

    public static void calculoMensal(BufferedReader input) {

    }

    public static void calculoAnual (BufferedReader input) {

    }


}