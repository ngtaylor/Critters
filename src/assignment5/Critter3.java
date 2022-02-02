/* CRITTERS GUI Critter3.java
 * EE422C Project 5 submission by
 * Nicholas Taylor
 * Fall 2020
 */

package assignment5;

import assignment5.Critter.TestCritter;
import javafx.scene.paint.Color;

import java.util.List;

/**
 * Lover, reproduces during a fight then runs away.
 */
public class Critter3 extends Critter {

    @Override
    public void doTimeStep() {
    }

    @Override
    public boolean fight(String opponent) {
        Critter baby = new Critter3();
        reproduce(baby, getRandomInt(8));
        run(getRandomInt(8));
        return false;
    }

    @Override
    public String toString() {
        return "3";
    }

    @Override
    public CritterShape viewShape() { return CritterShape.DIAMOND; }

    @Override
    public javafx.scene.paint.Color viewColor() { return Color.RED; }
}