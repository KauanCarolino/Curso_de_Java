package logicaprogramacao;

//Faça um programa que leia duas notas de um aluno e cálcule a sua média.
//E mostre se ele ficou ou não de recuperação.
//Sendo que a nota >= 7 Aprovado e == 6 Em análise e < 6 Reprovado.

import java.util.Scanner;
public class ex01 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        float nota1, nota2, media;
        String name;

        System.out.println("****Calculador de Média****");
        System.out.println("  ");
        System.out.println("Informe o nome do aluno: ");
        name = ent.nextLine();
        System.out.println("Informe a primeira nota do aluno: ");
        nota1 = ent.nextFloat();
        System.out.println("Informe a segunda nota do aluno: ");
        nota2 = ent.nextFloat();

        media = (nota1 + nota2) / 2;

        System.out.println("Sua média é do aluno "+name+" foi de "+media);

        if (media >= 7) {
            System.out.println("O aluno "+name+" está APROVADO!");
        }else {
            if (media == 6) {
                System.out.println("O aluno "+name+" está EM ANÁLISE!");
            }else {
                System.out.println("O aluno "+name+" está REPROVADO!");
            }
        }
    }
}
