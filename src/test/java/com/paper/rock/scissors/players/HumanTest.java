package com.paper.rock.scissors.players;

import com.paper.rock.scissors.helper.Move;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void makeMove() {
        provideInput("rock");
        Player player = new Human();
        Move move  = player.makeMove();
        assertTrue("rock".equalsIgnoreCase(move.name()));
    }

    private void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }
}