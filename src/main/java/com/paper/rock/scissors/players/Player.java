package com.paper.rock.scissors.players;

import com.paper.rock.scissors.helper.Move;

public interface Player {

    /**
     * Makes a player make a move.
     * @return Move
     */
    public Move makeMove();
}
