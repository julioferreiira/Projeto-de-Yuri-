package Main;
import java.util.Scanner;

import static Automatos.AutomatoUm.reconhece;

public class Main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a string para verificar:");
        String entrada = sc.nextLine();


        if (reconhece(entrada)) {
            System.out.println("A string é aceita (contém pelo menos um '1').");
        } else {
            System.out.println("A string não é aceita (não contém '1').");
        }


        sc.close();
    }
}
