package PacoteAtividade01;

import javax.swing.*;

public class Atividade12 {
    
        public static void main(String[] args) {
            
            String aux;
            double numero, antecessor, sucessor;
            
        try{
            
            /*Inicialização do Programa*/
            
            JOptionPane.showMessageDialog(null,"Este programa tem como finalidade\n ler um número e em seguida mostrar\no número sucessor e o antecessor");
            
            
            /*Coleta de dados*/
            
            aux = JOptionPane.showInputDialog(null,"Digite um número");
            numero = Double.parseDouble(aux);
            
            
            /*Operações*/
            
            antecessor = numero - 1;
            sucessor = numero + 1;
            
            /*Respostas*/
            
            JOptionPane.showMessageDialog(null,"O número digitado foi: "+numero+"\nSeu número antecessor é: "+antecessor+"\nSeu número sucessor é: "+sucessor);
            
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null,"Por favor, utilizar somente números");
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Obrigado por utilizar o nosso programa");
        }
    }
    
}
