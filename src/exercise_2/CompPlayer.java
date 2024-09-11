package exercise_2;

import java.util.ArrayList;
import java.util.List;

public class CompPlayer implements Player {
    private List<Dice> diceList;
    private int score;
    private int index;

    public CompPlayer() {
        diceList = new ArrayList<>();
        score = 0;
        index = 0;
    }

    @Override
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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
        StringBuilder string = new StringBuilder("Бросок компьютера в раунде - ");
        diceList.forEach(dice -> string.append(dice.getValue()).append(" "));
        System.out.println(string);
    }
}
