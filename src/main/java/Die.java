public class Die {

    //pits on the top face for roll
    private int pits;

    //something that sets pit value

    //function to get pit value
    public int getPits(){
        pits = getRand();
        return this.pits;
    }


    //function that gets a random number between 1 through 6 inclusively.
    public int getRand() {
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        return rand;
    }

    //constructor
    public Die (){

    }

    @Override
    public String toString() {
        return "You rolled a " + getPits();
    }
}
