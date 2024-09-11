package exercise_2;

import java.util.ArrayList;
import java.util.List;

public class HumanPlayer implements Player {
    private List<Dice> diceList;
    private int score;

    public HumanPlayer() {
        this.diceList = new ArrayList<>();
        this.score = 0;
    }

    @Override
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }



    @Override
    public int updateScore(int roundScore){
        if(!diceList.isEmpty()) {
            score += roundScore;
            diceList.stream().forEach(dice -> score += dice.getValue());
        }
        return score;
    }

    @Override
    public void rollDices(int countOfDices){
        diceList.clear();
        var buffList = new ArrayList<Dice>(countOfDices);
        for(int i = 0; i < countOfDices; i++){
            Dice buffDice = new Dice();
            buffDice.roll();
            buffList.add(i, buffDice);
        }
        diceList.addAll(buffList);
    }

    public void roundRoll(){
        StringBuilder string = new StringBuilder("Бросок в раунде - ");
        diceList.forEach(dice -> string.append(dice.getValue()).append(" "));
        System.out.println(string);
    }
}
