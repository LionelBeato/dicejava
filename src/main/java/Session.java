public class Session {

    //initialize the dice to play for the session

    Die redDie = new Die();
    Die blackDie = new Die();
    public boolean gameWon = false;



    //logic for the first player rolls, in the driver each player will be parsed into this method
    public void firstRollLogic(Player player) {
        player.FirstRoll(redDie, blackDie);
        //checks for win state on first roll
        if (player.point == 7 || player.point == 11) {
            player.wonGame = true;
            this.gameWon = true;
        }
        //checks for loss state on first roll
        else if (player.point == 2 || player.point == 3 || player.point == 12 ){
            player.lostGame = true;
            this.gameWon = true;
        }
    }

    //logic to continue checking player point against rolled die
    public void continueRoll(Player player){
        player.rollDice(redDie, blackDie);
        if (player.ROLL == player.point){
            player.wonGame = true;
            this.gameWon = true;
        }
        else if (player.ROLL == 7){
            player.lostGame = true;
            this.gameWon = true;
        }
    }






}