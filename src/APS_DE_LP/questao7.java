package APS_DE_LP;

/* 7. Escrever um algoritmo que leia os dados de “N” pessoas (nome, sexo e ano de nascimento) e
informe se está apta ou não para cumprir o serviço militar obrigatório.
Dados de entrada: número de pessoas que serão analisadas (N), nome, sexo e idade de cada uma.
Dados de saída: lista de nome das pessoas aptas ao serviço militar.*/

import java.time.LocalDate;
import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas analisadas:");
        int idade,ano, quantidadePessoas = 0;
        String sexo = new String();
        quantidadePessoas = ent.nextInt();
        Object[][] listaProdutos = new Object[quantidadePessoas][3];
        for(int i = 0; i < quantidadePessoas; i++){
            System.out.println("Digite o nome da pessoa:");
            listaProdutos[i][0] = (String) ent.next();
            System.out.println("Digite o sexo da pessoa: 1 - Masculino, 2 - Feminino");
            listaProdutos[i][1] = ent.nextInt();
            System.out.println("Digite o ano de nascimento da pessoa:");
            listaProdutos[i][2] = ent.nextInt();
        }
        for(int i=0;i< quantidadePessoas;i++){
            ano = LocalDate.now().getYear();
            idade = ano - (int) listaProdutos[i][2];
            if((int)listaProdutos[i][1] == 1){
                sexo = "Masculino";
            }else {
                sexo = "Feminino";
            }

            if (idade >= 18) {
                if (idade <= 45) {
                    System.out.println("Quantidade de Pessoa Aptas");
                    System.out.println(listaProdutos[i][0]+", Sexo "+sexo+", Idade: "+idade);
                }
            }
        }
    }
}



