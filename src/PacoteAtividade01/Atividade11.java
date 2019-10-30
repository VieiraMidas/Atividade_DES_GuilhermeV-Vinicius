package PacoteAtividade01;

import javax.swing.*;

public class Atividade11 {
    
        public static void main(String[] args) {
        
        String aux,senha="";
        double dividendo,divisor=0,resultado;
        
        try{
            /*Inicialização do programa*/
            JOptionPane.showMessageDialog(null,"Este programa tem como finalidade\ninformar o resultado da divisão de\ndois valores, caso a senha informada seja\ncorreta.");
            
            /*Entrada de valores*/
            aux = JOptionPane.showInputDialog(null, "Informe a senha que deseja utilizar:");
            senha += aux;
            
            aux = JOptionPane.showInputDialog(null, "Digite o dividendo, o valor que será dividido:");
            aux = aux.replace(",", ".");
            dividendo = Double.parseDouble(aux);
            
            while(divisor==0){
            aux = JOptionPane.showInputDialog(null, "Digite o divisor, o valor que irá dividir o dividendo, lembrando que deve ser difrente de 0:");
            aux = aux.replace(",", ".");
            divisor = Double.parseDouble(aux);
            if(divisor==0){
                JOptionPane.showMessageDialog(null,"O valor digitado não é suportado,\npor favor digite um valor diferente de 0");
            }
            }
            /*Processo de decisão*/
            aux = JOptionPane.showInputDialog(null,"Digite a sua senha, informada anteriormente:");
            
            if(!senha.equals(aux)){
                JOptionPane.showMessageDialog(null,"Senha informada incorreta.");
                System.exit(0);
            }
            
            resultado = dividendo/divisor;
            /*Resolução*/
            JOptionPane.showMessageDialog(null,"O dividendo informado foi de: "+dividendo+"\nO divisor informado foi de: "+divisor);
            JOptionPane.showMessageDialog(null,"O resultado é de: "+resultado);
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null,"Por favor, utilizar somente números");
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Obrigado por utilizar o nosso programa");
        }
    }
    
}
