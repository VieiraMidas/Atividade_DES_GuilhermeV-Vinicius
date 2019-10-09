package PacoteAtividade;

import javax.swing.*;

public class Atividade13 {
    
        public static void main(String[] args) {
            String aux;
            double idade;
            int maior=0;
            
        try{
            
            /*Inicialização do Programa*/
            
            JOptionPane.showMessageDialog(null,"Esse programa tem como finalidade\ninformar quantas pessoas são maiores de 18 anos.");
            
            
            /*Coleta de dados*/
            for (int i=0; i < 19; i++){
               aux = JOptionPane.showInputDialog(null,"Digite a sua idade");
               idade = Double.parseDouble(aux);
               
               if (idade > 17){
                   
                   maior = maior + 1;
                
               }
            }
            JOptionPane.showMessageDialog(null,"O número de pessoas com idade\nmaior do que 18 anos é de: "+maior);
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null,"Por favor, utilizar somente números");
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Obrigado por utilizar o nosso programa");
        }
    }
    
}
