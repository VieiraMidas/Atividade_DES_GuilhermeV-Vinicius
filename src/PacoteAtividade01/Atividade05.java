package PacoteAtividade01;

import javax.swing.*;

public class Atividade05 {

    public static void main(String[] args) {
        
        int i = 5, j, k;
        
        try {
            /*Inicialização do Programa*/
            JOptionPane.showMessageDialog(null, "Esse program tem como funcionalidade\ninformar os valores das variáveis I , J e K");
        
            /*Processo de alterção das variáveis*/
            j = --i;
            k = i++;
            i += 10;
            
            /*Resultado*/
            JOptionPane.showMessageDialog(null,"Os valores das variáveis I, J e K correspondem à:\ni = "+i+"\nj = "+j+"\nk = "+k);
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Por favor, digitar somente números");
            System.exit(0);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar o programa");
            System.exit(0);
        }
    }

}
