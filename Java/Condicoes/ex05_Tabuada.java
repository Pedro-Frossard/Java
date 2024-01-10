package Java.Condicoes;

import java.util.Random;
import java.util.Scanner;


public class ex05_Tabuada {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            Random random = new Random();
            int numeroAleatorio1 = random.nextInt(20)+1;
            int numeroAleatorio2 = random.nextInt(20)+1;
            System.out.printf("Pergunta: %d X %d = ", numeroAleatorio1, numeroAleatorio2);
            int resposta1 = input.nextInt();
            int respostasCertas = 0;
            if (resposta1 == numeroAleatorio1*numeroAleatorio2) {
                System.out.println("Acertou!");
                respostasCertas+=1;
                System.out.println("Acertos atuais: " + respostasCertas);
            } else {
                System.out.println("Errou!\nResposta correta: " + numeroAleatorio1*numeroAleatorio2);
                System.out.println("Acertos atuais: " + respostasCertas);
            }
            int numeroAleatorio3 = random.nextInt(20)+1;
            int numeroAleatorio4 = random.nextInt(20)+1;
            System.out.printf("Pergunta: %d X %d = ", numeroAleatorio3, numeroAleatorio4);
            int resposta2 = input.nextInt();
            if (resposta2 == numeroAleatorio3*numeroAleatorio4) {
                System.out.println("Acertou!");
                respostasCertas+=1;
                System.out.println("Acertos atuais: " + respostasCertas);
            } else {
                System.out.println("Errou!\nResposta correta: " + numeroAleatorio3*numeroAleatorio4);
                System.out.println("Acertos atuais: " + respostasCertas);
            }
            
            int numeroAleatorio5 = random.nextInt(20)+1;
            int numeroAleatorio6 = random.nextInt(20)+1;
            System.out.printf("Pergunta: %d X %d = ", numeroAleatorio5, numeroAleatorio6);
            int resposta3 = input.nextInt();
            if (resposta3 == numeroAleatorio5*numeroAleatorio6) {
                System.out.println("Acertou!");
                respostasCertas+=1;
                System.out.println("Acertos atuais: " + respostasCertas);
            } else {
                System.out.println("Errou!\nResposta correta: " + numeroAleatorio5*numeroAleatorio6);
                System.out.println("Acertos atuais: " + respostasCertas);
            }

            int numeroAleatorio7 = random.nextInt(20)+1;
            int numeroAleatorio8 = random.nextInt(20)+1;
            System.out.printf("Pergunta: %d X %d = ", numeroAleatorio7, numeroAleatorio8);
            int resposta4 = input.nextInt();
            if (resposta4 == numeroAleatorio7*numeroAleatorio8) {
                System.out.println("Acertou!");
                respostasCertas+=1;
                System.out.println("Acertos atuais: " + respostasCertas);
            } else {
                System.out.println("Errou!\nResposta correta: " + numeroAleatorio7*numeroAleatorio8);
                System.out.println("Acertos atuais: " + respostasCertas);
            }

            int numeroAleatorio9 = random.nextInt(20)+1;
            int numeroAleatorio10 = random.nextInt(20)+1;
            System.out.printf("Pergunta: %d X %d = ", numeroAleatorio9, numeroAleatorio10);
            int resposta5 = input.nextInt();
            if (resposta5 == numeroAleatorio9*numeroAleatorio10) {
                System.out.println("Acertou!");
                respostasCertas+=1;
                System.out.println("Acertos atuais: " + respostasCertas);
            } else {
                System.out.println("Errou!\nResposta correta: " + numeroAleatorio9*numeroAleatorio10);
                System.out.println("Acertos atuais: " + respostasCertas);
            }
        }
    }
}
