package com.paper.rock.scissors.games;

import com.paper.rock.scissors.helper.Move;
import com.paper.rock.scissors.players.Player;

public class PaperRockScissorsGame implements Game {

    @Override
    public void play(int numberOfPlays, Player player1, Player player2) {
        while(numberOfPlays > 0){
            determineWinner(player1, player2);
            numberOfPlays--;
        }
    }

    @Override
    public void determineWinner(Player player1, Player player2) {
        Move moveOfPlayer1 = player1.makeMove();
        Move moveOfPlayer2 = player2.makeMove();
        if(moveOfPlayer1.equals(moveOfPlayer2)){
            System.out.println("It's a Tie");
        } else if (Move.gameStrategy(moveOfPlayer1, moveOfPlayer2)) {
            System.out.println("Congratulations, you won!");
        }else{
            System.out.println("Sorry, you lost!");
        }
    }
}
