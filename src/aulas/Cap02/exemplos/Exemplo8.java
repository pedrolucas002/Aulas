package aulas.Cap02.exemplos;

import javax.swing.JOptionPane;

public class Exemplo8 {
    public static void main(String[] args) {
        String aux;
        float largura, comprimento, area, perimetro;
        try{
            aux = JOptionPane.showInputDialog(null, "Entre  com o Comprimentro: ");
            comprimento = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog(null, "Entre  com o Largura: ");
            largura = Float.parseFloat(aux);

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            JOptionPane.showMessageDialog(null, "Área  do retângulo" + area + "\nPerimentro do  retãngulo: " + perimetro);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão dos dados, Digite apenas caracteres numéricos " + e.toString());
        }
    }    
}
