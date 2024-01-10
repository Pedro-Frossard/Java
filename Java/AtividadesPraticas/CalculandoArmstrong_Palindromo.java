package Java.AtividadesPraticas;

import java.util.Scanner;

public class CalculandoArmstrong_Palindromo {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Digite um número no intervalo de 1 a 9999: ");
            int numero = input.nextInt();
            int numeroArmstrong = 0;
            boolean armstrong = false;
            String numeroString = Integer.toString(numero);
            
            if (numero >= 1 && numero <= 9999) {
                int tamanhoNumero = numeroString.length();
                if (tamanhoNumero == 1) {
                    armstrong = true;
                }
                else if (tamanhoNumero == 2) {
                    numeroArmstrong = (int) Math.pow(Integer.parseInt(Character.toString(numeroString.charAt(0))), tamanhoNumero) + (int) Math.pow(Integer.parseInt(Character.toString(numeroString.charAt(1))), tamanhoNumero); 
                }
                else if (tamanhoNumero == 3) {
                    numeroArmstrong = (int) Math.pow(Integer.parseInt(Character.toString(numeroString.charAt(0))), tamanhoNumero) + (int) Math.pow(Integer.parseInt(Character.toString(numeroString.charAt(1))), tamanhoNumero) + (int) Math.pow(Integer.parseInt(Character.toString(numeroString.charAt(2))), tamanhoNumero);
                }
                else {
                    numeroArmstrong = (int) Math.pow(Integer.parseInt(Character.toString(numeroString.charAt(0))), tamanhoNumero) + (int) Math.pow(Integer.parseInt(Character.toString(numeroString.charAt(1))), tamanhoNumero) + (int) Math.pow(Integer.parseInt(Character.toString(numeroString.charAt(2))), tamanhoNumero) + (int) Math.pow(Integer.parseInt(Character.toString(numeroString.charAt(3))), tamanhoNumero);
                }
                if (numeroArmstrong == numero) {
                    armstrong = true;
                }
                if (armstrong) {
                    System.out.printf("O número %d é armstrong", numero);
                }
                else {
                    System.out.println("O número digitado não é armstrong");
                    String numeroString2 = numeroString;
                    StringBuilder inverso = new StringBuilder(numeroString2);
                    inverso.reverse();
                    if (numeroString.equals(numeroString2)) {
                        System.out.println("Porém o numero é palindromo");
                    }
                }
                
            }
        }
    }
}
