package Java;

import java.util.Scanner;

public class ManipulacaoDeDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s foi 25%% maior que a nota anterior, a nota atual foi %.2f \n\n", nome, nota);
    }
}
