package logicaprogramacao;
import java.util.Scanner;
public class ex027 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um valor inteiro da posicao "+ i);
            vetorA[i] = ent.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }

        System.out.println("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.println(vetorA[i]+ " ");
        }

        System.out.println(" ");

        System.out.println("Vetor B = ");
        for(int i = 0; i < vetorB.length; i++){
            System.out.println(vetorB[i]+ " ");
        }
    }
}
