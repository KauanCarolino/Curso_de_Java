package logicaprogramacao;
/*Crie um programa que estrutura uma repetição que conte de 0 a 10 usando, while, do while e for*/
public class ex028 {
    public static void main(String[] args){
        int i = 0;
        int max = 10; //cont ou count

        System.out.println("Contando ate "+max);

        while(i <= max){ //No while ele primeiro avalia a expressão e se a expressão for verdadeira ele executa o bloco de cpodigo
            System.out.println("O valor de i "+i);
            i++; //i = i +1 ou i += 1
        }
        System.out.println(i);

        do{ //O do while ele primeiro executa e depois verifica a expressão
            i++;
            System.out.println("O valor de i "+i);
        }while(i < 15);
        System.out.println(i);

        for(int a = 0;a<= 10; a += 5){
            System.out.println(a);
        }
    }
}
