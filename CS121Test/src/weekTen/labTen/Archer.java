package weekTen.labTen;

public class Archer extends Character implements Fighter{
    private final int agility;
    Archer(String name, int health, int agility){
        super(name, health);
        this.agility = agility;
    }

    @Override
    public void attack() {
        System.out.println(name+" shoots an arrow!   Agility: " +agility);
    }

    @Override
    public void defend() {
        System.out.println(name + " swifty avoids the attack.");
    }
}
