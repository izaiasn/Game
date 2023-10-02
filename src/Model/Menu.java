package Model;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    Player player = new Player();
    Enemy enemy = new Enemy();
    Battle battler = new Battle();
    Scenario scenario= new Scenario();
    Outout output = new Outout();


    public void executarMenu() {

        boolean continuar = true;

        while (continuar) {

            System.out.println("/------------- Menu -------------");
            System.out.println("1 - Cadastrar Player             ");
            System.out.println("2 - Cadastrar Inimigo            ");
            System.out.println("3 - Cadastrar Battler            ");
            System.out.println("4 - Sair                         ");
            System.out.println("/--------------------------------");
            System.out.print("Escolha uma opção : ");

            int opcaoUser = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoUser) {

                case 1:
                    player.cadastrarPlayer();
                    output.exibirPlayer(player);
                    break;

                case 2:
                    enemy.cadastrarInimigo();
                    output.exibirEnemy(enemy);
                    break;

                case 3:
                    battler.senarioBatalha = scenario.elecioneSenario();
                    battler.iniciarBatalha(player, enemy);
                    enemy.setVida(100);
                    player.setVida(100);

                    break;

                case 4:
                    continuar = false;
                    System.out.println("Saindo do Jogo...");
                    break;

            }

        }
    }
}
