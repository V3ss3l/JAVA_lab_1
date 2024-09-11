import exercise_1.ReshenieKvadratnihUravnenii;
import exercise_2.DiceGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ReshenieKvadratnihUravnenii.reshenie();
        DiceGame diceGame = new DiceGame();
        diceGame.startGame();
    }
}
