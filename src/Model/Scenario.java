package Model;

import java.util.Scanner;

public class Scenario {

    Scanner scaner = new Scanner(System.in);
    public String elecioneSenario(){

        System.out.println("Escolha o Senário: ");
        System.out.println("1 - Carapicuiba 2 - Itapevi 3 - Arabia Neymar ");
        int opcaoSenario = scaner.nextInt();

        String senario = "Senai Osasco";

        switch (opcaoSenario){

            case 1:
                senario = "Carapicuiba";
                break;

            case 2:
                senario = "itapevi";
                break;

            case 3:
                senario = "Arabia com Ney";

                break;
        }
        return senario;
    }
}
