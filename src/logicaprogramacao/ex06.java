package logicaprogramacao;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int dd, mm, aaaa;

        System.out.println("Qual o seu dia de nascimento? ");
        dd = ent.nextInt();
        System.out.println("Qual o seu mês de nascimento? ");
        mm = ent.nextInt();
        System.out.println("Qual o seu ano de nascimento? ");
        aaaa = ent.nextInt();

        if (dd > 0 && dd <= 31){
            if (mm > 00 && mm <= 12){
                if (aaaa <= 2022){
                    System.out.println(dd+"/"+mm+"/"+aaaa+" Data válida");
                }
            }
        }else {
            System.out.println("Data inválida");
        }
    }
}
