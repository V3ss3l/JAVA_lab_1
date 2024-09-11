package exercise_2;

public interface Player {

    int getScore();

    int updateScore(int roundScore);

    void rollDices(int countOfDices);

    void roundRoll();
}