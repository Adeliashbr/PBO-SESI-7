package Characters;

import Base.Player;

public class Hero extends Player{

    public Hero(String name, int health, int attackPower){
        super(name, health, attackPower);
    }

    @Override
    public int attack(){
        boolean magic = rand.nextDouble() > 0.2;
        int damage = super.attack();

        if (magic){
            damage *= 2;
        }

        return damage;
    }

    public void infoPlayer(){
        System.out.println("Hero :" + getName() + "|Health" + getHealth() + "|Power:" + getAttackPower());
    }

}


