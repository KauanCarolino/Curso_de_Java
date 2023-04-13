package logicaprogramacao;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        int num, res;

        System.out.println("Digite um valor inteiro: ");
        num = ent.nextInt();

        res = (num%2);

        if (res == 0){
            System.out.println("O numero "+num+" é PAR");
        } else
            System.out.println("O numero "+num+" é IMPAR");
    }
}
