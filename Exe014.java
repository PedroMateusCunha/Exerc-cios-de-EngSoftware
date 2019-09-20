/*
Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu
antecessor e seu sucessor.
*/

import java.util.Scanner;

public class Exe014 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        antsuc();
    }

    static void antsuc() {
        System.out.print("[ ! ] Insira um número Inteiro: ");
        int val = sc.nextInt();
        System.out.printf("\n\n[ *** ] A:%d S:%d\n", val-1,val+1);
    }



}