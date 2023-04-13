package APS_DE_LP;

/*19. Faça um programa que o dia, o mês e o ano em formato numérico e escreva a data por
extenso, conforme exemplo:
Digite o dia: 10
Digite o mês: 2
Digite o ano: 1999
Data: 10 de fevereiro de 1999
O programa deve imprimir uma mensagem se o mês for inválido (não é necessário verificar o dia).
Utilize o comando switch na implementação.*/

import java.util.Scanner;
public class questao19 {
    public static void main(String[] args) {
        int ano, dia, mes;

        Scanner ent = new Scanner(System.in);
        System.out.println("digite o dia: ");
        dia = ent.nextInt();
        System.out.println("digite o mês: ");
        mes = ent.nextInt();
        System.out.println("digite o ano: ");
        ano = ent.nextInt();
        switch (mes) {
            case 1 :
                mes = 1;
                System.out.println("Data: " +dia+" de "+"janeiro"+" de " + ano );
                break;
            case 2 :
                mes =2 ;
                System.out.println("Data: " +dia+" de "+"fevereiro"+" de " + ano );
                break;
            case  3:
                mes = 3;
                System.out.println("Data: " +dia+" de "+"maio"+" de " + ano );
                break;
            case 4:
                mes = 4;
                System.out.println("Data: " +dia+" de "+"junho"+" de " + ano );
                break;
            case 5 :
                mes =5;
                System.out.println("Data: " +dia+" de "+"julho"+" de " + ano );
                break;
            case 6 :
                mes = 6;
                System.out.println("Data: " + dia + " de " + " julho " + " de " + ano );
                break;
            case 7 :
                mes = 7;
                System.out.println("Data: " +dia+" de "+"julho"+" de " + ano );
                break;
            case 8 :
                mes = 8;
                System.out.println("Data: " +dia+" de "+"agosto"+" de " + ano );
                break;
            case 9 :
                mes = 9;
                System.out.println("Data: " +dia+" de "+"setembro"+" de " + ano );
                break;
            case 10:
                System.out.println("Data: " +dia+" de "+"outubro"+" de " + ano );
                break;
            case 11:
                System.out.println("Data: " +dia+" de "+"novembro"+" de " + ano );
                break;
            case 12:
                System.out.println("Data: " +dia+" de "+"dezembro"+" de " + ano );
                break;
            default:
                System.out.println("Mês inválido".toUpperCase());
        }
    }
}