public class Player {
    public int POINT;
    public boolean wonGame = false;
    public boolean lostGame = false;
    public  int ROLL;
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }



    //should the player decide to roll or should it be in the driver?
    public void rollDice(Die redDie, Die blackDie){
        int  l = redDie.getPits();
       // System.out.println(redDie);
        int n = blackDie.getPits();
       // System.out.println(blackDie);
         ROLL = l + n;
         System.out.println(this.getName()+" rolled a "+ROLL);
    }

    //first roll logic

    public void FirstRoll(Die redDie, Die blackDie){
        int  l = redDie.getPits();
      //  System.out.println(redDie);
        int n = blackDie.getPits();
      //  System.out.println(blackDie);
        POINT = l + n;
        System.out.println(this.getName()+" rolled a "+POINT+" and has a POINT of "+POINT);
    }

    public Player(String name){
        setName(name);
        POINT = 0;

    }

    @Override
    public String toString() {
        return getName();
    }
}
