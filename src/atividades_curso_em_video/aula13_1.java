package atividades_curso_em_video;


//Estrutura de Repetição
//while
//Nesse cod será feito um contador de Cambalhotas.
public class aula13_1 {
    public static void main(String[] args){

        int cc = 0;

        while (cc <= 10){
            cc++;
            if (cc == 2 || cc == 3 || cc == 4) {
                continue; //Aqui ele irá pular a contagem do 2, 3 e 4
            }
            if (cc == 7) {
                break; //Aqui ele irá para a contagem no 7, assim encerrando o programa
            }
            System.out.println("cambalhota " + cc);
        }
    }
}
