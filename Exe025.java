/*
Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que
diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que
a pessoa nasceu).
*/

import java.util.Scanner;

public class Exe025 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        votacao();
    }

    static void votacao() {
        System.out.print("\n[ ! ] Ano Atual: ");
        int anoAtual = sc.nextInt();
        System.out.print("[ ! ] Ano de Nascimento: ");
        int anoNascimento = sc.nextInt();
        int idade = anoAtual-anoNascimento;

        if (idade >= 16) {
            System.out.printf("\n\n[ * ] %d | Pode Votar\n", idade);
        } else {
            System.out.printf("\n\n[ * ] %d | Não pode Votar\n", idade);
        }
    }

}