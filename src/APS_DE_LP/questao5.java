package APS_DE_LP;

/*5. Fazer um programa para ler quanto a pessoa obteve de renda anual com
salário, prestação de serviço e ganho de capital. Leia também quando a
pessoa teve de gastos médicos e educacionais no ano. Seu programa deverá
então produzir um relatório de imposto de renda dessa pessoa conforme exemplos.
Considere a renda mensal com salário como sendo a renda anual dividida por 12.*/

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        double salMensal, salAnual, servAnual, capAnual, medGast, eduGast;
        double impSal, impServ, impCap, maxDedutivel, gastDedutivel;
        double    impBruTotal, impostoDevido;

        System.out.println("Renda anual com salário: ");
        salAnual = ent.nextDouble();
        System.out.println("Renda anual com pretação de serviço: ");
        servAnual = ent.nextDouble();
        System.out.println("Renda anual com gasto de capital: ");
        capAnual = ent.nextDouble();
        System.out.println("gastos médicos: ");
        medGast = ent.nextDouble();
        System.out.println("Gastos educacionais: ");
        eduGast = ent.nextDouble();

        salMensal = (salAnual / 12);

        if (salMensal <= 3000) {
            impSal = 0.00;
        } else {
            if (salMensal <= 5000) {
                impSal = (salAnual * 10) / 100;
            } else {
                impSal = (salAnual * 20) / 100;
            }
        }

        impServ = (servAnual * 15) / 100;
        impCap = (capAnual * 20) / 100;
        impBruTotal = impSal + impServ + impCap;
        maxDedutivel = (impBruTotal * 30) / 100;
        gastDedutivel = medGast + eduGast;

        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");

        System.out.println(" ");

        System.out.println("CONSOLIDADO DE RENDA");
        System.out.println("Imposto sobre salário "+impSal);
        System.out.println("imposto sobre serviços "+impServ);
        System.out.println("Imposto sobre ganho de capital "+impCap);

        System.out.println(" ");

        System.out.println("DEDUÇÕES");
        System.out.println("Máximo dedutível: "+maxDedutivel);
        System.out.println("Gastos dedutíveis: "+gastDedutivel);

        System.out.println(" ");

        System.out.println("RESUMO");
        System.out.println("Imposto bruto total: "+impBruTotal);

        if (maxDedutivel < gastDedutivel) {
            impostoDevido = impBruTotal - maxDedutivel;
            System.out.println("Abatimento: "+gastDedutivel);
        } else {
            impostoDevido = impBruTotal - gastDedutivel;
            System.out.println("Abatimento: "+gastDedutivel);
        }
        System.out.println("Imposto devido: "+impostoDevido);
    }
}