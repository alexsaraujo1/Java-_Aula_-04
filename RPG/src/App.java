public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("RPG Start");

        Mage luiz = new Mage("Luiz", 3, 8, 6, 100);
        System.out.println(luiz.getName());
        System.out.println("Vida: " + luiz.getHealth());
        luiz.attack();

        Warrior giovanna = new Warrior("Giovanna ", 8, 5, 6);
        System.out.println(giovanna.getName());
        System.out.println("Vida: " + giovanna.getHealth());
        giovanna.attack();

        System.out.println("RPG End");
    }
}

abstract class Character{
    protected String name;
    protected int strength;
    protected int intelligence;
    protected int constitution;

    private int health;

    public Character(String name, int strength, int intelligence, int constitution, int health){
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
        this.constitution = constitution;
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    public final String getName(){
        return this.name;
    }

    public void attack(){
        System.out.println("Total de dano físico: " + strength);
    }

    public abstract void job();
}

class Mage extends Character{
    protected int mana;

    public Mage(String name, int strength, int intelligence, int constitution, int mana){
        super(name, strength, intelligence, constitution, constitution * 4);
        this.mana = mana;
    }

    public int getMana(){
        return this.mana;
    }

    @Override
    public void attack(){
        System.out.println("Total de dano mágico: " + intelligence * 2);
    }

    @Override
    public void job(){
        System.out.println("MAGE");
    }

}

class Warrior extends Character{

    public Warrior(String name, int strength, int intelligence, int constitution){
        super(name, strength, intelligence, constitution, constitution * 5);
    }

    @Override
    public void attack(){
        System.out.println("Total de dano físico: " + strength * 3);
    }

    @Override
    public void job(){
        System.out.println("WARRIOR");
    }

}