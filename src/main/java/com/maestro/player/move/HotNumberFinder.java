package com.maestro.player.move;

public class HotNumberFinder {

    public int findSmallerOrEqualHotNumber(int number) {
        int index = 1;
        int hotNumber;
        int candidateHotNumber = 1;
        do {
            hotNumber = findHotNumberByIndex(index);
            if (hotNumber == number) {
                return hotNumber;
            }
            if (hotNumber > number) {
                return candidateHotNumber;
            } else {
                candidateHotNumber = hotNumber;
            }
            index++;
        } while (true);
    }


    private int findHotNumberByIndex(int index) {
        return (int) Math.floor(Math.pow((1 + Math.sqrt(5)) / 2, index) / Math.sqrt(5) + 0.5);
    }

}
