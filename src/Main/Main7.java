package Main;

import java.util.Scanner;

import static Automatos.AutomatoSete.reconhece;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a string para verificar:");
        String entrada = sc.nextLine();

        if (reconhece(entrada)) {
            System.out.println("A string é aceita (começa e termina com o mesmo símbolo).");
        } else {
            System.out.println("A string não é aceita (não começa e termina com o mesmo símbolo).");
        }


        sc.close();
    }
}