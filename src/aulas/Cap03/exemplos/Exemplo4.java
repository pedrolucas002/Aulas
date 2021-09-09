package aulas.Cap03.exemplos;

import javax.swing.JOptionPane;

public class Exemplo4 {

    public static void main(String[] args) {

        int a = 0, b = 0 , maior;
        String aux = JOptionPane.showInputDialog(null, "Forneça o primeiro número: ");
        a = Integer.parseInt(aux);

        aux = JOptionPane.showInputDialog(null, "Forneça o Segundo número: ");
        b = Integer.parseInt(aux);

        if (a > b){
            maior = a;
        } else {
            maior = b;
        }
        JOptionPane.showMessageDialog(null, "Usuario um if comum: " + maior);
        
        int c = 10, d = 8;
        maior = (c > b) ? c : d;
        JOptionPane.showMessageDialog(null, "Usando umif Resumido: " + maior);
    }
    
}
