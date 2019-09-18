/*
Escreva um algoritmo que leia uma temperatura em graus Celsius e
apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é:
F = (9*C+160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em
Celsius.
*/

import java.util.Scanner;

public class Exe004 {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        conversaoDeTemperatura();
    }

    static void conversaoDeTemperatura() {
        System.out.print("\n\n[ ! ] Insira a temperatura em Celcius: ");
        float temperaturaEmCelsius = sc.nextFloat();
        float temperaturaEmFahrenheit;
        temperaturaEmFahrenheit = (9*temperaturaEmCelsius+160)/5;
        System.out.println("\n\n[ *** ] Temperatura em Fahrenheit: " + temperaturaEmFahrenheit + "F");
    }

}