package APS_DE_LP;

/* 10. Escrever um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve
no semestre, em que cada prova vale 10 pontos. No final, o programa deve informar o nome
do aluno e a sua média (aritmética). O algoritmo deve ainda ter uma proteção contra a entrada
errônea de dados da seguinte maneira: se for digitada uma nota abaixo de zero ou acima de
dez, o programa deve gerar uma mensagem de erro dizendo "NOTA INVÁLIDA!" e parar de
executar o programa.
Dados de entrada: nome do aluno, três notas nas provas.
Dados de saída: média aritmética do aluno*/

import java.util.Scanner;
public class questao10 {
    public static void main (String [] args){
        Scanner tec = new Scanner (System.in);
        String nome_aluno;
        boolean flag = true;
        double nota = 0,media = 0;
        int cont = 0 ;
        System.out.println("Informe o nome do aluno:");
        nome_aluno = tec.nextLine();;
        System.out.println("O nome do aluno é: " + nome_aluno);
        while (flag && cont < 3){
            System.out.println("Informe a nota");
            nota = tec.nextDouble();
            if (nota < 0 || nota > 10){
                flag = false;
                System.out.println("nota inválida".toUpperCase());
            } else {
                cont ++;

            }
        }
        media = (nota + nota + nota) / 3 ;
        System.out.println("media " + media);
    }
}
