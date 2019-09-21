/*
Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
*/

import java.util.Scanner;

public class Exe026 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        iguais();
    }

    static void iguais() {
        System.out.print("[ ! ] Insira um Numero Inteiro: ");
		int num1 = sc.nextInt();
		System.out.print("[ ! ] Insira outro Numero Inteiro: ");
        int num2 = sc.nextInt();
        
		while (num2==num1) {
            System.out.println("[ !!! ] Numero Invalido");
            System.out.print("[ ! ] Insira outro Numero Inteiro: ");
            num2 = sc.nextInt();

        }

        if (num1 > num2) {
            System.out.println("\n\n[ *** ] Maior: " + num1);
        } else {
            System.out.println("\n\n[ *** ] Maior: " + num2);
        }

    }

}