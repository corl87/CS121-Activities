package weekTen.labTen;

    class Mage extends Character implements Fighter {
    private final int magicPower;
    Mage(String name, int health, int magicPower){
        super(name, health);
        this.magicPower = magicPower;
    }
    @Override
    public void attack(){
        System.out.println(name + " casts a fireball!   Magic power: "+magicPower);
    }

        @Override
        public void defend() {
            System.out.println(name + " Conjures a magical barrier");
        }
    }
