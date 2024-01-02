package Java.Condicoes;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.err.print("Nota 1 do aluno: ");
        float nota1 = teclado.nextInt();
        System.err.print("Nota 2 do aluno: ");
        float nota2 = teclado.nextInt();
        float media = (nota1+nota2)/2;
        String situacao = media >= 6 ? "Aprovado" : "Reprovado";
        System.err.printf("A média do estudante foi %.2f e sua situação atual é %s \n", media, situacao);

        System.err.print("Nota 1 de outro aluno: ");
        float OutraNota1 = teclado.nextInt();
        System.err.print("Nota 2 de outro aluno: ");
        float OutraNota2 = teclado.nextInt();
        float OutraMedia = (OutraNota1+OutraNota2)/2;
        String situacao2 = OutraMedia >= 6 ? "Aprovado" : "Reprovado";
        System.err.printf("A média do estudante foi %.2f e sua situação atual é %s \n", OutraMedia, situacao2);
        boolean Aprovados = situacao == "Aprovado" && situacao2 == "Aprovado" ? true : false;
        boolean AlgumAprovado = situacao == "Aprovado" || situacao2 == "Aprovado" ? true : false;
        System.err.printf("Os dois foram aprovados? %b\nAlgum foi aprovado? %b\n", Aprovados, AlgumAprovado);
    }
}
