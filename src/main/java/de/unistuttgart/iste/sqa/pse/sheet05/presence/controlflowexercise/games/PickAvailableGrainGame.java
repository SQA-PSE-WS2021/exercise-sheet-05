package de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.BaseControlFlowHamsterGame;

import java.util.Optional;

public class PickAvailableGrainGame extends BaseControlFlowHamsterGame {

    public PickAvailableGrainGame() {
        super("/territories/territoryExample05-1.ter");
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     * Do not modify!
     */
    @Override
    protected void run() {
        for (int i = 0; i < 10; i++) {
            pickGrainIfAvailable();
            paule.move();
        }
    }
}
