package exercise_2;

import java.util.Random;

public class Dice {
    private int value;
    private final Random random;

    public Dice() {
        this.value = 0;
        random = new Random();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void roll(){
        value = random.nextInt(1, 7);
    }
}
