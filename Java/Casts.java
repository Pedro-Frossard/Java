package Java;

public class Casts {
    public static void main(String[] args) {
        double salario = 2700.5;
        int valor = (int) salario;

        long numeroGrande = 176425678276L;
        short numeroPequeno = 32767; //maximo
        byte numeroByte = 127; //maximo

        System.out.println(salario);
        System.out.println(valor);
        System.out.println(numeroGrande);
        System.out.println(numeroPequeno);
        System.out.println(numeroByte);
    }
}
