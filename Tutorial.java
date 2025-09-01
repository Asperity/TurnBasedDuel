public class Tutorial {
    public void printInfo()
    {
        System.out.println("\nTwo Players will go each other in a turn-based duel!\n"
        + "There are 4 classes to choose from that may give you a strategical advantage over your opponent.\n" 
        + "These classes include:\n");
        System.out.println("KNIGHT: Starts with 50 health points and begins the fight defending\n");
        System.out.println("MONK: 35 health points with increased odds of a crit and a chance of a second hit\n");
        System.out.println("MAGE: 35 health points and has a magic attack with 15 max damage\n");
        System.out.println("SHIELDER:30 health, no pots, but can raise a 10 hitpoint shield twice\n");
        System.out.println("The non-class specific commands in this game is...\n"
        + "ATTACK: Strikes your opponent for a max of 10 damage with a 20% chance to crit (Monk 33%) \n"
        + "POTION: Heals you for 5 hitpoints\n" 
        + "DEFEND: Negates the damage you take when hit by half. \n\n" 
        + "Whoever gets their opponent to 0 hp or below first wins!\n");
    }
}
