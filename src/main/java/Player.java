public class Player {
    public int POINT;
    public boolean wonGame;
    public boolean lostGame;
    private int ROLL;



    //should the player decide to roll or should it be in the driver?
    public void rollDice(Die redDie, Die blackDie){
        int  l = redDie.getPits();
        System.out.println(redDie);
        int n = blackDie.getPits();
        System.out.println(blackDie);
         ROLL = l + n;
         System.out.println("The player rolled a "+ROLL);
    }

    //first roll logic

    public void FirstRoll(Die redDie, Die blackDie){
        int  l = redDie.getPits();
        System.out.println(redDie);
        int n = blackDie.getPits();
        System.out.println(blackDie);
        POINT = l + n;
        System.out.println("The player rolled a "+POINT+" and has a POINT of "+POINT);
    }

    public Player(){

        POINT = 0;
        wonGame = false;
        lostGame = false;

    }

    @Override
    public String toString() {
        return "Player rolled a "+ROLL+" and has a point of "+POINT;
    }
}
