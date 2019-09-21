/*
O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo
que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um
algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao
consumidor.
*/

import java.util.Scanner;

public class Exe019 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        custoTotal2();
    }

    static void custoTotal2() {
        System.out.print("\n[ ! ] Insira o custo de fábrica: R$ ");
        double custoDeFabrica = sc.nextDouble();
        double impostos = custoDeFabrica+custoDeFabrica*0.45;
        double percentagemDoDistribuidor = impostos + impostos*0.28;
        System.out.printf("\n\n[ *** ] Valor de compra: R$ %.2f\n", percentagemDoDistribuidor);
    }

}