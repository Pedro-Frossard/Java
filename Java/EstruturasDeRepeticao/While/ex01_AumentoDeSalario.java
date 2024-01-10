package Java.EstruturasDeRepeticao.While;

import java.time.LocalDate;
import java.util.Scanner;

public class ex01_AumentoDeSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate data = LocalDate.now();
        int ano = data.getYear();
        while (true) {
            System.out.print("Qual é seu salario atual? ");
            double salarioInicial = input.nextInt();
            if (salarioInicial < 1000) {
                System.out.println("Salario invalido, por favor digite corretamente");
                continue;
            } else {
                System.out.print("Que ano você começou a trabalhar na empresa? ");
                int anoInicial = input.nextInt();
                if (anoInicial >= 1995 && anoInicial <= ano) {
                    int anosTrabalhando = ano-anoInicial;
                    int contador = 0;
                    double novoSalario = salarioInicial;
                    double aumento = 0;
                    double aumentoTotal = aumento;
                    while (contador < anosTrabalhando) {
                        if (contador == 0) {
                            aumento = novoSalario*0.015;
                            novoSalario+= novoSalario*0.015;
                            aumentoTotal+=aumento;
                            aumento = 0;
                        }
                        else {
                            aumento = aumentoTotal*0.1;
                            novoSalario+=aumento;
                            aumentoTotal+=aumento;
                            aumento = 0;
                        }
                        contador++;
                    }
                    System.out.printf("O seu novo salario será de R$%.2f, ele teve um aumento de %.2f%%", novoSalario, novoSalario*100/salarioInicial-100);
                    break;
                    
                }
                else {
                    System.out.println("Ano invalido, digite as informações novamente");
                    continue;
                }
            }
        }
        
    }
}
