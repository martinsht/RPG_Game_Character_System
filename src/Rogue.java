public class Rogue extends Character
{
    private String agility;
    private String dexterity;
    public Rogue(String name, String agility, String dexterity){
        super(name);
        this.agility=agility;
        this.dexterity=dexterity;
    }
    public void levelUP (){
        System.out.println(getName()+" Level Up!");
        setLevel(100);
        if(agility.equals("slow"))
            agility="normal";
        if(agility.equals("normal"))
            agility="fast";
        if (agility.equals("fast"))
            agility="very swift";
        if(dexterity.equals("clumsy"))
            dexterity="handy";
        if(dexterity.equals("handy"))
            dexterity="dexterous";
        System.out.println("Level: "+getLevel());
        System.out.println("Dexterity: "+dexterity);

    }
}
