/*
Faça um algoritmo que receba o preço de custo de um produto e mostre o
valor de venda. Sabe-se que o preço de custo receberá um acréscimo de
acordo com um percentual informado pelo usuário.
*/

import java.util.Scanner;

public class Exe008 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        valorDeVenda();
    }

    static void valorDeVenda() {
        System.out.print("\n\n[ ! ] Insira o custo do produto: R$ ");
        float custo = sc.nextFloat();
        System.out.print("[ ! ] Insira o percentual de venda: ");
        float percentual = sc.nextFloat();
        System.out.printf("\n\n[ *** ] Valor de venda %.2f", custo+(custo*(percentual/100)));
    }

}