package Java.Condicoes;

import java.util.Scanner;

public class ex03_PromocaoDeMercado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mercado J&F - Promoção FRIBOI");
        System.out.println("1- File Duplo\n2- Alcatra\n3- Picanha");
        System.out.print("Digite o tipo que deseja levar: ");
        int tipo = input.nextInt();
        System.out.print("Digite a quantidade (em KG): ");
        float kilos = input.nextInt();
        System.out.println("A compra será realizada com cartão de débito?\n1- SIM\n2- NÃO");
        System.out.print("Sua escolha: ");
        int debito = input.nextInt();
        float ValorDaCompra = 0;
        String carne = "Nenhuma";
        if (tipo == 1) {
            carne = "File Duplo";
            if (kilos <= 5) {
                ValorDaCompra = kilos*4.9f;
            }
            else if (kilos > 5) {
                ValorDaCompra = kilos*5.8f;
            }
        }
        else if (tipo == 2) {
            carne = "Alcatra";
            if (kilos <= 5) {
                ValorDaCompra = kilos*5.9f;
            }
            else if (kilos > 5) {
                ValorDaCompra = kilos*6.8f;
            }
        }
        else if (tipo == 3) {
            carne = "Picanha";
            if (kilos <= 5) {
                ValorDaCompra = kilos*6.9f;
            }
            else if (kilos > 5) {
                ValorDaCompra = kilos*7.8f;
            }
        }
        else {
            System.out.println("Tipo invalido");
        }
        String ComDebito;
        float ValorComDesconto;
        if (debito == 1) {
            ValorComDesconto = ValorDaCompra*0.95f;
            ComDebito = "SIM";
        } else {
            ValorComDesconto = ValorDaCompra;
            ComDebito = "NÃO";
        }


        System.out.println("**********CUPOM FISCAL**********");
        System.out.printf("Carne: %s\nQuantidade: %.2f\nPreço: R$%.2f\nCartão de Débito: %s\nTotal com desconto: R$%.2f", carne, kilos, ValorDaCompra, ComDebito, ValorComDesconto);
    }
}
