package Java;

public class TestandoTipos {
    public static void main(String[] args) {
        int idade = 30;
        String valor = Integer.toString(idade); //String valor = idade; --> Vai dar error, até mesmo se for String valor = (String) idade;
        System.out.println(valor+idade); //Ele mostra 3030, pois o valor é uma String que quando junta com um número fica "30"30, que no final mostra 3030

        String valor2 = "30";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(valor2+idade2);
    }
}
