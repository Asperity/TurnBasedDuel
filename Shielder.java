public class Shielder extends Player 
{
    private int numShields;

    public Shielder()
    {
        super.setHealth(30);
        super.setPots(0);
        numShields = 0;
    }

    public void shield()
    {
        if(numShields != 2)
        {
            setHealth(getHealth()+10);
            numShields++;
            System.out.println("Shield Up! Health +10");
            System.out.println("Shield(s) left: " + (2-numShields));
        }
        else
        {
            System.out.println("You're out of shields!");
        }

    }

    public int attack()
    {
        int temp = (int)(Math.random()*8+1);
        if((int)(Math.random()*6+1)==1)
        {
            return temp*2;
        }
        else
        {
            return temp;
        }
    }
}
