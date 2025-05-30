public class Mage extends Player {

    public Mage()
    {
        super.setHealth(35);
    }

    public int Attack()
    {
        int temp = (int)(Math.random()*15+1);
        if((int)(Math.random()*5+1)==1)
        {
            return temp*2;
        }
        else
        {
            return temp;
        }
    }

}
