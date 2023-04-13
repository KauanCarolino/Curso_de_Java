package logicaprogramacao;

/*Escreva um programa que apresente quatro
opções: (a) consulta saldo, (b) saque e (c)
depósito e (d) sair.

    O saldo deve iniciar em R$ 0,00. A cada saque ou
depósito o valor do saldo deve ser atualizado.*/

import java.util.Scanner;
public class ex023 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        char resp;
        double saldo = 0, deposito, saque;

        do{
            System.out.println("(a) Consultar saldo");
            System.out.println("(b) Saque");
            System.out.println("(c) Deposito");
            System.out.println("(d) Sair");
            System.out.println("----------------------------");

            System.out.println("O que deseja fazer: ");
            resp = ent.next().toLowerCase().charAt(0);

            if (resp == 'a'){
                System.out.println("Extrato: "+saldo);
                System.out.println(" ");
            } else if (resp == 'b'){
                System.out.println("Valor do saque: ");
                saque = ent.nextDouble();
                saldo = (saldo - saque);
            } else if (resp == 'c'){
                System.out.println("Valor para deposito: ");
                deposito = ent.nextDouble();
                saldo = (saldo + deposito);
            }
        }while(resp != 'd');
    }
}
