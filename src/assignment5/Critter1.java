/* CRITTERS GUI Critter1.java
 * EE422C Project 5 submission by
 * Nicholas Taylor
 * Fall 2020
 */

package assignment5;

import assignment5.Critter.TestCritter;
import javafx.scene.paint.Color;

import java.util.List;

/**
 * Predator, looks and runs around trying to find critters and always fights.
 */
public class Critter1 extends Critter {

    @Override
    public void doTimeStep() {
        int direction = getRandomInt(8);
        if(look(direction, true) != null) {
            run(direction);
        } else {
            run(getRandomInt(8));
        }

    }

    @Override
    public boolean fight(String opponent) { return true;
    }

    @Override
    public String toString() {
        return "1";
    }

    @Override
    public CritterShape viewShape() { return CritterShape.STAR; }

    @Override
    public javafx.scene.paint.Color viewColor() { return Color.BLACK; }

}
