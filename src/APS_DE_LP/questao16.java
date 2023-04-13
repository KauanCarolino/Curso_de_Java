package APS_DE_LP;

/*16. Criar um programa que calcule a média dos números ímpares e o produto dos
números pares contidos em um intervalo fechado (com incrementos de uma unidade).
Os valores dos extremos desse intervalo são fornecidos pelo usuário. Primeiramente
o usuário informa o valor do extremo esquerdo do intervalo (a). A seguir, o programa
solicita o valor do extremo direito (b). O programa somente prossegue quando o valor
de b for maior que o valor de a. A seguir, um exemplo de execução do programa.*/

import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int numA = 0, numB = 0, produto, produtofinal = 1, controle = 0;

        System.out.println("Digite o limite inferior(a): ");
        numA = ler.nextInt();
        System.out.println("Digite o limite superior(b): ");
        numB = ler.nextInt();

        if(numA >= numB) {
            while(controle==0) {
                System.out.println("O VALOR DE B TEM QUE SER MAIOR QUE DE A:");
                System.out.println("Digite o limite superior(b): ");
                numB = ler.nextInt();
                if(numB>numA) {
                    controle =1;
                }
            }
        }
        int base=0;
        int somaimpares = 0;
        for(int i = (numB - numA) - 1; i<=numB; i++) {
            if(i%2 ==0) {
                produto = i;
                produtofinal = produto * produtofinal;
            }else {
                somaimpares = somaimpares + i;
                base++;
            }
        }
        System.out.println("Média dos impares: "+ somaimpares/base);
        System.out.println("Produto dos pares: " + produtofinal);
    }
}
