package Java.Condicoes;

import java.util.Scanner;

public class ex02_emprestimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanto você deseja pegar emprestado? ");
        float ValorEmprestimo = input.nextInt();
        System.out.print("Qual sua renda mensal atual? ");
        float RendaMensal = input.nextInt();
        input.nextLine();
        System.out.println("Seu score é acima de 450 pontos? ");
        String score = input.nextLine();
        System.out.println("Você não possuí dividas ativas? ");
        String dividas = input.nextLine();
        System.out.println("Você é funcionario público? ");
        String FuncionarioPublico = input.nextLine();
        System.out.println("Você aceita compartilhar seus dados de outros bancos? ");
        String DadosBancarios = input.nextLine();

        int PontosPositivos = 0;
        if (ValorEmprestimo*2 < RendaMensal) {
            PontosPositivos+=1;
        }
        if (score.equals("Sim") || score.equals("SIM") || score.equals("sim")) {
            PontosPositivos+=1;
        }
        if (dividas.equals("Sim") || dividas.equals("SIM") || dividas.equals("sim")) {
            PontosPositivos+=1;
        }
        if (FuncionarioPublico.equals("Sim") || FuncionarioPublico.equals("SIM") || FuncionarioPublico.equals("sim")) {
            PontosPositivos+=1;
        }
        if (DadosBancarios.equals("Sim") || DadosBancarios.equals("SIM")||DadosBancarios.equals("sim")) {
            PontosPositivos+=1;
        }
        
        System.out.println("Sua pontuação foi de "+PontosPositivos);

        float EmprestimoAprovado;

        if (PontosPositivos == 2) {
            EmprestimoAprovado = ValorEmprestimo*0.2f;
            System.out.printf("Aprovado com restrições, valor aprovado: R$%.2f", EmprestimoAprovado);
        } 
        else if (PontosPositivos == 3 || PontosPositivos == 4) {
            EmprestimoAprovado = ValorEmprestimo*0.6f;
            System.out.printf("Aprovado com desconto, valor aprovado: R$%.2f", EmprestimoAprovado);
        } 
        else if (PontosPositivos == 5) {
            System.out.println("Aprovação total");
        } 
        else {
            System.out.println("Não aprovado");
        }
    }
}
