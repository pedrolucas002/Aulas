package aulas.Cap03.exemplos;

import javax.swing.JOptionPane;

public class Exemplo2 {

    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog(null, "Forneça o número do mês: ");
        if ( aux != null){
            try{
                int mes = Integer.parseInt(aux);
                if (mes >= 1 && mes <= 12){ //condições compostas
                    JOptionPane.showMessageDialog(null, "Número do mês válido: \n" + mes);
                } else{
                    JOptionPane.showMessageDialog(null, "Número do mês invalido: \n" + mes);
                }
            } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Digite apenas valores interiros: \n" + e);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Operação Cancelada!");
        }
    }
    
}
