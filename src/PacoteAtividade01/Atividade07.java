package PacoteAtividade01;
import javax.swing.*;

public class Atividade07 {
    
    public static void main(String[] args) {
        
        String aux;
        double valor, desconto = 0.09, resultado, desconto2;
        
        try{
            /*Inicialização do programa*/
            JOptionPane.showMessageDialog(null,"Este programa tem como funcionalidade mostrar o valor de um produto\napós o desconto de 9% dele");
            
            /* Entrada de valores*/
            
            aux = JOptionPane.showInputDialog (null, "Digite o valor do produto");
            aux = aux.replace(",", ".");
            valor = Double.parseDouble(aux);
            
            /*Operação do desconto do produto*/
            
            desconto2 = desconto * valor;
            resultado = valor - desconto2;
            
            /*Resposta*/
            
       JOptionPane.showMessageDialog(null,"O valor do produto digitado foi de: "+valor+"\nO valor do desconto fixo é de: 9%\nO valor total a ser descontado é de: "+desconto2);
       JOptionPane.showMessageDialog(null,"O valor final do produto é de: "+resultado);     
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null,"Por favor, utilizar somente números");
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Obrigado por utilizar o nosso programa");
        }
    }
    
    
}
