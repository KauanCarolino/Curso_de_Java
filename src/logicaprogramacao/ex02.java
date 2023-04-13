package logicaprogramacao;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int senha;

        System.out.println("Informe sua senha: ");
        senha = ent.nextInt();

        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO!");
        }else {
            System.out.println("ACESSO NEGADO!");
            System.out.println("NÃO VAI ENTRAR TROXA!");
        }
    }
}
