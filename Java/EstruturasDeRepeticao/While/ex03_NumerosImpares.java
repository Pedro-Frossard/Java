package Java.EstruturasDeRepeticao.While;

import java.util.Scanner;

public class ex03_NumerosImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Digite um número positivo (negativo se quiser parar): ");
            int numero = input.nextInt();
            if (numero > 0) {
                int acumulador = 0;
                int numeroImpar = 1;
                while (numeroImpar < numero) {
                    System.out.print(numeroImpar + " --> ");
                    acumulador+=numeroImpar;
                    numeroImpar+=2;
                    }
                    System.out.println("Fim!\nA soma de todos eles foi " + acumulador);
                } else {
                    break;
                }
            }
            System.out.println("Acabou!");
        }
    }
