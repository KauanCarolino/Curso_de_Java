package APS_DE_LP;


/*13. Elabore um algoritmo que construa um vetor de 50 elementos, tal que o valor de cada
elemento seja o dobro do índice de sua posição no vetor.*/

public class questao13 {
    public static void main(String[] args) {
        int [] num = new int [50];
        for (int i = 0 ; i < num.length; i ++ ){
            System.out.println("O vetor " + i + " * 2 " + " = " + i *2);
        }
    }
}

