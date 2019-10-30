package PacoteAtividade01;

import javax.swing.*;

public class Atividade06 {
    
    public static void main(String[] args) {
        
        String aux;
        int dia=0,mes=0,ano,dd=0,MM=0,AAAA,DiaAnos,bissexto,aaaa,bissextos=0,x=0,meses=0,dias=0,mesesx=0;
        
        try{
            /*Inicialização do programa*/
            JOptionPane.showMessageDialog(null,"Esse programa tem como principal finalidade\ninformar ao usuário a quantidade\nde dias que ele viveu até os dias atuais");
            
            /*Entrada da Data de Nascimento*/
            while(x==0){
            aux = JOptionPane.showInputDialog(null,"Digite o dia em que você nasceu:");
            dia = Integer.parseInt(aux);
            if(dia>31 || dia<1){
                JOptionPane.showMessageDialog(null,"Você digitou um valor não suportado pelo sistema.");
            }
            else{
                x+=1;
            }
            }
            
            x=0;
            while(x==0){
            aux = JOptionPane.showInputDialog(null,"Digite o número equivalente do mês em que você nasceu:");
            mes = Integer.parseInt(aux);
            if(mes>12 || mes<1){
                JOptionPane.showMessageDialog(null,"Você digitou um valor não suportado pelo sistema.");
            }
            else{
                x+=1;
            }
            }
            
            aux = JOptionPane.showInputDialog(null,"Digite o ano em que você nasceu:");
            ano = Integer.parseInt(aux);
            
            x=0;
            while(x==0){
            aux = JOptionPane.showInputDialog(null,"Digite o dia em que você está:");
            dd = Integer.parseInt(aux);
            if(dd>31 || dd<1){
                JOptionPane.showMessageDialog(null,"Você digitou um valor não suportado pelo sistema.");
            }
            else{
                x+=1;
            }
            }
        
            x=0;
            while(x==0){
            aux = JOptionPane.showInputDialog(null,"Digite o número equivalente do mês em que você está:");
            MM = Integer.parseInt(aux);
            if(MM>12 || MM<1){
                JOptionPane.showMessageDialog(null,"Você digitou um valor não suportado pelo sistema.");
            }
            else{
                x+=1;
            }
            }


            aux = JOptionPane.showInputDialog(null,"Digite o ano em que você está:");
            AAAA = Integer.parseInt(aux);

            /*Processo de Cálculo*/
            
                /*Anos de diferença*/
            DiaAnos = AAAA - ano;
            DiaAnos = DiaAnos * 365;
            
                /*Anos Bissextos*/
            x=0;
            aaaa = AAAA;
            while(x==0){
            bissexto = aaaa % 4;
            if(bissexto!=0){
                aaaa -= 1;
            }
            else{
                x=1;
            }
            bissexto = aaaa % 100;
            if(bissexto==0){
                aaaa -= 4;
            }
            }
            while(aaaa>ano){
                bissextos += 1;
                aaaa = aaaa - 4;
            }
            
                /*Dias de diferença*/
            if(dd>dia){
                dias = dd - dia;
            }
            else if(dia>dd){
                dias = 30 - dia;
                dias = dias + dd;
                mesesx=-1;
            }
            else if(dd==dia){
                dias=0;
            }
            if(mes==2){
                dias-=2;
            }
                /*Meses de diferença*/
            if(MM>mes){
                meses = MM - mes;
            }
            else if(mes>MM){
                meses = 12 - mes;
                meses = meses + MM;
            }
            else if(MM==mes){
                meses=0;
            }
            mesesx = mesesx + meses;
            mesesx = mesesx * 30;

                /*Meses com 31 dais*/
            x=mes;
            while(x<MM){
                if(x==1){
                    dias+=1;
                }
                if(x==3){
                    dias+=1;
                }
                if(x==5){
                    dias+=1;
                }
                if(x==7){
                    dias+=1;
                }
                if(x==8){
                    dias+=1;
                }
                if(x==10){
                    dias+=1;
                }
                if(x==12){
                    dias+=1;
                }
                x++;
            }
  
            DiaAnos = DiaAnos + bissextos + mesesx + dias;
            
            
            
            /*Resultado*/
            JOptionPane.showMessageDialog(null,"O ano de nascimento informado foi de: "+dia+"/"+mes+"/"+ano+"\nO total de dias vividos, até "+dd+"/"+MM+"/"+AAAA+", é de: "+DiaAnos);
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Obrigado por utilizar o programa");
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null,"Por favor, digitar somente números");
        }
    }  
}
