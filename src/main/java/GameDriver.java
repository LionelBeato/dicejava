import java.util.ArrayList;
import java.util.List;

public class GameDriver {

    //initialize new Dice to roll and players to play


    public static void main(String[] args) {

        Session newGame = new Session();

        boolean fullGameWon = false;

        Player playerOne = new Player();
        Player playerTwo = new Player();

        List<Player> Players = new ArrayList<>();
        Players.add(playerOne);
        Players.add(playerTwo);

        while (!fullGameWon){

            for (Player playerElement: Players){

                //does the initial roll
                newGame.firstRollLogic(playerElement);

                if (playerElement.wonGame == true){
                    fullGameWon = true;
                }
                else if (playerElement.lostGame == true){
                    fullGameWon = true;
                }

            }


        }



    }
}
