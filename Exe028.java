/*
Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas
inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o
tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia
e terminar no dia seguinte.
*/

import java.util.Scanner;

public class Exe028 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        xadrez();
    }

    static void xadrez() {
        System.out.print("[ ! ] Hora de incio da partida: ");
		int inicio = sc.nextInt();
		System.out.print("[ ! ] Hora do termino da partida: ");
        int fim = sc.nextInt();
        int duracao = (24-inicio) + fim;
        System.out.printf("[ *** ] Duracao da Partida: %d horas\n\n", duracao);

    }

}