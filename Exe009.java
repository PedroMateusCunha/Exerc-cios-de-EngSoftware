/*
O custo ao consumidor de um carro novo é a soma do custo de fábrica com
a percentagem do distribuidor e dos impostos (aplicados, primeiro os
impostos sobre o custo de fábrica, e depois a percentagem do distribuidor
sobre o resultado). Supondo que a percentagem do distribuidor seja de 28%
e os impostos 45%. Escrever um algoritmo que leia o custo de fábrica de um
carro e informe o custo ao consumidor do mesmo.

cc = cf+im45+pd28
*/

import java.util.Scanner;

public class Exe009 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        custoTotal();
    }

    static void custoTotal() {
        System.out.print("\n[ ! ] Insira o custo de fábrica: R$ ");
        double custoDeFabrica = sc.nextDouble();
        double impostos = custoDeFabrica+custoDeFabrica*0.45;
        double percentagemDoDistribuidor = impostos + impostos*0.28;
        System.out.printf("\n\n[ *** ] Valor de compra: R$ %.2f\n", percentagemDoDistribuidor);
    }

}   