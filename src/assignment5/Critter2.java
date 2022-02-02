/* CRITTERS GUI Critter2.java
 * EE422C Project 5 submission by
 * Nicholas Taylor
 * Fall 2020
 */

package assignment5;

import assignment5.Critter.TestCritter;
import javafx.scene.paint.Color;

import java.util.List;

/**
 * Mama Bear, reproduces every doTimeStep and always fights in encounters
 */
public class Critter2 extends Critter {

    @Override
    public void doTimeStep() {
        Critter2 cub = new Critter2();
        reproduce(cub, getRandomInt(8));
    }

    @Override
    public boolean fight(String opponent) { return true; }

    @Override
    public String toString() {
        return "2";
    }

    @Override
    public CritterShape viewShape() { return CritterShape.SQUARE; }

    @Override
    public javafx.scene.paint.Color viewColor() { return Color.PINK; }
}