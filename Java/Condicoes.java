package Java;

public class Condicoes {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 10;
        int quantidadePessoa = 1;
        if (idade >= 18) {
            System.out.println("É maior de idade, pode comprar bebidas");
        } else {
            System.out.println("Menor de idade, não pode comprar bebidas");
            if (quantidadePessoa >= 2) {
                System.out.println("Porem você está acompanhado(a), então pode levar");
            } else {
                System.out.println("Você não está acompanhado então não pode comprar de jeito nenhum!");
            }
        }
    }
}
