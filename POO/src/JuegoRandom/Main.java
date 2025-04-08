package JuegoRandom;

public class Main {
    public static void main(String[] args){
        GuessGame game = new GuessGame(new Player("Manu"),new Player("Marta"), new Player("Gilipo"));
        game.startGame();
    }
}
