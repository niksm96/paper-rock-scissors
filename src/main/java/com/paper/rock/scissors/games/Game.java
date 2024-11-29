package com.paper.rock.scissors.games;

import com.paper.rock.scissors.players.Player;

public interface Game {

    /**
     * This method starts the game and lets you play n times.
     * @param numberOfPlays number of times the game is to be played before it ends
     * @param player1 is a real player
     * @param player2 is a computer
     */
    public void play(int numberOfPlays, Player player1, Player player2);


    /**
     * This method determines winner amongst the two players.
     * @param player1 is a real player
     * @param player2 is a computer
     */
    public void determineWinner(Player player1, Player player2);
}
