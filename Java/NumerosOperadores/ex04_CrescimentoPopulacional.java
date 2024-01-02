package Java.NumerosOperadores;

import java.util.Scanner;

public class ex04_CrescimentoPopulacional {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual era a população inicial? ");
		int popInicial = teclado.nextInt();
		System.out.print("Qual é o crescimento populacional em decimal? ");
		float crescimento = teclado.nextFloat();
		System.out.print("Quantos anos se passaram? ");
		int anos = teclado.nextInt();
		float popFinal = popInicial + popInicial*crescimento*anos;
		System.out.printf("A população final foi de %d pessoas",  (int)popFinal);
	}
}
