package com.maestro.player.move;

public class MoveSolverFactory {

    public MoveSolver createMoveResolver(int totalPieces, int lastPickByOpponent) {
        return new MoveSolver(totalPieces, lastPickByOpponent, new PositionEvaluator(new HotNumberFinder()));

    }
}
