
package PacoteAtividade01;

import javax.swing.JOptionPane;


public class Atividade08 {
    
    public static void main(String[] args) {
        
        String aux;
        int aulas,salario=48;
        double horas,salarioBruto,inss,salarioLiquido,desconto;
        
        try{
            /*Inicialização do Programa*/
            JOptionPane.showMessageDialog(null,"Este programa tem como funcionalidade\ncalcular o salário líquido de\num professor, que possui o\no salário hora de R$48,00 e a quantidade de\naulas dadas no mês informada pelo usuário.");
        
            /*Entrada dew Valores*/
            aux = JOptionPane.showInputDialog(null,"Digite a quantidade de aulas dadas no mês:");
            aulas = Integer.parseInt(aux);
            
            /*Processamento*/
            horas = aulas * 50;
            horas = horas / 60;
            salarioBruto = horas * salario;
            
            if(salarioBruto<1751.82){
                inss = 0.08;
            }
            else if(salarioBruto>1751.81 && salarioBruto<2919.73){
                inss = 0.09;
            }
            else{
                inss = 0.11;
            }
            
            desconto = salarioBruto * inss;
            salarioLiquido = salarioBruto - desconto;
            
            /*Resultado*/
            JOptionPane.showMessageDialog(null,"O salário hora do professor é de: "+salario+"\nO número de aulas dadas no mês foi de: "+aulas+"\nO INSS aplicado foi de: "+inss+"%O desconto foi de: "+desconto);
            JOptionPane.showMessageDialog(null,"O salário liquído é de: "+salarioLiquido);
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null,"Por favor, utilizar somente números");
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Obrigado por utilizar o nosso programa");
        }
    }
    
}


