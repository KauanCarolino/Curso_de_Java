package logicaprogramacao;
import java.util.Scanner;


public class ex08 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        int macas;
        double valor;

        System.out.println("Quantas macas serao compradas? ");
        macas = ent.nextInt();

        if (macas <= 20) {
            valor = (macas * 1.80);
            System.out.println("O valor total a ser pago e de "+valor);
        } else {
            valor = (macas * 1.40);
            System.out.println("O valor total a ser pago é de "+valor);
        }
    }
}
