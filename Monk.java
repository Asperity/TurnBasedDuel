public class Monk extends Player 
{
    private int temp;
    private int count; 

    public Monk()
    {
        super.setHealth(35);
    }
    
    public int attack()
    {
        if(count == 0)
        {
            temp = (int)(Math.random()*10+1);
        }
        else
        {
            temp += (int)(Math.random()*10+1);
            count = 0;
        }
        if((int)(Math.random()*5+1)<=3)
        {
            temp*=2;
            if((int)(Math.random()*3+1)==1 && count == 0)
            {
            count++;
            attack();
            }
            return temp;
        }
        else
        {
            if((int)(Math.random()*3+1)==1)
            {
            attack();
            }
            return temp;
        }
        
    }
}
