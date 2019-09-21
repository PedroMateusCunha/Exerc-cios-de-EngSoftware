/*
As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
forem compradas pelo menos 12. Escreva um programa que leia o número de maçãs
compradas, calcule e escreva o custo total da compra.
*/

import java.util.Scanner;

public class Exe023 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        macas();
    }

    static void macas() {
        System.out.print("\n[ ! ] Quantidade de Macas: ");
        double numero = sc.nextDouble();
        if (numero >= 12) {
            System.out.printf("[ * ] Preço: R$ %.2f\n", numero*1);
        } else {
            System.out.printf("[ * ] Preço: R$ %.2f\n", numero*1.3);
        }
    }

}