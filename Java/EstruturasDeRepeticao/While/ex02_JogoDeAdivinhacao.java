package Java.EstruturasDeRepeticao.While;

import java.util.Random;
import java.util.Scanner;

public class ex02_JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o Nível:\n1- Nível Facil (1-10)\n2- Nível Médio (1-50)\n3- Nível Difícil (1-100)\n");
        System.out.print("Sua escolha: ");
        int nivel = input.nextInt();
        Random random = new Random();
        int numeroSelecionado = 0;
        int acumulador = 0;
        while (true) {
            if (nivel == 1) {
                numeroSelecionado = random.nextInt(10)+1;
                break;
            } else if (nivel == 2) {
                numeroSelecionado = random.nextInt(50)+1;
                break;
            } else if (nivel == 3) {
                numeroSelecionado = random.nextInt(100)+1;
                break;
            } else {
                System.out.println("Digite novamente, nivel invalido");
                continue;
            }
        }
        

        while (true) {
            System.out.print("Adivinhe o número: ");
            int chute = input.nextInt();
            acumulador++;
            if (chute > numeroSelecionado) {
                System.out.println("O número que eu pensei é menor");
                continue;
            } else if (chute < numeroSelecionado) {
                System.out.println("O número que eu pensei é maior");
                continue;
            } else {
                System.out.printf("PARABENS, você acertou o número em %d tentativas", acumulador);
                break;
            }

        }

        
    }
}
