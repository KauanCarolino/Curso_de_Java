package logicaprogramacao;

import java.util.Scanner;
public class ex022 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        char resp;

        do{
            System.out.println("Roberto: Já chegamos? (S/N)");
            resp = ent.next().toLowerCase().charAt(0);
        }while(resp != 'n'); //Também vai funcionar com o (resp == 'n')
        System.out.println("Roberto: FINALMENTE!");
    }
}
