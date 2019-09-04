public class Session {

    //initialize the dice to play for the session

    Die redDie = new Die();
    Die blackDie = new Die();


    //logic for the first player rolls, in the driver each player will be parsed into this method
    public void firstRollLogic(Player player) {
        player.FirstRoll(redDie, blackDie);
        //checks for win state on first roll
        if (player.POINT == 7 || player.POINT == 11) {
            player.wonGame = true;
             System.out.println(player+" Wins!");
        }
        //checks for loss state on first roll
        else if (player.POINT == 2 || player.POINT == 3 || player.POINT == 12 ){
            player.lostGame = true;
            System.out.println(player+" Loses!");
        }
    }

    //logic to continue checking player point against rolled die
    public void continueRoll(Player player){
        player.rollDice(redDie, blackDie);
    }



}