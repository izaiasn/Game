package Model;

import java.util.Scanner;
import java.lang.Math;

public class Battle {

    String senarioBatalha;
    Scanner scanner = new Scanner(System.in);

    public void iniciarBatalha(Player player, Enemy enemy){

        boolean continuar = true;

        while (continuar){

            int vidaPlayer = player.getVida();
            int vidaEnemy = enemy.getVida();

            if( enemy.vida <=0) {
                System.out.println("O Player " + player.getNome() + " é o vencedor");

                break;

            }else if (vidaPlayer<= 0){
                System.out.println("O Inimigo " + enemy.getNome() + " é o vencedor" );

                break;
            }

            System.out.println("/------------- Batalha -------------");
            System.out.println("Ataque Player  [ V ]" + player.getNome() + " Vida " + vidaPlayer);
            System.out.println("Para realizar a defesa digite um valor [1-5]"+ "Vida Salva");
            System.out.println("Ataque inimigo [ A ]" + enemy.getNome() + " Vida " + vidaEnemy);
            System.out.println("Para realizar a defesa digite um valor [1-5]"+ "Vida Salva");
            System.out.println("/-----------------------------------");
            String attack  = scanner.nextLine();


            if (attack.equalsIgnoreCase("V" )){
                System.out.println("o player atacou");
                System.out.println("Informe o valor da defesa do inimigo: ");
                int userDefesa = scanner.nextInt();
                int chanceDefesa = (int) (Math.random()*5)+1;
                scanner.nextLine();
                if (userDefesa == chanceDefesa ){
                    System.out.println("A defesa bloqueou"+ userDefesa);
                    int danoPlayer = ((int) (Math.random()*20)+1) - chanceDefesa ;
                    if (danoPlayer <=0){
                        danoPlayer = 0;
                    }
                    enemy.subtrairVida(danoPlayer);
                    System.out.println("O dano gerado " +danoPlayer);

                }

            }else if (attack.equalsIgnoreCase("A")){
                System.out.println("/------------- O Inimigo Atacou -------------");
                int danoEnemy = (int) (Math.random()*20 + 1);
                player.subtrairVida(danoEnemy);
                System.out.println("O dano gerado foi: "+ danoEnemy);

                System.out.println("/--------------------------------------------");
            }else {
                System.out.println("Digite uma tecla válida !!!");
            }

        }


    }

}
