package atividades_curso_em_video;

//Busca de uma variável

import java.util.Arrays;
public class aula14_2 {
    public static void main(String[] args) {

        int vetor[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v:vetor){
            System.out.println(v+" ");
        }
        int pos = Arrays.binarySearch(vetor, 1);
        System.out.println("Encontrei o valor na posicao "+ pos);
    }
}
