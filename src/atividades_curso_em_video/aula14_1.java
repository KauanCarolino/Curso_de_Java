package atividades_curso_em_video;

//Esse programa vai mostrar os meses e seu total de dias

import java.util.Scanner;
public class aula14_1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, ano;

        System.out.println("Digite o ano atual: ");
        ano = ent.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            dias[1] = 29;
        }
            for (int i = 0; i < mes.length; i++) {
                System.out.println("O mes de " + mes[i] + " tem " + dias[i] + " dias no total");
        }
    }
}