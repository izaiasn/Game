package Model;

public class Outout {
    Player player = new Player();
    Enemy enemy = new Enemy();
    public void exibirPlayer(Player player){
        System.out.println("/-------------Informações-------------/");
        System.out.println("O nome do Player é:"+ player.getNome());
        System.out.println("A Skin do Player é:"+ player.getSkin());
        System.out.println("A vida inicial do player é: " + player.getVida());
        System.out.println("/---------------------------------/");
    }

    public void exibirEnemy(Enemy enemy){

        System.out.println("/-------------Informações-------------/");
        System.out.println("O nome do Inimigo é:"+ enemy.getNome());
        System.out.println("A Skin do Inimigo é:"+ enemy.getSkin());
        System.out.println("A vida inicial do player é: " + enemy.getVida());
        System.out.println("/------------------------------------/");

    }

}
