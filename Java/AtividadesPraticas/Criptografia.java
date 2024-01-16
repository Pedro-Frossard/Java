package Java.AtividadesPraticas;

import java.util.Random;
import java.util.Scanner;

import Java.Condicoes.ex01_ValidandoSenha;

public class Criptografia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alfabetoMin = "abcdefghijklmnopqrstuvwxyz";
        String alfabetoMaiusculo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int contador = 0;
        String novaMensagem = "";
        int indexAlfabeto;
        int indexCriptografado;
        int indexDescriptografado;
        char letra;
        boolean mensagemFoiTransformada = false;
        while (true) {
            if (mensagemFoiTransformada) {
                System.out.print("Deseja continuar (1- SIM/2- NÃO)? ");
                int continuar = input.nextInt();
                if (continuar == 2) {
                    break;
                } else {
                    contador = 0;
                    novaMensagem = "";
                    mensagemFoiTransformada = false;
                }
            }
            System.out.println("1- Criptografar mensagem com chave\n2- Descriptografar mensagem com chave\n3- Criptografar mensagem com chave aleatoria\n4- Descriptografar mensagem com chave aleatoria");
            System.out.print("Escolha: ");
            int escolha = input.nextInt();

            if (escolha < 1 || escolha > 4) {
                System.out.println("Opção não encontrada, tente novamente\n");
                continue;
            } else if (escolha == 1) {
                while (true) {
                    input.nextLine();
                    System.out.print("Qual é a mensagem? ");
                    String mensagem = input.nextLine();
                    StringBuilder stb = new StringBuilder(mensagem);
                    System.out.print("Qual é a chave? ");
                    int chave = input.nextInt();
                    if (chave <= 25 && chave > 0) {
                        while (true) {
                            if (contador >= mensagem.length()) {
                                System.out.println("A sua mensagem criptografada vai estar assim " + novaMensagem);
                                mensagemFoiTransformada = true;
                                break;
                            }
                            letra = stb.charAt(contador);
                            if (letra == " a".charAt(0)) {
                                novaMensagem += " ";
                                contador++;
                            }
                            else {
                                if (Character.isUpperCase(letra)) {
                                indexAlfabeto = alfabetoMaiusculo.indexOf(letra);
                                indexCriptografado = indexAlfabeto + chave;
                                if (indexAlfabeto + chave > 25) {
                                    indexCriptografado -= 26;
                                }
                                novaMensagem += alfabetoMaiusculo.charAt(indexCriptografado);

                                contador++;
                            } else {
                                indexAlfabeto = alfabetoMin.indexOf(letra);
                                indexCriptografado = indexAlfabeto + chave;
                                if (indexAlfabeto + chave > 25) {
                                    indexCriptografado -= 26;
                                }
                                novaMensagem += alfabetoMin.charAt(indexCriptografado);

                                contador++;
                            }
                            }     
                        }
                        if (mensagemFoiTransformada) {
                                break;
                            }
                    } else {
                        System.out.println("Chave invalida, por favor escreva uma chave entre 1-25");
                        continue;
                    }
                }

            } else if (escolha == 2) {
                while (true) {
                    input.nextLine();
                    System.out.print("Qual é a mensagem? ");
                    String mensagem = input.nextLine();
                    StringBuilder stb = new StringBuilder(mensagem);
                    System.out.print("Qual é a chave? ");
                    int chave = input.nextInt();
                    if (chave <= 25 && chave > 0) {
                        while (true) {
                            if (contador >= mensagem.length()) {
                                System.out.println("A sua mensagem descriptografada vai estar assim " + novaMensagem);
                                mensagemFoiTransformada = true;
                                break;
                            }
                            letra = stb.charAt(contador);
                            if (letra == " a".charAt(0)) {
                                novaMensagem += " ";
                                contador++;
                            } else {
                                if (Character.isUpperCase(letra)) {
                                indexAlfabeto = alfabetoMaiusculo.indexOf(letra);
                                indexDescriptografado = indexAlfabeto - chave;
                                if (indexDescriptografado < 0) {
                                    indexDescriptografado += 26;
                                }
                                novaMensagem += alfabetoMaiusculo.charAt(indexDescriptografado);

                                contador++;
                            } else {
                                indexAlfabeto = alfabetoMin.indexOf(letra);
                                indexDescriptografado = indexAlfabeto - chave;
                                if (indexDescriptografado < 0) {
                                    indexDescriptografado += 26;
                                }
                                novaMensagem += alfabetoMin.charAt(indexDescriptografado);

                                contador++;
                            }
                            }     
                        }
                        if (mensagemFoiTransformada) {
                                break;
                            }
                    } else {
                        System.out.println("Chave invalida, por favor escreva uma chave entre 1-25");
                        continue;
                    }
                }

            } else if (escolha == 3) {
                while (true) {
                    input.nextLine();
                    System.out.print("Qual é a mensagem? ");
                    String mensagem = input.nextLine();
                    StringBuilder stb = new StringBuilder(mensagem);
                    Random random = new Random();
                    int chave = random.nextInt(24)+1;
                    if (chave <= 25 && chave > 0) {
                        while (true) {
                            if (contador >= mensagem.length()) {
                                System.out.printf("A sua mensagem criptografada vai estar assim %s, a chave usada para isso foi %d\n", novaMensagem, chave);
                                mensagemFoiTransformada = true;
                                break;
                            }
                            letra = stb.charAt(contador);
                            if (letra == " a".charAt(0)) {
                                novaMensagem += " ";
                                contador++;
                            }
                            else {
                                if (Character.isUpperCase(letra)) {
                                indexAlfabeto = alfabetoMaiusculo.indexOf(letra);
                                indexCriptografado = indexAlfabeto + chave;
                                if (indexAlfabeto + chave > 25) {
                                    indexCriptografado -= 26;
                                }
                                novaMensagem += alfabetoMaiusculo.charAt(indexCriptografado);

                                contador++;
                            } else {
                                indexAlfabeto = alfabetoMin.indexOf(letra);
                                indexCriptografado = indexAlfabeto + chave;
                                if (indexAlfabeto + chave > 25) {
                                    indexCriptografado -= 26;
                                }
                                novaMensagem += alfabetoMin.charAt(indexCriptografado);

                                contador++;
                            }
                            }     
                        }
                        if (mensagemFoiTransformada) {
                                break;
                            }
                    } else {
                        System.out.println("Chave invalida, por favor escreva uma chave entre 1-25");
                        continue;
                    }
                }

            } else if (escolha == 4) {
                while (true) {
                    input.nextLine();
                    System.out.print("Qual é a mensagem? ");
                    String mensagem = input.nextLine();
                    StringBuilder stb = new StringBuilder(mensagem);
                    Random random = new Random();
                    int chave = random.nextInt(24)+1;
                    if (chave <= 25 && chave > 0) {
                        while (true) {
                            if (contador >= mensagem.length()) {
                                System.out.printf("A sua mensagem descriptografada vai estar assim %s, a chave usada para isso foi %d\n", novaMensagem, chave);
                                mensagemFoiTransformada = true;
                                break;
                            }
                            letra = stb.charAt(contador);
                            if (letra == " a".charAt(0)) {
                                novaMensagem += " ";
                                contador++;
                            } else {
                                if (Character.isUpperCase(letra)) {
                                indexAlfabeto = alfabetoMaiusculo.indexOf(letra);
                                indexDescriptografado = indexAlfabeto - chave;
                                if (indexDescriptografado < 0) {
                                    indexDescriptografado += 26;
                                }
                                novaMensagem += alfabetoMaiusculo.charAt(indexDescriptografado);

                                contador++;
                            } else {
                                indexAlfabeto = alfabetoMin.indexOf(letra);
                                indexDescriptografado = indexAlfabeto - chave;
                                if (indexDescriptografado < 0) {
                                    indexDescriptografado += 26;
                                }
                                novaMensagem += alfabetoMin.charAt(indexDescriptografado);

                                contador++;
                            }
                            }     
                        }
                        if (mensagemFoiTransformada) {
                                break;
                            }
                    } else {
                        System.out.println("Chave invalida, por favor escreva uma chave entre 1-25");
                        continue;
                    }
                }
            }  
        }
    }
}
