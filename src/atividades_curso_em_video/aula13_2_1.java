package atividades_curso_em_video;

/*Faça um programa que pergunte um número e em seguida pergunte se o usuário quer continuar
e ao final do código, deve-se mostrar o somatório de todos os números informados.*/

import java.util.Scanner;
public class aula13_2_1 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        char resp;
        int num, s = 0;

        do {
            System.out.println("Digite um número: ");
            num = ent.nextInt();

            s += num; //Ou s = s + n

            System.out.println("Quer continuar? (S/N)");
            resp = ent.next().toLowerCase().charAt(0);

        }while (resp == 's');
        System.out.println("A soma de todos os valores é "+s);
    }
}
