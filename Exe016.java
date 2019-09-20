/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e
mês com 30 dias.
*/

import java.util.Scanner;

public class Exe016 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        idade();
    }

    static void idade() {
        System.out.print("[ ! ] Anos: ");
		int anos = sc.nextInt();
		System.out.print("[ ! ] Meses: ");
		int meses = sc.nextInt();
		System.out.print("[ ! ] Dias: ");
		int dias = sc.nextInt();

		System.out.println("[ *** ]Idade em dias: " + ((365 * anos) + (meses * 30) + dias));
    }



}