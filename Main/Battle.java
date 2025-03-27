package Main;

import Characters.Enemy;
import Characters.Hero;

public class Battle {
    public static void main(String[] args) {
        Hero hero = new Hero("Adel", 100,20);
        Enemy enemy = new Enemy("Puki", 100, 20);

        System.out.println(
            "Battle dimulai antara" 
            + hero.getName()
            + "VS" 
            + enemy.getName() 
        );

        hero.infoPlayer();
        enemy.infoPlayer();

        while (hero.isAlive() && enemy.isAlive()) {
            int heroDamage = hero.attack();
            System.out.println("Hero Menyerang for :" + heroDamage + "damage!");
            enemy.takeDamage(heroDamage);

            int enemyDamage = enemy.attack();
            System.out.println("Enemy Menyerang for :" + enemyDamage + "damage!");
            hero.takeDamage(enemyDamage);
        }

        if (hero.isAlive()) {
            System.out.println("Hero Menang");            
        } else {
            System.out.println("Enemy Menang");
        }

    }

}
