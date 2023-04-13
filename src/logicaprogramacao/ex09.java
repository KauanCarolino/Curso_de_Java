package logicaprogramacao;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double sal, desc, total = 0;

        System.out.println("Digite o seu salario: ");
        sal = ent.nextDouble();

        if (sal <= 600){
            System.out.println("Funcionario Insenso!");
        } else{
            if (sal > 600 && sal <= 1200){
                desc = (sal * 0.20);
                total = (sal - desc);
            } else {
                if (sal > 1200 && sal <= 2000){
                    desc = (sal * 0.25);
                    total = (sal - desc);
                } else if (sal > 2000) {
                    desc = (sal * 0.30);
                    total = (sal - desc);
                }
            }
        }
        System.out.println("O salario com desconto e de "+total+" reais");
    }
}
