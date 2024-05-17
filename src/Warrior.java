public class Warrior extends Character
{
    private int strength;
    private int armor;
    public Warrior(String name,int armor, int strength){
        super(name);
        this.armor=armor;
        this.strength=strength;
    }
    public void attack (){
        System.out.println(getName()+" ATTACK!");
        setMana(-10);
        setLevel(10);
        strength-=20;
        System.out.println("level: "+getLevel());
        System.out.println("New strength: "+strength);
        System.out.println("Mana: "+getMana());
    }
    public void defend (){
        System.out.println(getName()+" defending...");
        setMana(-10);
        setLevel(3);
       setHealth(-5);
       armor-=10;
        System.out.println("level: "+getLevel());
        System.out.println("Mana: "+getMana());
        System.out.println("Health: "+getHealth());
        System.out.println("Armor: "+armor);

    }
}
