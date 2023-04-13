package logicaprogramacao;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        double qt_maca, valor_compra;

        System.out.println("Informe a quantidade de maçãs");
        qt_maca = ent.nextDouble();

          if (qt_maca >= 12){
              valor_compra = (qt_maca * 0.25);
        } else{
              valor_compra = (qt_maca * 0.30);
        }
        System.out.println(valor_compra);
    }
}
