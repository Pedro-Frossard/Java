package Java;

public class TestandoCaracteres {
    public static void main(String[] args) {
        char letra = 'A'; //Suporta apenas uma letra e apenas aspas simples
        System.out.println(letra);
        
        char letra2 = 66; //O char é um valor, cada numero é um caractere
        System.out.println(letra2);

        char letra3 = (char) (letra2 + 1); // letra2 + 1 não funciona pois um inteiro não cabe em um char
        System.out.println(letra3);
        
        String mensagem = "Estou aprendendo java";
        System.out.println(mensagem);

        String mensagem2 = mensagem + 2023 + 1; //Uma string, vai mostrar: Estou aprendendo java20231. Se for mensagem = mensagem + (2023 + 1) vai primeiro fazer a conta, assim mostrando: Estou aprendendo java2024
        System.out.println(mensagem2);

        String mensagem3 = mensagem + " com o Mateus Java";
        System.out.println(mensagem3);
    }
}
