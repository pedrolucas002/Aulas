package aulas.Cap03.exemplos;

import javax.swing.JOptionPane;

public class Exemplo1 {

    public static void main(String[] args) {
        Object[] op = {"Masculino", "Feminismo"};
        String resp = (String) JOptionPane.showInputDialog(null, "Selecione o sexo: \n", ".:Pesquisa:.", JOptionPane.PLAIN_MESSAGE, null, op, "Masculino");
        if ( resp == null ){
            JOptionPane.showMessageDialog(null, "Você Pressionou o cancelar!");
        }
        if ( resp == "Masculino" ){
            JOptionPane.showMessageDialog(null, "Você é Homem!");
        }
        if ( resp == "Feminino" ){
            JOptionPane.showMessageDialog(null, "Você é Mulher!");
        }
        System.exit(0);
    }
    
}
