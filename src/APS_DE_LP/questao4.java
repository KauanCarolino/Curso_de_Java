package APS_DE_LP;

/*4. Elabore um programa que, a partir da informação dos rendimentos brutos de um trabalhador, calcule a contribuição da previdência social (INSS) e o imposto de renda retido na fonte (IR)
deste trabalhador e apresente os dois resultados ao usuário. O algoritmo deve respeitar as tabelas para o ano-calendário de 2022. Verificar tabelas para o ano de 2022.
Segue abaixo um exemplo de tabela.*/

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        double salario, inss, ir;

        System.out.println("Informe o salario");
        salario = ent.nextDouble();

        if (salario <= 1212) {
            inss = salario - 0.075;
            System.out.println("o seu salario com INSS descontado é de: " +inss);
        } else if (salario >= 1212.1 || salario <= 2427.35) {
            inss = salario - 0.09;
            System.out.println("o seu salario com INSS descontado é de: " +inss);
        } else if (salario >= 2427.36 || salario <= 2427.36) {
            inss = salario - 0.12;
            System.out.println("o seu salario com INSS descontado é de: " +inss);
        } else if (salario >= 3641.04 || salario <= 7087.22) {
            inss = salario - 0.14;
            System.out.println("o seu salario com INSS descontado é de: " +inss);
        }

        if (salario <= 1903.98) {
            ir = (salario - 0);
            System.out.println("E você está isento do imposto de renda");
        } else if (salario >= 1903.99 || salario <= 2826.65) {
            ir = salario - 0.075;
            System.out.println("O seu salario com imposto de renda descontado é de: " + ir);
        } else if (salario >= 2826.66 || salario <= 3751.05) {
            ir = salario - 0.15;
            System.out.println("O seu salario com imposto de renda descontado é de: " + ir);
        } else if (salario >= 3751.06 || salario <= 4664.68) {
            ir = salario - 0.225;
            System.out.println("O seu salario com imposto de renda descontado é de: " + ir);
        } else if (salario > 4664.68){
            ir = salario - 0.277;
            System.out.println("O seu salario com imposto de renda descontado é de: " + ir);
        }
    }
}

