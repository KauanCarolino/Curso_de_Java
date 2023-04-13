package logicaprogramacao;

import java.util.Scanner;

import java.util.Scanner;
public class ex024 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int op;
        double res, num1, num2;

        System.out.println("[1] Soma");
        System.out.println("[2] Subtracao");
        System.out.println("[3] Multiplicacao");
        System.out.println("[4] Divisao");
        System.out.println("[5] Sair");

        System.out.println("Qual operacao voce quer fazer? ");
        op = ent.nextInt();
        System.out.println("Escolha um numero: ");
        num1 = ent.nextDouble();
        System.out.println("Escolha outro numero: ");
        num2 = ent.nextDouble();

        switch (op){
            case 1:
                res = (num1 + num2);
                System.out.println(num1+" + "+num2+" = "+ res);
            break;
            case 2:
                res = (num1 - num2);
                System.out.println(num1+" - "+num2+" = "+ res);
            break;
            case 3:
                res = (num1 * num2);
                System.out.println(num1+" * "+num2+" = "+ res);
            break;
            case 4:
                res = (num1 / num2);
                System.out.println(num1+" / "+num2+" = "+ res);
            break;
            case 5:
                System.out.println("Adeus");
            break;
            default:
                System.out.println("ERRO, opcao inválida");
            break;
        }
    }
}
