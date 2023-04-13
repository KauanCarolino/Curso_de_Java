package logicaprogramacao;

import java.util.Scanner;
//Ler a nota. N >= 6 e numero de faltas < 25% do numero de faltas
// E/and -> &&
public class ex03 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int aula, nota, f;

        System.out.println("Digite a nota: ");
        nota = ent.nextInt();
        System.out.println("Digite o numero de faltas: ");
        f = ent.nextInt();
        System.out.println("Digite o numero de aulas: ");
        aula = ent.nextInt();

        // && -> And / || -> Or
        if ((nota >= 6) && (f < (0.25 * aula))) {
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
    }
}