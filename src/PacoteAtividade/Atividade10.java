package PacoteAtividade;

import javax.swing.*;

public class Atividade10 {
    
    public static void main(String[] args) {
    
    String aux;
    double tempo,velocidade,litros_usados,distancia;
        try {
            /*Inicialização do Programa*/
            JOptionPane.showMessageDialog(null,"Este programa tem como finalidade\ninformar a quantidade de litros\ngastos por um carro, sendo o\ntempo e a velocidade informados pelo usuário.");
            
            /*Entrada de valores*/
            aux = JOptionPane.showInputDialog(null,"Digite o tempo gasto, em horas, pelo carro:");
            aux = aux.replace(",",".");
            tempo = Double.parseDouble(aux);
            
            
            aux = JOptionPane.showInputDialog(null,"Digite a velocidade média, em km por hora, do carro:");
            aux = aux.replace(",",".");
            velocidade = Double.parseDouble(aux);

            /*Processo de conta*/
            distancia = tempo * velocidade;
            litros_usados = distancia/12;
            
            /*Resultado*/
            JOptionPane.showMessageDialog(null,"O tempo informado foi de: "+tempo+"\nA velocidade informada foi de: "+velocidade+"\nO rendimento do carro era de: 12km por litro\nA distância percorrida foi de: "+distancia);
            JOptionPane.showMessageDialog(null,"Foram usados o total de: "+litros_usados+" litros");
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null,"Por favor, utilizar somente números");
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Obrigado por utilizar o nosso programa");
        }
    }

}