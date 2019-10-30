package PacoteAtividade02;

import javax.swing.*;

public class Atividade01 {
    
    public static void main(String[] args) {
        
        int i,x,resultado;
        
        for(i=1;i<11;i++){
            for(x=0;x<11;x++){
                resultado = i * x;
                JOptionPane.showMessageDialog(null,i+" X "+x+" = "+resultado);
            }
        }
    }
    
}
