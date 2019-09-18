/*
Escreva um algoritmo que receba um valor que foi depositado em uma conta
poupança e exiba o valor com rendimento após um mês. Considere fixo o
juro da conta poupança em 0,70% a.m.
*/

import java.util.Scanner;

public class Exe006 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        rendimento();
    }

    static void rendimento() {
        System.out.print("\n\n[ ! ] Valor depositado: R$ ");
        double deposito = sc.nextDouble();
        double rendimento = deposito +( deposito * 0.17);
        System.out.println("\n\n[ *** ] Valor total R$: " + rendimento);
    }

}
