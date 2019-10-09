
package PacoteAtividade;

import javax.swing.*;

public class Atividade01 {
    
    public static void main(String[] args) {
        
        String salarioString="", porcentualString="";
        double salario, porcentual, salariofinal, aumento;
        
        try{
            /*Inicialização do programa*/
            JOptionPane.showMessageDialog(null,"Este programa tem como funcionalidade mostrar o novo salário,\napós o o acréscimo do porcentual fornecido ao salário informado\npelo usuário.");
            
            /* Entrada de salário e porcentual*/
            salarioString = JOptionPane.showInputDialog (null,"Digite o salário do funcionário: ");
            salarioString = salarioString.replace (",", ".");
            salario = Double.parseDouble(salarioString);

            
            porcentualString = JOptionPane.showInputDialog (null,"Digite o porcentual a ser aplicado: ");
            porcentualString = porcentualString.replace (",", "."); 
            porcentual = Double.parseDouble(porcentualString);
            
            /*Método da operação*/
            aumento = porcentual / 100 * salario;
            salariofinal = aumento + salario;
            
            /*Resposta*/
            JOptionPane.showMessageDialog(null,"O salário do funcionário era de: "+salario+"\nO porcentual utilizado foi de: "+porcentual+"%\n E o salário final, após o acréscimo, é de: "+salariofinal);
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog (null,"Por favor, digitar somente números");
            System.exit(0);
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Obrigado por utilizar o sistema.");
            System.exit(0);
        }
    }
}
