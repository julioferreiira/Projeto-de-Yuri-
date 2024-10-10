package Main;


import java.util.Scanner;

import static Automatos.AutomatoQuatro.reconhece;

public class Main4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a string para verificar:");
        String entrada = sc.nextLine();


        if (reconhece(entrada)) {
            System.out.println("A string é aceita (a única string aceita é a vazia).");
        } else {
            System.out.println("A string não é aceita (apenas a string vazia é aceita).");
        }


        sc.close();
    }
}