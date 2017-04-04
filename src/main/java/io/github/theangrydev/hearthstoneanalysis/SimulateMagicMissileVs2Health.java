package io.github.theangrydev.hearthstoneanalysis;

import java.util.Random;

public class SimulateMagicMissileVs2Health {

    private static final int MAX_RUNS = 10000;

    public static void main(String[] args) {
        new SimulateMagicMissileVs2Health().run();
    }

    private void run() {
        Random random = new Random();

        int timesKilled = 0;
        int twoCostHealth;

        for (int run = 0; run < MAX_RUNS; run++) {
            twoCostHealth = 2;
            for (int missile = 0; missile < 3; missile++) {
                if (twoCostHealth > 0 && random.nextBoolean()) {
                    twoCostHealth--;
                }
            }
            if (twoCostHealth == 0) {
                timesKilled++;
            }
        }

        double probability = (double) timesKilled / MAX_RUNS;
        System.out.println("probability = " + probability);
    }
}
