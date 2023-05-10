package logicaprogramacao;
import java.util.Scanner;
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

/* Crie um programa que simule o comportamento de um semáforo. O usuário deverá inserir um número
* correspondente à cor do semáforo (1 para vermelho, 2 para amarelo, 3 para verde), e o programa deve
* imprimir uma mensagem indicando qual a ação que deve ser tomada com base na cor selecionada.*/

/*Para isso, utilize estruturas de controle de fluxo, como a instrução if-else if para tomar decisões
com base no valor de entrada do usuário.*/
public class ex025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        //TODO: Crie as condições necessárias para imprimir cada uma das possíveis saídas.

        if(numero == 1){
            System.out.println("Pare! O sinal esta vermelho.");
        }else if(numero == 2){
            System.out.println("Atencao! O sinal esta amarelo.");
        }else if(numero == 3){
            System.out.println("Siga em frente! O sinal esta verde.");
        }else{
            System.out.println("Valor invalido! Digite 1, 2 ou 3 para indicar a cor do semafaro.");
        }
    }
}