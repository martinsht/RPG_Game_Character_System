import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String[] args) {
        try{
        Character ch1 = new Warrior("Sir Vicious",50,65);
        Character ch2 = new Mage("Tara",80,"medium");
        Character ch3 = new Rogue("Lofty","slow","clumsy");
        System.out.println(ch1.getName()+" attacks "+ch2.getName());
        TimeUnit.SECONDS.sleep(3);// I delayed the responses to look more like a game.
        ch1.attack();
        ch2.defend();
        System.out.println();
            TimeUnit.SECONDS.sleep(2);

            System.out.println(ch2.getName()+" attacks "+ch3.getName());
            TimeUnit.SECONDS.sleep(3);
            ch2.castSpell();
        ch3.defend();
        ch3.levelUP();
        System.out.println();
            TimeUnit.SECONDS.sleep(2);

            System.out.println(ch2.getName()+" attacks "+ch1.getName());
            TimeUnit.SECONDS.sleep(3);

            ch2.castSpell();
        ch1.defend();
        ch2.levelUP();
    } catch (InterruptedException e) {
        System.err.format("IOException: %s%n", e);
    }
    }
}