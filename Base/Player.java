package Base;
import java.util.Random;

import Abilities.Attackable;

public abstract class Player implements Attackable{
    private String name;
    private int health;
    private int attackPower;
    protected Random rand = new Random();

    public Player(String name, int health, int attackPower){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;

    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int getAttackPower(){
        return attackPower;
    }

    public int attack(){
        return rand.nextInt(attackPower) + 1;

    }

    public int takeDamage(int damage){
        System.out.println(getName() + "terkena"+damage  + "damage");
        return this.health = getHealth()-damage;
    }

    public boolean isAlive(){
        return this.health > 0;
    }
    
}
