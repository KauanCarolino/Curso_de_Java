package logicaprogramacao;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int cod, quant;
        double valor;


        System.out.println("MERCADINHO DO KAUAN");
        System.out.println("[1001] -> Cenoura o kg");
        System.out.println("[1324] -> Pão o kg");
        System.out.println("[6548] -> Arroz o kg");
        System.out.println("[5842] -> Batata o kg");

        System.out.println("Qual o código do Produto? ");
        cod = ent.nextInt();
        System.out.println("Qual a quantidade comprada? ");
        quant = ent.nextInt();



        switch(cod) {
            case 1001:
                valor = (quant * 5.32);
                System.out.println("O valor total é de "+valor);
                break;
            case 1324:
                valor = (quant * 6.45);
                System.out.println("O valor total é de "+valor);
                break;
            case 6548:
                valor = (quant * 2.37);
                System.out.println("O valor total é de "+valor);
                break;
            case 5842:
                valor = (quant * 8.55);
                System.out.println("O valor total é de "+valor);
                break;
            default:
                valor = 0;
                System.out.println("Produto não identificado");
        }
    }
}
