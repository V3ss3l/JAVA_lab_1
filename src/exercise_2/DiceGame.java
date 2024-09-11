package exercise_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiceGame {

    private final Scanner scanner;
    private final int countOfRounds = 7;
    private int countOfDicesPerRound;
    private int countOfPlayers;
    private List<Player> listOfPlayers;

    public DiceGame() {
        this.scanner = new Scanner(System.in);
        countOfDicesPerRound = 2;
        countOfPlayers = 2;
        listOfPlayers = new ArrayList<>(countOfPlayers);
    }

    public void startGame(){
        int buff = 0;
        System.out.println("-------Начинается игра в кости-------");
        System.out.println("\tВведите количество игроков");
        buff = scanner.nextInt();
        countOfPlayers = buff == 0 ? 2 : buff;
        System.out.println("\tВведите количество костей за раунд");
        buff = scanner.nextInt();
        countOfDicesPerRound = buff == 0 ? 2 : buff;
        for(int i = 0; i < countOfPlayers; i++){
            if(i == countOfPlayers - 1)
                listOfPlayers.add(new CompPlayer());
            else
                listOfPlayers.add(new HumanPlayer());
        }
        for(int i = 0; i < countOfRounds; i++){
            System.out.printf("---- Начинается раунд %s ----\n", i+1);
            Player player = playRound();
            if(player instanceof CompPlayer) System.out.printf("---- Победил КОМПЬЮТЕР с очками - %s\n", player.getScore());
            else System.out.printf("---- Победил игрок с очками - %s\n", player.getScore());
            listOfPlayers.remove(player);
            listOfPlayers.add(0, player);
        }
    }


    private Player playRound(){
        int finalScore = 0;
        Player buffPlayer = new HumanPlayer();
        for(Player player: listOfPlayers){
            var buff = player.getScore();
            player.rollDices(countOfDicesPerRound);
            var currentScore = player.updateScore(buff);
            player.roundRoll();
            if(currentScore > finalScore){
                finalScore =currentScore;
                buffPlayer = player;
            }
        }
        return buffPlayer;
    }


}
