/*
Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo
automóvel e o total de combustível gasto.
*/

import java.util.Scanner;
public class Exe002
{
    static Scanner sc=new Scanner(System.in); 
    public static void main(String[] args)
    {
        consumo();
    }

    static void consumo()
    {
        System.out.print("[ ! ] Insira a Distanância em KM: ");
        int km=sc.nextInt();
        System.out.print("[ ! ] Insira a Quantidade de Gasolina em Litros: ");
        int litros=sc.nextInt();
        System.out.println("\n\n[ * ] Consumo médio de: " + (km/litros) + "km/l");
    }

}