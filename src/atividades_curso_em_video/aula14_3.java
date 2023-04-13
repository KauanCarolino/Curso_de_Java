package atividades_curso_em_video;

//Colocando os números informados em ordem

import java.util.Arrays;
public class aula14_3 {
    public static void main(String[] args) {

        double num[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(num);
        for (double valor: num){
            System.out.println("Valor "+valor);
        }
    }
}
