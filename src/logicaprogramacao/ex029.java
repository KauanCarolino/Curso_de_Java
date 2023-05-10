package logicaprogramacao;

public class ex029 {
    public static void main(String[] args) {
        //Arrays
        double[] temperaturas = new double[365];
        temperaturas[0] = 34.1;
        temperaturas[1] = 22.3;
        temperaturas[2] = 39.8;
        temperaturas[3] = 22.4;
        temperaturas[4] = 31;
        temperaturas[5] = 34.6;
        temperaturas[6] = 30;

        System.out.println("A temperatura do dia 1 e "+temperaturas[1]);


        System.out.println("Qual o tamanho do Array? "+temperaturas.length);

        for(int i = 0; i<temperaturas.length;i++){
            System.out.println("O valor da temperatura do dia "+(i +1)+" e "+temperaturas[i]);
        }
        //OU
        /*for(double temp : temperaturas){
            System.out.println(temp);
        }*/
    }
}
