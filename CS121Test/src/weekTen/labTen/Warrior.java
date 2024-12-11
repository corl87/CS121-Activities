package weekTen.labTen;

public class Warrior extends Character implements Fighter {
    private int strength;
    Warrior(String name, int health, int strength){
        super(name, health);
        this.strength = strength;
    }

    private int getStrength(){
        return strength;
    }
    private void setStrength(int strength){
        this.strength = strength;
    }

    @Override
    public void attack() {
        System.out.println(name +" slashes with a sword!   Strength: "+ strength);
    }

    @Override
    public void defend() {
        System.out.println(name +" raises a shield to block the attack.");
    }
}
