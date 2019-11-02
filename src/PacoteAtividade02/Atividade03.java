package PacoteAtividade02;

import javax.swing.*;

public class Atividade03 {

    public static void main(String[] args) {

        String aux;
        double altura, maiorAltura = 0, menorAltura = 1000, mulherMedia = 0;
        int i, sexo = 0, x = 0, idade, idadeMulher = 1000, idadeHomem = 0;

        try {
            for (i = 0; i < 50; i++) {
                /*Definição do sexo*/
                while (x == 0) {
                    aux = JOptionPane.showInputDialog(null, "Primeiramente, defina de que sexo é essa pessoa, sendo:\n0 - Homem\n1 - Mulher");
                    sexo = Integer.parseInt(aux);
                    if (sexo == 1 || sexo == 0) {
                        x = 1;
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor não suportado, por favor digite o que é requerido");
                    }
                }
                x = 0;

                /*Definição da altura*/
                aux = JOptionPane.showInputDialog(null, "Qual a altura dessa pessoa: ");
                aux = aux.replace(",", ".");
                altura = Double.parseDouble(aux);

                /*Definiçaõ da idade*/
                aux = JOptionPane.showInputDialog(null, "Qual a idade dessa pessoa: ");
                idade = Integer.parseInt(aux);

                /*Maior altura*/
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                }
                /*Menor altura*/
                if (altura < menorAltura) {
                    menorAltura = altura;
                }

                /*Mulheres*/
                if (sexo == 1) {
                    /*Média de altura*/
                    mulherMedia = mulherMedia + altura;
                    mulherMedia = mulherMedia / 2;

                    /*Menor idade*/
                    if (idade < idadeMulher) {
                        idadeMulher = idade;
                    }
                }

                /*Homens*/
                if (sexo == 0) {
                    /*Maior idade*/
                    if (idade > idadeHomem) {
                        idadeHomem = idade;
                    }
                }
            }
            /*Resultado*/
            JOptionPane.showMessageDialog(null, "A maior altura digitada foi de: " + maiorAltura + "\nA menor altura digitada foi de: " + menorAltura + "\nA altura média das mulheres foi de: " + mulherMedia + "\nO homem mais velho digitado foi de: " + idadeHomem + "\nA mulher mais nova digitada foi de: " + idadeMulher);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, digite somente números");
            System.exit(0);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar o sistema.");
        }
    }

}
