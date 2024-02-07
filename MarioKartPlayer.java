public class MarioKartPlayer {

    final String playerName;
    final String character;
    private int speed;

    public MarioKartPlayer(String playerName, String character, int speed){
        this.playerName = playerName;
        this.character = character;
        this.speed = speed;
    }

    public void boost(){
        speed += 5;
    }

    public void displayInfo(){
        System.out.println("Player name: " + playerName);
        System.out.println("Character: " + character);
        System.out.println("Speed: " + speed);
    }

}
