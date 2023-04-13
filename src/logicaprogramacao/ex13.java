package logicaprogramacao;

/*
Crie um programa que lê o conceito de um aluno na disciplina LP
(Lógica da Programação) e imprime seu significado, de acordo com a
tabela abaixo. Caso seja informado um conceito inexistente, deve ser
exibida uma mensagem de erro.
A - Excelente
B - Ótimo
C - Bom
D - Regular
E - Ruim
F - Nos vemos de novo ano que vem...
*/
import java.util.Scanner;
public class ex13 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        char conceito;
        String nome;

        System.out.println("Qual o nome do aluno:");
        nome = ent.nextLine().toUpperCase();
        System.out.println("Informe o Conceito do Aluno: ");
        conceito = ent.nextLine().toUpperCase().charAt(0);

        switch (conceito) {
            case 'A':
                System.out.println(nome);
                System.out.println("Um Excelente aluno!");
            break;
            case 'B':
                System.out.println(nome);
                System.out.println("Um Ótimo aluno");
            break;
            case 'C':
                System.out.println(nome);
                System.out.println("Um Bom aluno!");
            break;
            case 'D':
                System.out.println(nome);
                System.out.println("Um aluno Regular!");
            break;
            case 'E':
                System.out.println(nome);
                System.out.println("Um aluno Ruim!");
            break;
            case 'F':
                System.out.println(nome);
                System.out.println("Nos vemos de novo ano que vem...");
            break;
            default:
                System.out.println("[ERRO!]");
        }
    }
}
