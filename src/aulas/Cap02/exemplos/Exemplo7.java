package aulas.Cap02.exemplos;

import java.util.Scanner;

public class Exemplo7 {

    public static void main(String[] args) {
        float largura, comprimento, area, perimetro;
        Scanner dado;
        try { 
            System.out.println("Entre  com o comprimento: ");
            dado = new Scanner(System.in);
            comprimento = dado.nextFloat();

            System.out.println("Entre coma largura; ");
            dado = new Scanner(System.in);
            largura = dado.nextFloat();

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            System.out.println("Área do retâgulo: " + area);
            System.out.println("Perimetro do retângulo: " + perimetro);

        } catch (NumberFormatException e) {
            System.out.println("Houve erro na conversão dos dados, Digite apenas caracteres numéricos "+ e.toString());
        }
    }
}
