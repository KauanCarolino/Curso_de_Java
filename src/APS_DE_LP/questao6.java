package APS_DE_LP;

/* 6. O salário de um pedreiro de alvenaria (reboco) é calculado conforme sua produção
média diária, da seguinte maneira:
• Serviços em áreas até 40 m², o profissional recebe R$ 9,80 por m²;
• Serviços em áreas maiores que 40 m², o profissional recebe R$ 10,00 por m².
Considerando que um mês típico possui 22 dias úteis, desenvolva um programa utilizando
a linguagem Java que realize as tarefas listadas abaixo:
• Solicite e receba do usuário o total de reboco, em m², produzido em um mês de trabalho;
• Informe ao usuário a quantidade de dias úteis considerados para o mês, o valor da produção média diária do trabalhador, em m², e o valor da monetização atribuída àquela produção;
• Exiba o valor bruto a ser pago ao funcionário pelo seu trabalho.*/

import java.util.Scanner;
public class questao6 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        double reboco, media, x, salario;
        int dias = 22;

        System.out.println("Informe o número de reboco: ");
        reboco = ent.nextDouble();

        x = (reboco / dias);

        if (x <= 40){
            salario = (9.8 * reboco);
        } else {
            salario = (10 * reboco);
        }
        media = (salario / dias);
        System.out.println("Media Diária "+media);
        System.out.println("Valor Bruto "+salario);
    }
}
