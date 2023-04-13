package APS_DE_LP;


/*12. O mesmo exercício anterior, mas agora não será informado o número de mercadorias em
estoque. Então o funcionamento deverá ser da seguinte forma: ler o valor da mercadoria e
perguntar ‘MAIS MERCADORIAS (S/N)?’. Ao final, imprimir o valor total em estoque e a média
de valor das mercadorias em estoque.*/

import java.util.Scanner;
public class questao12 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num_mercadoria = 0;
        char resp;
        double valor_mercadoria, media = 0, total_estoque = 0;

        do {
            System.out.println("Qual o valor da Mercadoria? ");
            valor_mercadoria = ent.nextDouble();

            total_estoque = total_estoque + valor_mercadoria;
            num_mercadoria = num_mercadoria + 1;
            System.out.println("Mais mercadoria? (S/N)");
            resp = ent.next().charAt(0);

        }while(resp == 'S' || resp == 's');

        media = total_estoque / num_mercadoria;

        System.out.println("A média do valor por mercadoria em estoque é de: "+media);
        System.out.println("O valor total em estoque é de R$ "+total_estoque);
    }
}

