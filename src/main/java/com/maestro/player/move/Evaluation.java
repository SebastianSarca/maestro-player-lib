package com.maestro.player.move;

public class Evaluation {

    private boolean isHot;

    private int nextTarget;

    private int nextIncrement;

    private Evaluation(boolean isHot, int nextTarget, int nextIncrement) {
        this.isHot = isHot;
        this.nextTarget = nextTarget;
        this.nextIncrement = nextIncrement;
    }

    public static Evaluation createHot(int nextTarget) {
        return new Evaluation(true, nextTarget, 1);
    }

    public static Evaluation create(int nextTarget, int nextIncrement) {
        return new Evaluation(false, nextTarget, nextIncrement);
    }

    public int getNextIncrement() {
        return nextIncrement;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Evaluation{");
        sb.append("isHot=").append(isHot);
        sb.append(", nextTarget=").append(nextTarget);
        sb.append(", nextIncrement=").append(nextIncrement);
        sb.append('}');
        return sb.toString();
    }
}
