package APS_DE_LP;

/* 8. Escrever um algoritmo que lê 2 números reais. A seguir, é apresentado, para o usuário, o menu
a seguir:
Operações Disponíveis:
1. Adição
2. Subtração
3. Multiplicação
4. Divisão
9. Sair do Programa
Digite o número de ordem da opção desejada:
Se a opção for 1, o algoritmo deve somar os dois valores lidos; se for 2, o algoritmo deve fazer o
primeiro valor menos o segundo; se for 3, o algoritmo deve multiplicar os valores lidos; se for 4, o
algoritmo deve dividir o primeiro pelo segundo valor lido, desde que este não seja zero (o algoritmo
deve ter tratamento especial para este caso). O algoritmo deve escrever o resultado da operação
escolhida. Se o usuário digitar 9, o algoritmo deve ser encerrado. Enquanto o valor da opção 9 não for
digitado, o menu deve ser apresentado novamente.*/

import java.util.Scanner;
public class questao8 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int resp;
        float adi, sub, mult, div = 0, num1, num2;

        System.out.println("Digite o Primeiro número: ");
        num1 = ent.nextFloat();
        System.out.println("Digite o Segundo número: ");
        num2 = ent.nextFloat();

        System.out.println("ESCOLHA UMA OPERAÇÃO");
        System.out.println("[1] Adição");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        System.out.println("[9] Para sair");

        System.out.println("Qual operação deseja escolher? ");
        resp = ent.nextInt();

        while (resp == 6 || resp == 7 || resp == 8 || resp >= 10){
            System.out.println("ESCOLHA UMA OPERAÇÃO");
            System.out.println("[1] Adição");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            System.out.println("[9] Para sair");

            System.out.println("Qual operação deseja escolher? ");
            resp = ent.nextInt();
        }

        if (resp == 1) {
            adi = (int) (num1 + num2);
            System.out.printf("A soma de "+num1+" + "+num2+" = "+adi);
        } else if (resp == 2) {
            sub = (num1 - num2);
            System.out.println("A subtração de "+num1+" - "+num2+" = "+sub);
        } else if (resp == 3) {
            mult = (num1 * num2);
            System.out.println("A multiplicação de "+num1+" * "+num2+" = "+mult);
        } else if (resp == 4 && num1 == 0 || num2 == 0) {
            System.out.println("ERRO! Impossível Dividir");
        } else if (resp == 4) {
            div = (num1 / num2);
            System.out.println("A divisão de "+num1+" / "+num2+" = "+div);
        } else if (resp == 9) {
            System.out.println("Fim do Programa");
        }
    }
}
