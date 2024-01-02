package Java.Condicoes;

import java.util.Scanner;

public class ex01_ValidandoSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua senha: ");
        String senha = input.nextLine();
        if (senha.contains("!") || senha.contains("@") || senha.contains("#") || senha.contains("$") || senha.contains("%")) {
            if (senha.length() >= 8) {
                if (senha.matches(".*[A-Z].*") && senha.matches(".*[a-z].*")) {
                    System.out.println("Senha validada com sucesso");
                } else {
                    System.out.println("Senha invalida");
                }
            } else {
                    System.out.println("Senha invalida");
                }
        } else {
                    System.out.println("Senha invalida");
                }
    }
}
