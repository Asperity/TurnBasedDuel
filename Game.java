import java.util.*;
public class Game  {
    private Player PlayerOne;
    private Player PlayerTwo;
    private String characterClass;
    private String characterMove;
    private Scanner s = new Scanner(System.in);

    public void chooseClass()
    {
        while (true)
        {
            System.out.println("Player One, what class would you like to be? (Knight, Mage, Monk, Shielder)");
            
            try
            {
                characterClass = s.next();
                if(characterClass.equals("Knight"))
                {
                    PlayerOne = new Knight();
                    break;
                }
                else if(characterClass.equals("Mage"))
                {
                    PlayerOne = new Mage();
                    break;
                }
                else if(characterClass.equals("Monk"))
                {
                    PlayerOne = new Monk();
                    break;
                }
                else if(characterClass.equals("Shielder"))
                {
                    PlayerOne = new Shielder();
                    break;
                }
                else
                {
                    System.out.println("Choose a class");
                }
            }
            catch(Exception e)
            {
                System.out.println("caught");
            }
        }
        
        while (true)
        {
            System.out.println("Player Two, what class would you like to be? (Knight, Mage, Monk, Shielder) ");
            try
            {
                characterClass = s.next();
                if(characterClass.equals("Knight"))
                {
                    PlayerTwo = new Knight();
                    break;
                }
                else if(characterClass.equals("Mage"))
                {
                    PlayerTwo = new Mage();
                    break;
                }
                else if(characterClass.equals("Monk"))
                {
                    PlayerTwo = new Monk();
                    break;
                }
                else if(characterClass.equals("Shielder"))
                {
                    PlayerTwo = new Shielder();
                    break;
                }
                else
                {
                    System.out.println("Choose a class");
                }
            }
            catch(Exception e)
            {
                System.out.println("caught");
            }
        }
       
        System.out.println();
    }

    public void makeTurn()
    {
        if(PlayerOne instanceof Shielder)
        {
            System.out.println("Player One, make your move. (Attack, Defend, Potion, Shield)");
        }
        else
        {
            System.out.println("Player One, make your move. (Attack, Defend, Potion)");
        }
       try
       {
        characterMove = s.next();
        if(characterMove.equals("Attack"))
        {
            int temp = PlayerOne.attack();
             if(PlayerTwo.getDefense())
             {
                 PlayerTwo.gotHit(temp/2);
                 PlayerTwo.shatterDefense();
                 System.out.println("PlayerTwo hit for " + temp/2 + " damage");
                 System.out.println("DEFENSE BROKEN");
             }
             else
             {
                PlayerTwo.gotHit(temp);
                PlayerTwo.shatterDefense();
                System.out.println("PlayerTwo hit for " + temp + " damage");
             }
        }
        else if(characterMove.equals("Defend"))
        {
            PlayerOne.defend();
        }
        else if(characterMove.equals("Potion"))
        {
            if(PlayerOne.getPotions()== 0)
            {
                System.out.println("You have no potions!");
            }
            else
            {
                PlayerOne.usePot();
            }
        }
        else if(characterMove.equals("Shield"))
        {
            if(PlayerOne instanceof Shielder)
            {
                PlayerOne.shield();
            }
            else
            {
                System.out.print("You are not a Shielder!");
            }
        }
        else 
        {
            System.out.println("That is not a choice!");
        }
       }
       catch(Exception ee)
       {
        System.out.print("caught");
       }
       if(PlayerTwo.getHealth() <= 0)
       {
        System.out.println("PLAYER ONE WINS!");
       }
       else
       {
        if(PlayerTwo instanceof Shielder)
        {
            System.out.println("Player Two, make your move. (Attack, Defend, Potion, Shield)");
        }
        else
        {
            System.out.println("Player Two, make your move. (Attack, Defend, Potion)");
        }
        try
        {
         characterMove = s.next();
         if(characterMove.equals("Attack"))
         {
            int temp = PlayerTwo.attack();
             if(PlayerOne.getDefense())
             {
                 PlayerOne.gotHit(temp/2);
                 PlayerOne.shatterDefense();
                 System.out.println("PlayerOne hit for " + temp/2 + " damage");
             }
             else
             {
                PlayerOne.gotHit(temp);
                PlayerOne.shatterDefense();
                System.out.println("PlayerOne hit for " + temp + " damage");
             }
         }
         else if(characterMove.equals("Defend"))
         {
             PlayerTwo.defend();
         }
         else if(characterMove.equals("Potion"))
         {
             if(PlayerTwo.getPotions()== 0)
             {
                 System.out.println("You have no potions!");
             }
             else
            {
                PlayerTwo.usePot();
            }
         }
         else if(characterMove.equals("Shield"))
        {
            if(PlayerTwo instanceof Shielder)
            {
                PlayerTwo.shield();
            }
            else
            {
                System.out.print("You are not a Shielder!");
            }
        }
         else 
         {
             System.out.println("That is not a choice!");
         }
        }
        catch(Exception ee)
        {
         System.out.print("caught");
        }
       }
       if(PlayerOne.getHealth() <= 0)
       {
        System.out.println("PLAYER TWO WINS!");
       }
       else
       {
        System.out.println();
        System.out.println("CURRENT HPs:\n"
        + "Player One: " + PlayerOne.getHealth() 
        + "\n Player Two : " + PlayerTwo.getHealth());
        makeTurn();
       }
    }
}
