package de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.BaseControlFlowHamsterGame;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class EmptyMouthGame extends BaseControlFlowHamsterGame {

    public EmptyMouthGame() {
        super("/territories/territoryExample05-7.ter");
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     * Do not modify!
     */
    @Override
    protected void run() {
        while (paule.grainAvailable()) {
            paule.pickGrain();
        }
        for (int i = 0; i < 11; i++) {
            paule.move();
        }
        emptyMouth();
    }
}