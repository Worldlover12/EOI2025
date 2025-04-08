package JuegoRandom;

public class GuessGame {
    private Player player1 = this.player1;
    private Player player2 = this.player2;
    private Player player3 = this.player3;

    public GuessGame(Player player1, Player player2, Player player3) {
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
    }

    public void startGame() {


        System.out.println(player1.getGuess());
        System.out.println(player2.getGuess());
        System.out.println(player3.getGuess());

        boolean terminado = true;
        while (terminado) {
            int ranNum = (int) (Math.random() * 10);
            System.out.println("el num randdom es: " + ranNum);
            if (player1.getGuess() == ranNum) {
                System.out.println(player1.getName() + " wins");
                terminado = false;
            } else if (player2.getGuess() == ranNum) {
                System.out.println(player2.getName() + " wins");
                terminado = false;
            } else if (player3.getGuess() == ranNum) {
                System.out.println(player3.getName() + " wins");
                terminado = false;
            } else {
                System.out.println("no one wins");
            }
        }
    }
}