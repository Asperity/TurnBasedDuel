public class Player {
    private int health;
    private boolean isDefending;
    private int numPots = 2;

    public Player(){}

    public Player(int h, boolean d)
    {
        health = h;
        isDefending = d;
    }

    public int gotHit(int d)
    {
        return health -= d;
    }

    public void setHealth(int h)
    {
        health = h;
    }

    public void defend()
    {
        isDefending = true;
    }

    public int setPots(int p)
    {
        return numPots = p;
    }

    public void usePot()
    {
        if(numPots != 0)
        {
            numPots--;
            health += 5;
            System.out.println("Health +5");
            System.out.println("Potion(s) Left: " + numPots);
        }
    }

    public int getHealth()
    {
        return health;
    }

    public int attack()
    {
        int temp = (int)(Math.random()*10+1);
        if((int)(Math.random()*5+1)==1)
        {
            return temp*2;
        }
        else
        {
            return temp;
        }
    }
    public boolean getDefense()
    {
        return isDefending;
    }

    public int getPotions()
    {
        return numPots;
    }

    public boolean shatterDefense()
    {
        return isDefending = false;
    }

    public void shield(){}
}
