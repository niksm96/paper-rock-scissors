package com.paper.rock.scissors.players;

import com.paper.rock.scissors.helper.Move;

import java.util.Random;

public class Computer implements Player {

    /**
     * Player here is a computer, which randomly selects among rock, paper or scissors
     * to play against the human player.
     * @return Move
     */
    @Override
    public Move makeMove() {
        Move move =  Move.values()[new Random(System.currentTimeMillis()).nextInt(Move.values().length)];
        System.out.println("Computer played : " + move.name());
        return move;
    }
}
