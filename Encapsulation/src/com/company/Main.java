package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Jun";
//        player.health = 100;
//        player.weapon = "Light Sword";
//        // as we did not make constructor in Player class, we can set them up one by one here;
//
//        int damage = 20;
//        player.loseHealth(damage);
//        System.out.println("Health remains " + player.healthRemaining());
//
//        int oneMoreDamage = 100;
//        player.loseHealth(oneMoreDamage);
//        System.out.println(player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Jun",
                200, "Light Sword");
        System.out.println("Initial Health is " + player.getHP());
    }
}
