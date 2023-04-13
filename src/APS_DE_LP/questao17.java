package APS_DE_LP;

/*17. Um hotel cobra R$ 300,00 por diária e mais uma taxa adicional de serviços. Se o número de
diárias for menor que 15 a taxa ´e de R$ 20,00. Se o número de diárias for igual a 15 a taxa ´e
de R$ 14,00 e se o número for maior que 15 a taxa ´e de R$ 12,00. Elabore um programa que
receba o número do quarto e o número de dias que um determinado hospede ficou no hotel
e, calcule e imprima o total a pagar desse hospede.*/

import java.util.Scanner;
public class questao17 {
    public static void main (String [] args){
        Scanner ent = new Scanner (System.in);

        int num_quarto, numero_de_diarias, taxa_de_servico, diaria;

        System.out.println("Qual o número do seu quarto ?");
        num_quarto = ent.nextInt();
        System.out.println("O número do seu quarto é: " +num_quarto  + "\n" );

        System.out.println("Informe a quantidade de dias que ficou no hotel: ");
        numero_de_diarias= ent.nextInt();

        if (numero_de_diarias < 15) {
            taxa_de_servico = 20;
            System.out.println("A sua conta é de: " + numero_de_diarias * (300 + taxa_de_servico) + " reais");
        } else if ( numero_de_diarias == 15) {
            taxa_de_servico = 14;
            System.out.println("A sua conta é de: " + numero_de_diarias * (300 + taxa_de_servico) + " reais");
        } else if (numero_de_diarias > 15) {
            taxa_de_servico = 12;
            System.out.println("A sua conta é de: " + numero_de_diarias * (300 + taxa_de_servico) + " reais");
        }
    }
}



