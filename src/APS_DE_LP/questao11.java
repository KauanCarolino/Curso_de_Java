package APS_DE_LP;

/*11. Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um
 algoritmo que permita a entrada das seguintes informações: a) o número total de mercadorias
 no estoque; b) o valor de cada mercadoria. Ao final imprimir o valor total em estoque e a
 média de valor das mercadorias.*/

import java.util.Scanner;
public class questao11 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos em estoque:");
        int quantidadeProdutos = 0;
        float total = 0;
        quantidadeProdutos = ent.nextInt();
        Object[][] listaProdutos = new Object[quantidadeProdutos][2];
        for(int i = 0; i < quantidadeProdutos; i++){
            System.out.println("Digite o nome do produtos:");
            listaProdutos[i][0] = (String) ent.next();
            System.out.println("Digite o preço do produtos:");
            listaProdutos[i][1] = ent.nextFloat();
            total = total + (float) listaProdutos[i][1];
        }
        for(int i=0;i< quantidadeProdutos;i++){
            System.out.println("Produto "+listaProdutos[i][0]+" o valor é:"+listaProdutos[i][1]);
        }
        float media = (float) total / (float)quantidadeProdutos;
        System.out.println("Valor total do estoque: "+total+" e media de valor é: "+media);
    }
}

