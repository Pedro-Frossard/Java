package Java.Condicoes;

import java.util.Scanner;
import java.lang.Math;

public class ex04_Estacionamento {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Que horas você chegou no estacionamento? ");
            int HoraEntrada = input.nextInt();
            System.out.print("Que minuto você chegou? ");
            int MinutoEntrada = input.nextInt();
            System.out.print("Que horas você saiu do estacionamento? ");
            int HoraSaida = input.nextInt();
            System.out.print("Que minuto você saiu? ");
            int MinutoSaida = input.nextInt();
            float preco = 0f;
            int MinutosNoEstacionamento = 0;
            int HorasNoEstacionamento = 0;
            if (HoraEntrada < 24 && HoraSaida < 24 && MinutoEntrada < 60 && MinutoSaida < 60) {
                if (HoraEntrada < HoraSaida) {
                    if (MinutoEntrada < MinutoSaida) {
                        MinutosNoEstacionamento = (HoraSaida-HoraEntrada) *60;
                        MinutosNoEstacionamento += MinutoSaida-MinutoEntrada;
                    }
                    else if (MinutoEntrada > MinutoSaida) {
                        MinutosNoEstacionamento = (HoraSaida-HoraEntrada) *60;
                        MinutosNoEstacionamento -= MinutoEntrada-MinutoSaida;
                    }
                    else {
                        MinutosNoEstacionamento = (HoraSaida-HoraEntrada)*60;
                    }
                }
                else if (HoraEntrada > HoraSaida) {
                    if (MinutoEntrada < MinutoSaida) {
                        MinutosNoEstacionamento = (24 - HoraEntrada + HoraSaida)*60;
                        MinutosNoEstacionamento += MinutoSaida - MinutoEntrada;
                    }
                    else if (MinutoEntrada > MinutoSaida) {
                        MinutosNoEstacionamento = (24 - HoraEntrada + HoraSaida)*60;
                        MinutosNoEstacionamento -= MinutoEntrada-MinutoSaida;
                    }
                    else {
                        MinutosNoEstacionamento = (24 - HoraEntrada + HoraSaida)*60;
                    }
                }
                else {
                    MinutosNoEstacionamento = MinutoSaida-MinutoEntrada;
                }
                HorasNoEstacionamento = Math.round((MinutosNoEstacionamento+59) / 60);
                if (HorasNoEstacionamento == 1 || HorasNoEstacionamento == 2) {
                    preco = HorasNoEstacionamento;
                }
                else if (HorasNoEstacionamento == 3 || HorasNoEstacionamento == 4) {
                    preco = HorasNoEstacionamento*1.4f;
                }
                else if (HorasNoEstacionamento >= 5) {
                    preco = HorasNoEstacionamento *2;
                }
                System.out.printf("Você ficou %d minutos no estacionamento que equivale a %d Horas\nPreço: R$%.2f", MinutosNoEstacionamento, HorasNoEstacionamento, preco);
            }
            else {
                System.out.println("Horario invalido");
            }
        }
    }
}
