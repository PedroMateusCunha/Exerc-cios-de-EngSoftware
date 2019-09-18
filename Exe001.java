/*
[ 1 ] Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração,
multiplicação e a divisão dos números lidos.
*/

import java.util.Scanner;
public class Exe001
{
    static Scanner sc=new Scanner(System.in); 
    public static void main(String[] args)
    {
        operacao();
    }  

    static void operacao()
    {
        System.out.print("[ ! ] Insira um número inteiro: ");
        int num1=sc.nextInt();
        System.out.print("[ ! ] Insira um número inteiro: ");
        int num2=sc.nextInt();
        System.out.println("\n\n[ + ]: SOMA = " + (num1+num2));
        System.out.println("[ - ]: SUBTRAÇÃO = " + (num1-num2));
        System.out.println("[ * ]: MULTIPLICAÇÃO = " + (num1*num2));
        System.out.println("[ / ]: DIVISÃO = " + (num1/num2));
        
    }
}