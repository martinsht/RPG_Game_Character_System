public class Character {
    private String name;
    private int health=100;
    private int mana=100; // could start from 100
    private int level=0;
    public Character(String name){
        this.name=name;
    }
    public Character(){
    }
    int getHealth(){
        return health;
    }
    void setHealth(int a){
        health+=a;
    }
    void setMana(int a){
        mana+=a;
    }
    void setLevel(int a){
        level+=a;
    }
    int getMana(){
        return mana;
    }
    int getLevel(){
        return level;
    }
    String getName(){
        return name;
    }
    public void attack (){
        System.out.println(name+" ATTACK!");
        mana-=10;
        level+=10;
        System.out.println("level: "+level);
        System.out.println("Mana: "+mana);
    }
    public void defend (){
        System.out.println(name+" defending...");
        mana-=10;
        level+=3;
        health-=5;
        System.out.println("level: "+level);
        System.out.println("Mana: "+mana);
        System.out.println("Health: "+health);
    }
    public void castSpell (){
        System.out.println(name+" casting spell...");
        mana-=20;
        level+=12;
        System.out.println("level: "+level);
        System.out.println("Mana: "+mana);
    }
    public void levelUP (){
        System.out.println(name+" Level Up!");
        level+=100;
        System.out.println("Level: "+level);
    }



}
