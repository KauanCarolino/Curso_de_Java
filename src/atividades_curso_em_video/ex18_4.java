package atividades_curso_em_video;

//Preenchimento automático de um vetor

import java.util.Arrays;
public class ex18_4 {
    public static void main(String[] args) {

        int num[] = new int[20];

        Arrays.fill(num, 9);

        for (int valor: num) {
            System.out.println(valor+" ");
        }
    }
}
