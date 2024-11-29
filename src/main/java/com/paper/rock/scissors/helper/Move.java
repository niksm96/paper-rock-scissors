package com.paper.rock.scissors.helper;

public enum Move {

    PAPER,
    ROCK,
    SCISSOR;

    /**
     * Validates the moves
     * @param inputMove moves of a real player
     * @return true/false : if the move is valid and is part of the enum.
     */
    public static boolean validateMoves(String inputMove) {
        for (Move move : values()) {
            if (move.name().equalsIgnoreCase(inputMove)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Game strategy to determine which move has won.
     * @param playerMove1 moves of a real player.
     * @param playerMove2 moves of a computer.
     * @return true/false: if the moves of a real player has won or not.
     */
    public static boolean gameStrategy(Move playerMove1, Move playerMove2){
        if (playerMove1.name().equalsIgnoreCase(ROCK.name())) {
            return playerMove2.name().equalsIgnoreCase(SCISSOR.name());
        } else if (playerMove1.name().equalsIgnoreCase(PAPER.name())) {
            return playerMove2.name().equalsIgnoreCase(ROCK.name());
        } else {
            return playerMove2.name().equalsIgnoreCase(PAPER.name());
        }
    }
}
