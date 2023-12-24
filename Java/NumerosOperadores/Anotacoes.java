package Java.NumerosOperadores;

import java.util.Scanner;

public class Anotacoes {
    public static void main(String[] args) {
        int numero1 = 5;
        int valor = 5 + numero1++; // valor = 10 e numero = 6, numero só fica igual a seis depois de fazer a operção
        System.out.println(numero1);
        System.out.println(valor);

        Scanner Teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero2 = Teclado.nextInt();
        float raiz = (float) Math.sqrt(numero2);
        System.out.printf("A raiz de %d é %.2f", numero2, raiz);
    }
}
