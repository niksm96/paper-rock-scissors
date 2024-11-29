package com.paper.rock.scissors.players;

import com.paper.rock.scissors.helper.Move;

import java.util.Scanner;

public class Human implements Player {

    /**
     * Player here is a human, which takes an input from the human for rock, paper & scissors
     * and validate the moves.
     * @return Move
     */
    @Override
    public Move makeMove() {
        String move = "";
        Scanner scanner = new Scanner(System.in);
        boolean isMoveValid = false;
        while(!isMoveValid){
            System.out.println("Please enter one of the options: paper, rock or scissor");
            if(scanner.hasNext()){
                move = scanner.nextLine();
                isMoveValid = Move.validateMoves(move);
            }else{
                scanner.next();
            }
        }
        return Move.valueOf(move.toUpperCase());
    }

}
