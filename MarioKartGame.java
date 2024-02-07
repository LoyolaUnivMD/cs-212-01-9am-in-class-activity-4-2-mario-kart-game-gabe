public class MarioKartGame {
    public static void main(String[] args) {


        MarioKartPlayer luigi = new MarioKartPlayer("Gabe", "Luigi", 10);
        MarioKartPlayer mario = new MarioKartPlayer("Michael", "Mario", 15);

        luigi.displayInfo();
        mario.displayInfo();

        luigi.boost();
        mario.boost();

        luigi.displayInfo();
        mario.displayInfo();

    }
}
