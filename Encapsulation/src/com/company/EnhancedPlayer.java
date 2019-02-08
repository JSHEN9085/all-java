package com.company;

public class EnhancedPlayer {
    private String name;
    private int HP = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100){ //if argument is outside of 0 ~ 100, constructor will set it as 100 default at line 5;
            this.HP = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        HP = HP - damage;
        if (this.HP <= 0){
            System.out.println("Player knocked out");
        }
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public String getWeapon() {
        return weapon;
    }
}
