package APS_DE_LP;

/*14. Elaborar um algoritmo que lê um conjunto de 30 valores e os coloca em 2 vetores conforme
forem pares ou ímpares. Terminada a entrada dos números escrever o conteúdo dos dois vetores*/

import java.util.*;

public class questao14 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int num, recebePar, recebeImpar, a = 0, b = 0, i =0;
        int [] acumulador  = new int[30];
        int [] Impar = new int[30];
        int [] Par = new int[30];


        do {
            System.out.println("Digite os números: ");
            num = ent.nextInt();
            i++;

            if (num % 2 == 0){
                recebePar = num;
                Par[a] = recebePar;
                System.out.println("Esse numero: "+ Par[a] + " É par \n");
                a++;
            }
            else {
                recebeImpar = num;
                Impar[b] = recebeImpar;
                System.out.println("Esse numero: "+ Impar[b] + " É impar \n");
                b++;
            }
        }
        while (i < 30);
    }
}
