package aulas.Cap02.exemplos;

import java.io.*;

public class Exemplo5 {

    public static void main(String[] args) {
        String s; // toda forma de entra da de dados via usuario, so entra de forma "STRING"
        float largura, comprimento, area, perimetro;
        DataInputStream dado;
        try { // tratamento de erro, try a tentativa
            System.out.println("Entre  com o comprimento: ");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            comprimento = Float.parseFloat(s);

            System.out.println("Entre coma largura; ");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            largura = Float.parseFloat(s);

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            System.out.println("Área do retâgulo: " + area);
            System.out.println("Perimetro do retângulo: " + perimetro);

        } catch (IOException e) {
            System.out.println("Houve em erro na entrada dos dados, " + e.toString());
        } catch (NumberFormatException e) {
            System.out.println("Houve na conversão dos dados, Digite apenas caracteres numéricos "+ e.toString());
        }
    }
    
}
