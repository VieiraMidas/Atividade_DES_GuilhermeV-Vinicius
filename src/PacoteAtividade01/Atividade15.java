package PacoteAtividade01;

import javax.swing.*;

public class Atividade15 {
    
    public static void main(String[] args) {
        
        String aux,prato="",sobremesa="",bebida="";
        int caloria_prato=0,caloria_sobremesa=0,caloria_bebida=0,calorias;
        try{
            /*Inicialização do programa*/
            JOptionPane.showMessageDialog(null,"Este programa tem como finalidade\ninformar a quantidade de calorias consumida\npelo usuário, com base em suas escolhas.");
            
            /*Entrada de valores*/
            
                /*Prato*/
            aux = JOptionPane.showInputDialog(null,"Digite o número do prato que comeu/comerá,sabendo que:\n1 - Vegetariano\n2 - Peixe\n3 - Frango\n4 - Carne");
            
            switch(aux){
                case "1":
                    prato = "Vegetariano";
                    caloria_prato = 180;break;
                case "2":
                    prato = "Peixe";
                    caloria_prato = 230;break;
                case "3":
                    prato = "Frango";
                    caloria_prato = 250;break;
                case "4":
                    prato = "Carne";
                    caloria_prato = 350;break;
                default: 
                    JOptionPane.showMessageDialog(null,"Valor não suportado pelo sistema.");
                    System.exit(0);
            }
            
                /*Sobremesa*/
            aux = JOptionPane.showInputDialog(null,"Digite o número da sobremesa que comeu/comerá,sabendo que:\n1 - Abacaxi\n2 - Sorvete diet\n3 - Mouse diet\n4 - Mouse Chocolate");
            
            switch(aux){
                case "1":
                    sobremesa += "Abacaxi";
                    caloria_sobremesa += 75;break;
                case "2":
                    sobremesa += "Sorvete diet";
                    caloria_sobremesa += 110;break;
                case "3":
                    sobremesa += "Mouse diet";
                    caloria_sobremesa += 170;break;
                case "4":
                    sobremesa += "Mouse chocolate";
                    caloria_sobremesa += 200;break;
                default: 
                    JOptionPane.showMessageDialog(null,"Valor não suportado pelo sistema.");
                    System.exit(0);
            }
            
                /*Bebida*/
            aux = JOptionPane.showInputDialog(null,"Digite o número da bebida que bebeu/beberá,sabendo que:\n1 - Chá\n2 - Suco de Laranja\n3 - Suco de melão\n4 - Refrigerante diet");
            
            switch(aux){
                case "1":
                    bebida += "Chá";
                    caloria_bebida += 20;break;
                case "2":
                    bebida += "Suco de Laranja";
                    caloria_bebida += 70;break;
                case "3":
                    bebida += "Suco de melão";
                    caloria_bebida += 100;break;
                case "4":
                    bebida += "Refrigerante diet";
                    caloria_bebida += 65;break;
                default: 
                    JOptionPane.showMessageDialog(null,"Valor não suportado pelo sistema.");
                    System.exit(0);
            }
            /*Processo de cálculo*/
            calorias = caloria_prato + caloria_sobremesa + caloria_bebida;
            
            /*Resolução*/
            JOptionPane.showMessageDialog(null,"O prato escolhido e a caloria dele foram: "+prato+", "+caloria_prato+" cal\nA sobremesa escolhida e sua caloria foram: "+sobremesa+", "+caloria_sobremesa+" cal\nA bebida escolhida e sua caloria foram: "+bebida+", "+caloria_bebida+" cal");
            JOptionPane.showMessageDialog(null,"O total de caloria consumida foi de: "+calorias);
     
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null,"Por favor, utilizar somente números");
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Obrigado por utilizar o nosso programa");
        }
    }
    
}
