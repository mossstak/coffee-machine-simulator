package com.coffeemachine;

public class EspressoMachine {
    public int brewCoffee(Coffee coffee, int grindLevel) {
        int extractionTime = calculateExtractionTime(grindLevel);
        System.out.println("Brewing " + coffee.getName() + " with " + coffee.getWater() + "ml of water.");
        System.out.println("Extraction time: " + extractionTime + " seconds");
        // Simulate brewing process
        return extractionTime;
    }

    private int calculateExtractionTime(int grindLevel) {
        // Simulate extraction time based on grind level
        // Finer grind (level 1) results in longer extraction time, coarser grind (level 10) results in shorter extraction time
        return 28 + (10 - grindLevel) * 1; // Example: Level 1 -> 37 seconds, Level 10 -> 28 seconds
    }
}
