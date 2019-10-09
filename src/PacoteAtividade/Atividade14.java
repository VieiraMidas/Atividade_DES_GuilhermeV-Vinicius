package PacoteAtividade;

import javax.swing.*;


public class Atividade14 {
    
 
    
    public static void main(String[] args) {
        
        String aux, aux1, nome="";
        int idade=122,i,idade1;
                
        try{
            /*Inicialização do Programa*/
            JOptionPane.showMessageDialog(null,"Este programa tem como finalidade\ninformar o nome da pessoa mais nova dentre 10");
            
            for(i=0; i<11;i++){
                /*Entrada de valores*/
                aux = JOptionPane.showInputDialog(null,"Digite o seu nome");
                aux1 = JOptionPane.showInputDialog(null,"Digite a sua idade");
                idade1 = Integer.parseInt(aux1);
                
                /*Processo*/
                if(idade1<idade){
                    idade = idade1;
                    nome = aux;
                }
            }
            /*Resultado*/
            JOptionPane.showMessageDialog(null,"A pessoa mais nova é: "+nome+"\nA idade foi de: "+idade+" anos");
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null,"Por favor, utilizar somente números");
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Obrigado por utilizar o nosso programa");
        }
    }
    
}
