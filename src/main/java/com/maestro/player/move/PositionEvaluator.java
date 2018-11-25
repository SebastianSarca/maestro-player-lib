package com.maestro.player.move;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PositionEvaluator {

    private Logger logger = LoggerFactory.getLogger(PositionEvaluator.class);

    private HotNumberFinder calculator;

    public PositionEvaluator(HotNumberFinder calculator) {
        this.calculator = calculator;
    }


    public Evaluation evaluate(int pieces) {
        int nextHotNumber = calculator.findSmallerOrEqualHotNumber(pieces);
        if (isTotalHot(pieces, nextHotNumber)) {
            logger.info("Need to pick from a hot number. Trying to delay, by picking 1 piece...");
            return Evaluation.createHot(calculator.findSmallerOrEqualHotNumber(pieces - 1));
        }

        return Evaluation.create(nextHotNumber, pieces - nextHotNumber);
    }

    private boolean isTotalHot(int pieces, int hotNumber) {
        return pieces == hotNumber;
    }
}
