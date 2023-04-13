package APS_DE_LP;

/*18. Fazer um programa que verifique se um dado ano é ou não bissexto. Considere que:
• Anos divisíveis pelo número 4 são considerados bissextos.
• Anos divisíveis por 100 não são bissextos.
• Anos divisíveis por 400 são bissextos.*/

import java.util.Scanner;
public class questao18 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int ano;

        System.out.println("Informe um ano");
        ano =input.nextInt();

        if((ano % 400 == 0)|| (ano % 4 ==0 && ano % 100 !=0)){
            System.out.println("Ano bissexto!");
        } else {
            System.out.println("Ano não é bissexto!");
        }
    }
}