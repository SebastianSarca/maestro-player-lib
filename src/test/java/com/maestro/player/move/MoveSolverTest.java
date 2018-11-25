package com.maestro.player.move;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MoveSolverTest {

    public static List<TestCase> testCaseList = Arrays.asList(
            new TestCase(10, 0, 2), //first move
            new TestCase(12, 0, 1), //first move
            new TestCase(13, 0, 1), //first move
            new TestCase(20, 0, 2), //first move

            new TestCase(2, 0, 1), //first move, forced bad move

            new TestCase(1, 1, 1), //winning move
            new TestCase(2, 2, 2), //winning move
            new TestCase(2, 1, 2), //winning move
            new TestCase(6, 3, 6), //winning move

            new TestCase(20, 1, 2), // normal
            new TestCase(20, 2, 2), // normal
            new TestCase(20, 6, 2), // normal

            new TestCase(19, 6, 1), //normal

            new TestCase(33, 6, 1),   // 4 would be fine, but we do a lower granularity
            new TestCase(25, 6, 1),

            new TestCase(24, 6, 3), //normal
            new TestCase(24, 1, 1),  // delay move (forced)
            new TestCase(24, 2, 3)  //normal


    );


    @Test
    public void showMove() {
        int index = 0;
        for (TestCase testCase : testCaseList) {
            assertEquals("Test index: " + index, testCase.expectedMove, testCase.move().solveMove());
            index++;
        }

    }


    private static MoveSolver createMove(int totalPieces, int opponentMove) {
        return new MoveSolverFactory().createMoveResolver(totalPieces, opponentMove);
    }

    private static class TestCase {
        private int totalPieces;
        private int opponentMove;
        private int expectedMove;

        private TestCase(int totalPieces, int opponentMove, int expectedMove) {
            this.totalPieces = totalPieces;
            this.opponentMove = opponentMove;
            this.expectedMove = expectedMove;
        }

        public MoveSolver move() {
            return createMove(totalPieces, opponentMove);
        }

        public int expectedMove() {
            return expectedMove;
        }
    }
}