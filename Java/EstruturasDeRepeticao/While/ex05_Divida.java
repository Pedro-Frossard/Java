package Java.EstruturasDeRepeticao.While;

import java.util.Scanner;

public class ex05_Divida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual é o valor da divida? R$");
        double divida = input.nextDouble();
        System.out.print("Quanto você pretende pagar por mês para quitar essa divida? R$");
        double pagamento = input.nextDouble();

        double dividaAtual = divida;
        int meses = 1;
        double totalPago = 0;
        while (true) {
            if (dividaAtual < pagamento) {
                totalPago += dividaAtual;
                dividaAtual = 0;
                System.out.printf("Mes: %d\nDivida inicial: R$%.2f\nDivida atual: R$%.2f\nTotal pago: R$%.2f\n\n", meses, divida, dividaAtual, totalPago);
                break;
            } else if (dividaAtual > pagamento) {
                dividaAtual -= pagamento;
                totalPago +=pagamento;
                System.out.printf("Mes: %d\nDivida inicial: R$%.2f\nDivida atual: R$%.2f\nTotal pago: R$%.2f\n\n", meses, divida, dividaAtual, totalPago);
            } else {
                dividaAtual -= pagamento;
                totalPago +=pagamento;
                System.out.printf("Mes: %d\nDivida inicial: R$%.2f\nDivida atual: R$%.2f\nTotal pago: R$%.2f\n\n", meses, divida, dividaAtual, totalPago);
                break;
            } 
            meses++;
        }
    }
}
