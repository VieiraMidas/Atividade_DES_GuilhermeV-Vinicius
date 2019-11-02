package PacoteAtividade02;

import javax.swing.*;

public class Atividade02 {

    public static void main(String[] args) {
        try {
            String aux;
            int i, reprovado = 0, exame = 0, aprovado = 0;
            double nota1, nota2, media, mediaGeral = 0;

            for (i = 0; i < 6; i++) {
                aux = JOptionPane.showInputDialog(null, "Digite a primeira nota do aluno: ");
                aux = aux.replace(",", ".");
                nota1 = Double.parseDouble(aux);

                aux = JOptionPane.showInputDialog(null, "Digite a segunda nora do aluno: ");
                aux = aux.replace(",", ".");
                nota2 = Double.parseDouble(aux);

                media = nota1 + nota2;
                media = media / 2;

                if (media < 3) {
                    reprovado++;
                }
                else if(media >= 3 && media<=7){
                    exame++;
                }
                else{
                    aprovado++;
                }

                JOptionPane.showMessageDialog(null, "A média do aluno é de: " + media);

                mediaGeral += media;
            }
            JOptionPane.showMessageDialog(null, "Sabendo que:\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n"
                    + "| Média Aritmética        | Mensagem       |\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n"
                    + "| Abaixo de 3,0              | Reprovado        |\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n"
                    + "| De 3,0 a 7,0                 | Exame                |\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n"
                    + "| Acima de 7,0               | Aprovado          |\n");

            mediaGeral = mediaGeral / 6;
            
            JOptionPane.showMessageDialog(null,"O total de pessoas reprovadas foram de: "+reprovado+"\nO total de pessoas em exame são de: "+exame+"\nO total de pessoas aprovadas foram de: "+aprovado);
            JOptionPane.showMessageDialog(null, "A média da sala é de: " + mediaGeral);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, digite somente números");
            System.exit(0);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Muito obrigado por utilizar o programa.");
        }
    }
}
