package atividades_curso_em_video;

public class aula14 {
    public static void main(String[] args){
        /*
        int[] n  = new int[5];
        n[0] = 3;
        n[1] = 2;
        n[2] = 8;
        n[3] = 7;
        n[4] = 5;
        n[4] = 4;*/
        //Ou
        int [] n = {3,2,8,7,5,4};

        System.out.println("A quantidade de casas de n é "+n.length+" casas");
        System.out.println(" ");
        for (int c = 0; c <= 5; c++){
            System.out.println("na posicao "+c+" temos o valor "+n[c]);
        }
    }
}