package logicaprogramacao;

/*Como sabemos para calcular o fatorial de algum número basta
multiplicarmos ele pelo número anterior regressivamente até
1, ou seja,seria algo como 5 × 4 × 3 × 2 × 1.
 Variável inicial: ler do teclado;
 Condição: o loop irá executa até que a variável já maior que 1
 Modificador: variável irá decrementar -1 a cada repetição.*/

import java.util.Scanner;

public class ex020 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        int fator, resultado = 1;

        System.out.println("Escolha um número para o Fator: ");
        fator = ent.nextInt();

        for(int i = fator; i > 1; i--){
            resultado *= i;
        }
        System.out.println("O fatorial do número "+fator+" é igual a "+resultado);
    }
}
