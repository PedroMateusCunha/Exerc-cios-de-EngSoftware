/*
Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em
uma variável B. A seguir (utilizando apenas atribuições entre variáveis) troque os seus
conteúdos fazendo com que o valor que está em A passe para B e vice-versa. Ao final,
escrever os valores que ficaram armazenados nas variáveis.
*/
import java.util.Scanner;

public class Exe010 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        troca();
    }

    static void troca() {
        int A=10;
        int B=20;
        int temp;
        temp = A;
        A=B;
        B=temp;
        System.out.printf("\n\n[ *** ] A:%d B:%d\n", A,B);
    }



}