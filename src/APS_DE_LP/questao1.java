package APS_DE_LP;

/*1. A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
suspenderem suas atividades, se o índice crescer para 0,4 as indústrias do 1º e 2º grupo são
intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades. Faça um diagrama de bloco que leia o índice de
poluição medido e emita a notificação adequada aos diferentes grupos de empresas.*/

import java.util.Scanner ;

public class questao1 {

    public static void main (String [] args){
        double ind_pol;
        Scanner ent = new Scanner (System.in);
        System.out.println("Industrias 1, 2 e 3 informem a quantidade de poluição");
        ind_pol = ent.nextDouble();
        if (ind_pol == 0.3){
            System.out.println("nivel de poluição alto, industria 1 suspendam as atividades imediatamente");
        } else if (ind_pol == 0.4) {
            System.out.println("nivel de poluição alto, industria 1 e 2 suspendam as atividades imediatamente");
        } else if (ind_pol == 0.5) {
            System.out.println("nivel de poluição alto, todas as industrias suspendam as atividades imediatamente");
        } else {
            System.out.println("o nivel de poluição informado está dentro do limite aceitável");
        }
    }
}
