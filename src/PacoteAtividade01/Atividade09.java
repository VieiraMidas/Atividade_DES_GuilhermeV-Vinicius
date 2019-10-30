package PacoteAtividade01;

import javax.swing.JOptionPane;

public class Atividade09 {
    public static void main(String[] args) {
        
        String aux;
        double raio, raio2, altura, volume;
        
        try{
            /*Inicialização do Programa*/
            JOptionPane.showMessageDialog(null,"Este programa tem como finalidade\ncalcular o volume de uma lata de óleo\nfornecida pelo usuário.");
            
            /*Coleta de Dados*/
            
            aux = JOptionPane.showInputDialog(null,"Digite o valor do raio");
            aux = aux.replace(",",".");
            raio = Double.parseDouble(aux);
            
            aux = JOptionPane.showInputDialog(null,"Digite a altura da lata");
            aux = aux.replace(",",".");
            altura = Double.parseDouble(aux);
            
            /*Operações*/
            
            raio2 = raio * raio;
            
            volume = 3.14159 * raio2 * altura;
            
            /*Resposta*/
            
            JOptionPane.showMessageDialog(null,"O valor do raio informado foi de: "+raio+"\na Altura da lata informada foi de: "+altura);
            JOptionPane.showMessageDialog(null,"O volume da lata é de: "+volume);
            
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null,"Por favor, utilizar somente números");
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Obrigado por utilizar o nosso programa");
        }
    }
}
