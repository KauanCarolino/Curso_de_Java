package logicaprogramacao;
import java.util.Scanner;

//Escreva um código que leia um numero e mostre a sua tabuada.
//Estrutura for
public class ex14 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int num;

        System.out.println("Digite um número: ");
        num = ent.nextInt();

        System.out.println("--------------------------");
        for (int i = 0; i <= 10; i++){
            System.out.println(num+" * "+i+" = "+(i*num));
        }
        System.out.println("--------------------------");
    }
}
