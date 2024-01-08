package Java101.Classes.BoxingGame;

import java.util.Random;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public Fighter(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe){
        Random random = new Random();
        int roundDamage = random.nextInt(damage) + 1;
        System.out.println("*".repeat(10));
        System.out.println(this.name + " dealt " + roundDamage + " damage to " + foe.name + ".");
        if (foe.dodge()) {
            System.out.println(foe.name + " deflected the incoming damage.");
            return foe.health;
        }
        if (foe.health - roundDamage < 0)
            return 0;

        return foe.health - roundDamage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
    
}
