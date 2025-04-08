
package JuegoRandom;

public class Player {
    public String name=this.name;
    public int guess=(int) (Math.random()*10);

    public Player(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getGuess() {
        return guess;
    }

    public void setName(String name) {
        this.name = name;
    }
}
