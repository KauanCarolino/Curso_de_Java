package APS_DE_LP;

/*15. Uma certa firma fez uma pesquisa de mercado para saber se as pessoas gostaram ou não de
um novo produto lançado por eles. Para isso, forneceu o sexo do entrevistado e sua resposta
(sim ou não). Sabendo-se que foram entrevistadas 2.000 pessoas, elabore um algoritmo que
calcule e imprima: a. O número de pessoas que responderam sim; b. O número de pessoas
que responderam não; c. A porcentagem de pessoas do sexo feminino que responderam sim;
d. A porcentagem de pessoas do sexo masculino que responderam não.*/

import java.util.Scanner;
public class questao15 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int i, cont1 = 0, cont2 = 0, soma1 = 0, soma2 = 0;
        char sexo, resp;
        float porH, porF;

        for (i = 1; i <= 15; i++){

            System.out.println("Digite o sexo da pessoa: ");
            sexo = ent.next().toLowerCase().charAt(0);

            System.out.println("Digite a sua resposta: ");
            resp = ent.next().toLowerCase().charAt(0);

            if (resp == 's') {
                cont1++;
                if (sexo == 'f') soma1++;
            } else {
                cont2++;
                if (sexo == 'm') soma2++;
            }
        }
        porF = (float)(soma1 * 100) / (cont1 + cont2);
        porH = (float) (soma2 * 100) / (cont1 + cont2);
        System.out.printf("O número de pessoas que responderam sim é %d\n", cont1);
        System.out.printf("O número de pessoas que responderam não é %d\n", cont2);
        System.out.printf("A porcentagem de pessoas do sexo feminino que responderam sim é %.2f\n", porF);
        System.out.printf("A porcentagem de pessoas do sexo masculino que responderam não é %.2f\n", porH);
    }
}

