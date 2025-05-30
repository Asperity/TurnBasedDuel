import java.util.*;
public class Game  {
    private Player PlayerOne;
    private Player PlayerTwo;

    public void chooseClass()
    {
        System.out.println("Player One, what class would you like to be? (Knight, Mage, Monk, Shielder)");
        Scanner s = new Scanner(System.in);
        try
        {
            String a1 = s.next();
            if(a1.equals("Knight"))
            {
                 PlayerOne = new Knight();
            }
            else if(a1.equals("Mage"))
            {
                PlayerOne = new Mage();
            }
            else if(a1.equals("Monk"))
            {
                PlayerOne = new Monk();
            }
            else if(a1.equals("Shielder"))
            {
                 PlayerOne = new Shielder();
            }
            else
            {
                System.out.println("Choose a class");
                chooseClass();
            }
        }
        catch(Exception e)
        {
            System.out.println("caught");
        }
        System.out.println("Player Two, what class would you like to be? (Knight, Mage, Monk, Shielder, Rogue) ");
        Scanner ss = new Scanner(System.in);
        try
        {
            String a2 = s.next();
            if(a2.equals("Knight"))
            {
                 PlayerTwo = new Knight();
            }
            else if(a2.equals("Mage"))
            {
                 PlayerTwo = new Mage();
            }
            else if(a2.equals("Monk"))
            {
                 PlayerTwo = new Monk();
            }
            else if(a2.equals("Shielder"))
            {
                 PlayerTwo = new Shielder();
            }
            else
            {
                System.out.println("Choose a class");
                chooseClass();
            }
        }
        catch(Exception e)
        {
            System.out.println("caught");
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
       Scanner sss = new Scanner(System.in);
       try
       {
        String a3 = sss.next();
        if(a3.equals("Attack"))
        {
            int temp = PlayerOne.attack();
             if(PlayerTwo.getDefense())
             {
                 PlayerTwo.gotHit(temp/2);
                 PlayerTwo.shatterDefense();
             }
             else
             {
                PlayerTwo.gotHit(temp);
                PlayerTwo.shatterDefense();
             }
        }
        else if(a3.equals("Defend"))
        {
            PlayerOne.defend();
        }
        else if(a3.equals("Potion"))
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
        else if(a3.equals("Shield"))
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
        Scanner ssss = new Scanner(System.in);
        try
        {
         String a4 = sss.next();
         if(a4.equals("Attack"))
         {
            int temp = PlayerTwo.attack();
             if(PlayerOne.getDefense())
             {
                 PlayerOne.gotHit(temp/2);
                 PlayerOne.shatterDefense();
             }
             else
             {
                PlayerOne.gotHit(temp);
                PlayerOne.shatterDefense();
             }
         }
         else if(a4.equals("Defend"))
         {
             PlayerTwo.defend();
         }
         else if(a4.equals("Potion"))
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
         else if(a4.equals("Shield"))
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
        System.out.println("CURRENT HPS : Player One :" + PlayerOne.getHealth() + " Player Two : " + PlayerTwo.getHealth());
        makeTurn();
       }
    }
}
