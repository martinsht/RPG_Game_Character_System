public class Main {
    public static void main(String[] args) {
        Character ch1 = new Warrior("Sir Vicious",50,65);
        Character ch2 = new Mage("Tara",80,"medium");
        Character ch3 = new Rogue("Lofty","slow","clumsy");
        System.out.println(ch1.getName()+" attacks "+ch2.getName());
        ch1.attack();
        ch2.defend();
        System.out.println();
        System.out.println(ch2.getName()+" attacks "+ch3.getName());
        ch2.castSpell();
        ch3.defend();
        ch3.levelUP();
        System.out.println();
        System.out.println(ch2.getName()+" attacks "+ch1.getName());
        ch2.castSpell();
        ch1.defend();
        ch2.levelUP();
    }
}