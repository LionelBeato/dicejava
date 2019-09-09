public class Player {
    public int point;
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
         System.out.println(this.getName()+" rolled a "+l+" "+n+" = "+ROLL);
    }

    //first roll logic

    public void FirstRoll(Die redDie, Die blackDie){
        int  l = redDie.getPits();
      //  System.out.println(redDie);
        int n = blackDie.getPits();
      //  System.out.println(blackDie);
        point = l + n;
        System.out.println(this.getName()+" rolled a "+point+" and has a POINT of "+point);
    }

    public Player(String name){
        setName(name);
        point = 0;

    }

    @Override
    public String toString() {
        return getName();
    }
}
