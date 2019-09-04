import org.junit.Test;

import static org.junit.Assert.*;

public class DieTest {

    Die redDie = new Die();
    Die blackDie = new Die();

    @Test
    public void getPits() {
        System.out.println(redDie);
    }

    @Test
    public void getRand() {
        System.out.println(redDie.getPits());
        System.out.println(blackDie.getPits());
    }
}