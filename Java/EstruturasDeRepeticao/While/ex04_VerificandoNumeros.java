package Java.EstruturasDeRepeticao.While;

import java.util.Scanner;

public class ex04_VerificandoNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        // par impar
        if (numero % 2 == 0) {
            System.out.println("o número é par");
        } else if (numero % 2 == 1) {
            System.out.println("O número é impar");
        }

        //primo
        int contador = 1;
        boolean primo = true;
        while (contador < numero) {
            contador++;
            if (numero % contador == 0 && contador != numero) {
                System.out.println("O número não é primo");
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("O número é primo");
        }

        //armstrong
        contador = 0;
        String numString = String.valueOf(numero);
        int len = numString.length();
        int parteDoNumero = 0;
        int armstrong = 0;
        while (contador < len) {
            parteDoNumero = Integer.parseInt(numString.substring(contador,contador+1));
            armstrong += Math.pow(parteDoNumero, len); 
            contador++;
        }
        if (armstrong == numero) {
            System.out.println("O número é armstrong");
        } else {
            System.out.println("O número não é armstrong");
        }

        //quadrado perfeito
        contador = 0;
        boolean quadradoPerfeito = false;
        while (contador <= numero/2) {
            if (contador*contador == numero) {
                quadradoPerfeito = true;
                System.out.println("O número é um quadrado perfeito");
                break;
            }
            contador++;
        }
        if (quadradoPerfeito == false) {
            System.out.println("O número não é um quadrado perfeito");
        }
        
        //palindromo
        String numString2 = numString;
        StringBuilder builder = new StringBuilder(numString2);
        builder.reverse();
        if (numString.equals(builder.toString())) {
            System.out.println("O número é palindromo");
        } else {
            System.out.println("O número não é palindromo");
        }

        //fibonacci
        int termo1 = 1;
        int termo2 = 0;
        System.out.print("0 - 1 - ");
        while (true) {
            int nextTerm = termo1 + termo2;
            System.out.printf("%d - ", nextTerm);
            if (nextTerm == numero) {
                System.out.println("FIM\nO número está na sequencia de fibonacci");
                break;
            } else if (nextTerm > numero) {
                System.out.println("FIM\nO número não está na sequencia de fibonacci");
                break;
            }
            termo2 = termo1;
            termo1 = nextTerm;
        }        
        }
    }

