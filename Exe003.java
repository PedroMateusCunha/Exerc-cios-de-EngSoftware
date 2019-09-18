/*
Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês
(em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome,
o salário fixo e salário no final do mês.
*/

import java.util.Scanner;
public class Exe003
{
    static Scanner sc=new Scanner(System.in); 
    public static void main(String[] args)
    {
        salario();
    }

    static void salario()
    {
        System.out.print("[ ! ] Nome: ");
        String nome=sc.nextLine();
        System.out.print("[ ! ] Salário Inicial: ");
        double salarioFixo=sc.nextDouble();
        System.out.print("[ ! ] Total de Vendas: ");
        int totalDeVendas=sc.nextInt();
        System.out.println("\n\n[ * ] "+nome+" / Salário: R$" +(salarioFixo+(totalDeVendas*0.15)));
    }

}