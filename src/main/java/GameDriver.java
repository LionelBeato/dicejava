import java.util.ArrayList;
import java.util.List;

public class GameDriver {

    //initialize new Dice to roll and players to play


    public static void main(String[] args) {

        Session newGame = new Session();

        //boolean fullGameWon =

        //boolean to check if game is on first round
        boolean onFirst = true;

        //instantiating player, I can add as many as I want!
        Player playerOne = new Player("Player 1");
        Player playerTwo = new Player("Player 2");

        //Arraylist for looping through player turns
        List<Player> Players = new ArrayList<>();
        Players.add(playerOne);
        Players.add(playerTwo);

        //while loop that runs while the game isn't won
        while (newGame.gameWon == false) {


            //while loop that checks if game is on first round
            while(onFirst) {

                for (Player p : Players) {
                    newGame.firstRollLogic(p);
                    onFirst = false;
                    if (newGame.gameWon == true){
                        System.out.println(p+" won!");
                        break;
                    }
                }
            }

            if (newGame.gameWon == false){
                    for (Player p : Players) {
                        newGame.continueRoll(p);
                        if (newGame.gameWon == true){
                            System.out.println(p+" won!");
                            break;
                        }
                    }
                }

        }




    }
}



