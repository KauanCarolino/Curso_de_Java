package APS_DE_LP;

/* 9. Efetuar a leitura de 4 valores inteiros e exibir na tela o menor e o maior deles */

import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n= 0,maior = 0, menor = 0, n1, n2, n3, n4;

        System.out.println("Digite o primeiro numero: ");
        n1 = ent.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = ent.nextInt();
        System.out.println("Digite o terceiro numero: ");
        n3 = ent.nextInt();
        System.out.println("Digite o quarto numero: ");
        n4 = ent.nextInt();

        if(n4>n3 && n4>n2 && n4>n1){
            maior = n4;
        } else if(n3>n4 && n3>n2 && n3>n1){
            maior = n3;
        } else if(n2>n4 && n2>n3 && n2>1){
            maior = n2;
        } else if (n1>n2 && n1>n3 && n1>n4){
            maior = n1;
        }

        if(n4 < n3 && n4 < n2 && n4 < n1){
            menor = n4;
        } else if(n < n4 && n3 < n2 && n3 < n1){
            menor = n3;
        } else if(n2 < n4 && n2 < n3 && n2 < n1){
            menor = n2;
        } else if (n1 < n2 && n1 < n3 && n1 < n4){
            menor = n1;
        }
        System.out.println("O maior valor é " + maior + " O menor valor é " + menor);
    }
}
