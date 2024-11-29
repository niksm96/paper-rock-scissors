package com.paper.rock.scissors.players;

import com.paper.rock.scissors.helper.Move;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Disabled
    @Test
    void makeMove() {
        Player player = new Computer();
        Move move = player.makeMove();
        assertEquals(Move.ROCK, move);
    }
}