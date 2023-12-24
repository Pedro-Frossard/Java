package Java.NumerosOperadores;

import java.util.Scanner;

public class ex02_LatasDeTinta {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.print("Qual é o comprimento do piso? ");
        int comprimento = Teclado.nextInt();
        System.out.print("Qual é a largura? ");
        int largura = Teclado.nextInt();
        float litros = (float) comprimento * largura/3;
        float latas = litros/5;
        float preco = latas*90;
        System.out.printf("Para pintar um piso %dx%d você precisará de %.2f latas de tinta que custará R$%.2f", comprimento, largura, latas, preco);
    }
}
