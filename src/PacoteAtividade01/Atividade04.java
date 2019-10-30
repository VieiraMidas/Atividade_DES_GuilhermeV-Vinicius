package PacoteAtividade01;

import javax.swing.*;

public class Atividade04 {
    
    public static void main(String[] args) {
        
        String aux="",numeros="";
        int x;
        double numero,resultado=0;
        
        try{
            /*Inicialização do programa*/
            JOptionPane.showMessageDialog(null,"Esse program tem como funcionalidade\nsomar uma sequência de números\nfornecidas pelo usuario. ");
            
            /*Entrada de valores*/
            x=1;
            while(x==1){
                aux = JOptionPane.showInputDialog(null,"Digite o valor a ser somado: ");
                aux = aux.replace(",",".");
                numero = Double.parseDouble(aux);
                if (numero<0){
                    JOptionPane.showMessageDialog(null,"O valor digitado é negativo. \nNão é possível realizar a operação.");
                    System.exit(0);
                }
                /*Armazenamento de valores*/
                numeros += aux+",";
                
                /*Operação com os números*/
                resultado = resultado + numero;
                
                aux = JOptionPane.showInputDialog(null,"Deseja somar mais algum valor, se:\nSim - 1\nNão - 0");
                x = Integer.parseInt(aux);
                switch(x){
                    case 0: 
                        x=0;break;
                    case 1: 
                        x=1;break;
                    default:
                        JOptionPane.showMessageDialog(null,"Valor não suportado pelo sistema.");
                        System.exit(0);
                }
            }
            /*Resultado*/
            JOptionPane.showMessageDialog(null,"Os valores digitados foram: "+numeros+"\nE o resultado da soma é de: "+resultado);
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null,"Por favor, digitar somente números");
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Obrigado por utilizar o programa");
        }
    }
    
}
