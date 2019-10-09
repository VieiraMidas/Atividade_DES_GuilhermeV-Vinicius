package PacoteAtividade;

import javax.swing.*;

public class Atividade02 {
    
    public static void main(String[] args) {
        
        String salarioString="",emprestimoString="",decisao="";
        double salario,limite,emprestimo;
        
        try{
        
            /*Inicialização do programa*/
            JOptionPane.showMessageDialog(null,"Este programa tem como funcionalidade avaliar se é possível\nrealizar o empréstimo, com base no salário informado pelo usuário.");
            
            /*Entrada salário*/
            salarioString = JOptionPane.showInputDialog (null,"Digite o valor do seu salário: ");
            salarioString = salarioString.replace(",",".");
            salario = Double.parseDouble(salarioString);
            
            /*Operação do limite de empréstimo*/
            limite = 0.3 * salario;
            
            /*Entrada de empréstimo*/
            emprestimoString = JOptionPane.showInputDialog(null,"Digite o valor de empréstimo a ser efetuado, lembrando que o limite máximo é de: "+ limite);
            emprestimoString = emprestimoString.replace(",",".");
            emprestimo = Double.parseDouble(emprestimoString);
            
            /*Operação de decisão de empréstimo*/
            if (emprestimo>limite){
                decisao = "não pode ser concedido. Valor excede o limite.";
            }
            else{
                decisao = "efetuado com sucesso.";
            }
            
            /*Resposta*/
            JOptionPane.showMessageDialog(null,"O salário digitado foi de: "+salario+"\nO limite permitido de empréstimo era de: "+limite+"\nO empréstimo solicitado foi de: "+emprestimo);
            JOptionPane.showMessageDialog(null,"Empréstimo "+decisao);
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null,"Por favor, digitar somente números");
            System.exit(0);
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Obrigado por utilizar o sistema.");
            System.exit(0);
        }
    }
}
