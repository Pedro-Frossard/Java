package Java.Condicoes;

import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantos anos você tem? ");
        int idade = teclado.nextInt();
        if (idade < 16) {
            System.out.println("Você é proibido de votar");
        } else if (idade >= 16 && idade < 18 || idade >70) {
                System.out.println("Voto é opcional");
        } else {
                System.out.println("O voto é obrigatorio");
            }
        }
    }
