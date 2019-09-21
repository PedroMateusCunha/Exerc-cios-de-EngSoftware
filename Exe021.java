/*
Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que
10, caso contrário escrever NÃO É MAIOR QUE 10!
*/

import java.util.Scanner;

public class Exe021 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        maior10();
    }

    static void maior10() {
        System.out.print("\n[ ! ] Insira um número Inteiro: ");
        int numero = sc.nextInt();
        if (numero > 10) {
            System.out.println("\n\n[ * ] E MAIOR QUE 10!");
        } else {
            System.out.println("[ * ] NAO E MAIOR QUE 10!");
        }
    }

}