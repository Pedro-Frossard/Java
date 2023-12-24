package Java.NumerosOperadores;

import java.util.Scanner;

public class ex01_ConversaoDeHoras {
    public static void main(String[] args){
        // Segundo para hora
        Scanner Teclado = new Scanner(System.in);
        System.out.print("Segundos: ");
        int segundos = Teclado.nextInt();
        int horas = segundos/3600;
        int minutos = (segundos%3600)/60;
        int SegundosFaltando = (segundos%3600)%60;
        System.out.printf("%d segundos é %02d:%02d:%02d em horas\n\n", segundos, horas, minutos, SegundosFaltando);

        // Hora para segundo
        System.out.print("Hora: ");
        int horas2 = Teclado.nextInt();
        System.out.print("Minutos: ");
        int minutos2 = Teclado.nextInt();
        System.out.print("Segundos: ");
        int segundos2 = Teclado.nextInt();
        int segundosTotais = horas2*3600 + minutos2*60 + segundos2;
        System.out.printf("%02d:%02d:%02d em segundos é %d", horas2, minutos2, segundos2, segundosTotais);
    }
}



