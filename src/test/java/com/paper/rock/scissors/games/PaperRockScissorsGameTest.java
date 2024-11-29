package com.paper.rock.scissors.games;

import com.paper.rock.scissors.helper.Move;
import com.paper.rock.scissors.players.Computer;
import com.paper.rock.scissors.players.Human;
import com.paper.rock.scissors.players.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PaperRockScissorsGameTest {
    
    PaperRockScissorsGame paperRockScissorsGame = new PaperRockScissorsGame();
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void play() {
        PaperRockScissorsGame spyTemp = Mockito.spy(paperRockScissorsGame);
        Player player1 = Mockito.mock(Human.class);
        Player player2 = Mockito.mock(Computer.class);
        Mockito.when(player1.makeMove()).thenReturn(Move.ROCK);
        Mockito.when(player2.makeMove()).thenReturn(Move.ROCK);
        Mockito.doNothing().when(spyTemp).determineWinner(player1, player2);
        paperRockScissorsGame.play(3, player1, player2);
    }

    @Test
    void determineWinner_ifTie() {
        Player player1 = Mockito.mock(Human.class);
        Player player2 = Mockito.mock(Computer.class);
        Mockito.when(player1.makeMove()).thenReturn(Move.ROCK);
        Mockito.when(player2.makeMove()).thenReturn(Move.ROCK);
        paperRockScissorsGame.determineWinner(player1, player2);
        assertTrue(outputStreamCaptor.toString().trim().contains("It's a Tie"));
    }

    @Test
    void determineWinner_ifRealPlayerWon() {
        Player player1 = Mockito.mock(Human.class);
        Player player2 = Mockito.mock(Computer.class);
        Mockito.when(player1.makeMove()).thenReturn(Move.SCISSOR);
        Mockito.when(player2.makeMove()).thenReturn(Move.PAPER);
        paperRockScissorsGame.determineWinner(player1, player2);
        assertTrue(outputStreamCaptor.toString().trim().contains("Congratulations, you won!"));
    }

    @Test
    void determineWinner_ifComputerWon() {
        Player player1 = Mockito.mock(Human.class);
        Player player2 = Mockito.mock(Computer.class);
        Mockito.when(player1.makeMove()).thenReturn(Move.PAPER);
        Mockito.when(player2.makeMove()).thenReturn(Move.SCISSOR);
        paperRockScissorsGame.determineWinner(player1, player2);
        assertTrue(outputStreamCaptor.toString().trim().contains("Sorry, you lost!"));
    }

}