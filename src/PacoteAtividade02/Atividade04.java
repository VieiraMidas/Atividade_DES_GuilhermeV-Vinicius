
package PacoteAtividade02;

import javax.swing.JOptionPane;

public class Atividade04 {
    
    public static void main(String[] args) {
        
        try{
            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Por favor, digite somente números");
            System.exit(0);
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Obrigado por utilziar o sistema.");
        }
    }
}
