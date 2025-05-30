public class Main
{
    public static void main(String[] args) 
    {
        Tutorial start = new Tutorial();
        start.printInfo();
        Game g = new Game();
        g.chooseClass();
        g.makeTurn();
    }
}
