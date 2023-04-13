package logicaprogramacao;

/*Crie uma variável chamada “fruta”. Esta variável deve receber uma string com
o nome de uma fruta. Após, crie uma estrutura condicional switch que receba
esta variável e que possua três casos:

caso maçã, retorne no console: “Não vendemos esta fruta aqui”.
Caso kiwi, retorne: “Estamos com escassez de kiwis” e
caso melancia, retorne: “Aqui está, são 3 reais o quilo”.
Teste com estas três opções e verifique a resposta.
Crie também um default, que retornará uma mensagem de erro no console.
*/
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        String fruta;

        System.out.println("Digite o nome da Fruta: ");
        fruta = ent.nextLine().toLowerCase();

        switch (fruta) {
            case "maçã":
                System.out.println("Maçã?");
                System.out.println("Não vendemos essa fruta aqui.");
            case "kiwi":
                System.out.println("Kiwi?");
                System.out.println("Estamos com escassez de Kiwis");
            case "melancia":
                System.out.println("Melancia?");
                System.out.println("Aqui está, são 3 reais o kilo");
            default:
                System.out.println("[ERRO!]");
        }
    }
}
