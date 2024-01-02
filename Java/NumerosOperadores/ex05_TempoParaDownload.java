package Java.NumerosOperadores;

import java.util.Scanner;

public class ex05_TempoParaDownload {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual é o tamanho do arquivo em MB? ");
        int arquivoMB = teclado.nextInt();
        System.out.print("Digite a velocidade da conexão em Mbps: ");
        int velocidade = teclado.nextInt();
        float TempoDeConexao = arquivoMB * 8 / velocidade;
        System.out.printf("O tempo de download vai ser de %.2f segundos\n", TempoDeConexao);
        boolean rapidez = TempoDeConexao < 60;
        System.out.printf("O tempo de download é rapido? %b", rapidez);
    }

}  
