package logicaprogramacao;

/*Crie um código que nos fornece um menu de opções
 Sair
 Somar
 Subtrair
 Multiplicar
 Dividir
 Para cada opção haverá uma determinada ação
correspondente e Termine o programa da aula, calculando a
soma, subtração, multiplicação e a divisão de
dois números informados pelo usuário.*/

import java.util.Scanner;
public class ex021 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int opcao = 1;
        double num1 = 0, num2 = 0, res = 0;

        while((opcao != 0) && (opcao <= 4)){ //Vai continuar repetindo até a resposta ser 0 ou maior que 4
            System.out.println("--------------------------");
            System.out.println("[0] Sair");
            System.out.println("[1] Somar");
            System.out.println("[2] Subtrair");
            System.out.println("[3] Multiplicar");
            System.out.println("[4] Dividir");
            System.out.println("--------------------------");

            System.out.println("Qual opcao? ");
            opcao = ent.nextInt();

            System.out.println("Digite o primeiro numero: ");
            num1 = ent.nextDouble();

            System.out.println("Digite o segundo numero: ");
            num2 = ent.nextDouble();

            if (opcao == 1){
                res = (num1 + num2);
                System.out.println("A soma de "+num1+" + "+num2+" = "+res);
            } else if (opcao == 2){
                res = (num1 - num2);
                System.out.println("A subtracao de "+num1+" - "+num2+" = "+res);
            } else if (opcao == 3) {
                res = (num1 * num2);
                System.out.println("A multiplicao de "+num1+" * "+num2+" = "+res);
            } else if (opcao == 4) {
                res = (num1 / num2);
                System.out.println("A divisao de "+num1+" / "+num2+" = "+res);
            }
        }
    }
}
