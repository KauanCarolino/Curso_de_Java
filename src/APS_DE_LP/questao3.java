package APS_DE_LP;

/*3. Débora se inscreveu em uma rede social para se manter em contato com seus amigos.
A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha
precisa ser forte.

O site considera uma senha forte quando ela satisfaz os seguintes critérios:
• Possui no mínimo 6 caracteres.
• Contém no mínimo 1 digito.
• Contém no mínimo 1 letra em minúsculo.
• Contém no mínimo 1 letra em maiúsculo.
• Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é
uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número
mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.*/

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        boolean digito = false;
        boolean letraMaiuscula = false;
        boolean letraMinuscula = false;
        boolean caractereEspecial = false;
        String senha;

        System.out.println("Digite uma senha que atenda aos seguintes critérios: "+ "\n" +
            "- Possua no mínimo 6 caracteres;" + "\n" +
            "- Contenha no mínimo 1 digito;" + "\n" +
            "- Contenha no mínimo 1 letra minúscula;" + "\n" +
            "- Contenha no mínimo 1 letra maipusculas;" + "\n" +
            "- Contenha no mínimo 1 caractere especial (!@#$%^&*()-=);");

        System.out.println("Digite sua senha: ");
        senha = ent.next();

            if (senha.length() < 6) {
                System.out.println("A senha digitada possui " + (senha.length())
                                  + " caracteres, é necessário ter mínimo 6 caracteres, faltam: "
                                  + (6 - senha.length() + " caracteres \n"));
            }
            else {
                for (char c : senha.toCharArray()) {
                    if (c >= '0' && c <= '9') {
                        digito = true;
                    } else if (c >= 'A' && c <= 'Z') {
                        letraMaiuscula = true;
                    } else if (c >= 'a' && c <= 'z') {
                        letraMinuscula = true;
                    } else {
                        caractereEspecial = true;
                    }
                }

                    if (!digito) {
                        System.out.println("Sua senha precisa ter pelo menos um digito!");
                    }
                    if (!letraMaiuscula){
                        System.out.println("Sua senha precisa ter pelo menos uma letra maiúscula!");
                    }
                    if (!letraMinuscula) {
                        System.out.println("Sua senha precisa ter pelo menos uma letra minúscula!");
                    }
                    if (!caractereEspecial) {
                        System.out.println("Seua senha precisa ter pelo menos uma caractere especial");
                    }
                    System.out.println(" ");
                    if (digito && letraMinuscula && letraMaiuscula && caractereEspecial){
                        System.out.println("Senha cadastrada com sucesso!");
                    }
                }
        ent.close();
    }
}
