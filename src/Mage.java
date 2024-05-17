public class Mage extends Character
{
    private String intelligence;
    private int spellPower;
    public Mage(String name,int spellpower, String intelligence){
        super(name);
        this.intelligence=intelligence;
        this.spellPower =spellpower;
    }
    public void castSpell (){
        System.out.println(getName()+" casting spell...");
        setMana(-20);
       setLevel(-12);
       spellPower+=10;
        System.out.println("level: "+getLevel());
        System.out.println("Mana: "+getMana());
        System.out.println("Spell power: "+spellPower);

    }
    public void levelUP (){
        System.out.println(getName()+" Level Up!");
        setLevel(100);
        if(intelligence.equals("low"))
            intelligence="medium";
        if(intelligence.equals("medium"))
            intelligence="high";
        if (intelligence.equals("high"))
            intelligence="very high";
        System.out.println("Intelligence: "+intelligence);
        System.out.println("Level: "+getLevel());
    }
}
