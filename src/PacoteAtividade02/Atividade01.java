package PacoteAtividade02;

public class Atividade01 {
    
    public static void main(String[] args) {
        
        int i,x,resultado;
        
        
        for(i=0;i<11;i++){
            
            for(x=1;x<6;x++){
                System.out.print("| "+x+" X "+i+" = "+i*x);
                if(i*x<10){
                    System.out.print("  ");
                }else{
                    System.out.print(" ");
                }
                if(i<10){
                    System.out.print(" |");
                }else{
                    System.out.print("|");
                }
            }
            System.out.println("");
        }
        for(i=0;i<11;i++){
            
            for(x=6;x<11;x++){
                System.out.print("| "+x+" X "+i+" = "+i*x);
                if(i*x<10){
                    System.out.print("  ");
                }else{
                    System.out.print(" ");
                }
                if(i<10){
                    System.out.print(" |");
                }else{
                    System.out.print("|");
                }
            }
            System.out.println("");
        }

    }
    
}
