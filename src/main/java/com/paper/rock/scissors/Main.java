package com.paper.rock.scissors;

import com.paper.rock.scissors.games.Game;
import com.paper.rock.scissors.games.PaperRockScissorsGame;
import com.paper.rock.scissors.players.Computer;
import com.paper.rock.scissors.players.Human;
import com.paper.rock.scissors.players.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Paper-Rock-Scissors Game!");
        Scanner scanner = new Scanner(System.in);
        Game game = new PaperRockScissorsGame();
        Player human = new Human();
        Player computer = new Computer();
        boolean isValidNumber = false;
        int numberOfPlays = -1;
        while(!isValidNumber){
            System.out.println("Please enter the number of times you want to play");
            if(scanner.hasNextInt()){
                numberOfPlays = scanner.nextInt();
                isValidNumber = numberOfPlays > 0;
            }else{
                scanner.next();
            }
        }
        game.play(numberOfPlays, human, computer);
        scanner.close();
    }
}