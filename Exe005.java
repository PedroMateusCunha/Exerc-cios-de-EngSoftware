/*
Escreva um algoritmo que efetue a apresentação do valor da conversão em
real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor
da cotação do dólar e também a quantidade de dólares disponíveis com o
usuário.
*/

import java.util.Scanner;

public class Exe005 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cotacao();
    }

    static void cotacao() {
        System.out.print("\n\n[ ! ] Valor atual do Dolar em Real: R$ ");
        float cotacaoAtual = sc.nextFloat();
        System.out.print("[ ! ] Quantidade em Dolar: U$$ ");
        float quantidadeDeDolar = sc.nextFloat();
        float valorEmReal = quantidadeDeDolar * cotacaoAtual;
        System.out.println("\n\n[ *** ] Reais R$: " + valorEmReal);
    }

}