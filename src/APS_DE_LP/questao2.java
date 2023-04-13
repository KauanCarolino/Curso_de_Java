package APS_DE_LP;

/* 2. Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço. O
monge, necessitando de alimentos , indagou à rainha sobre o pagamento, se poderia ser feito
com grãos de trigo dispostos em um tabuleiro de xadrez, de tal forma que o primeiro quadro
deveria conter apenas um grão e os quadros subsequentes , o dobro do quadro anterior. A
rainha achou o trabalho barato e pediu que o serviço fosse executado, sem se dar conta de
que seria impossível efetuar o pagamento. Faça um algoritmo para calcular o número de grãos
que o monge esperava receber.*/

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double graos_casa=1, casas_tabuleiro=64;
        int graos=1;

        for(int x = 1; x < casas_tabuleiro; x++){
            graos_casa = graos_casa * 2;
            graos += graos_casa;
        }

        System.out.println("O quantidade de grãos é: "+graos);

    }
}
