package Java.NumerosOperadores;

import java.util.Scanner;

import javax.security.sasl.SaslClientFactory;

public class ex03_CalculandoSalario {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.print("Qual é o seu nome? ");
        String nome = Teclado.nextLine();
        System.out.printf("Quantas horas por semana %s trabalha? ", nome);
        int horasSemanais = Teclado.nextInt();
        System.out.printf("Quantos dependentes %s tem? ", nome);
        int dependentes = Teclado.nextInt();
        System.out.printf("%s terá um salario de R$%.2f", nome, (float) 25*4*horasSemanais+dependentes*500);
    }
}
