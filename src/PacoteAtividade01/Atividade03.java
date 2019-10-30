package PacoteAtividade01;

import javax.swing.*;

public class Atividade03 {
    
    public static void main(String[] args) {
        
        String aux;
        double raio,perimetro;
        
        try{
            /*Inicialização do programa*/
            JOptionPane.showMessageDialog(null,"Este programa tem como funcionalidade calcular o perímetro\nda circunferência, sendo o raio informado pelo usuário");
            
            /*Entrada do raio*/
            aux = JOptionPane.showInputDialog(null,"Digite o valor do raio da circunferência: ");
            aux = aux.replace(",",".");
            raio = Double.parseDouble(aux);
        
            /*Operação da circunferência*/
            perimetro = 2*3.14*raio;
            
            /*Resposta*/
            JOptionPane.showMessageDialog(null,"O raio informada da circunferência é de: "+raio+"\nO perímetro é de: "+perimetro);
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null,"Por favor, digitar somente números");
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Obrigado por utilizar o programa");
        }
    }
    
}
