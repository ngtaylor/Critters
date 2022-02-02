/*
 * CRITTERS Critter1.java
 * EE422C Project 4 submission by
 * Nicholas Taylor
 */

package assignment4;

import assignment4.Critter.TestCritter;
import java.util.List;

/**
 * Predator, runs around and always fights.
 */
public class Critter1 extends Critter {

    @Override
    public void doTimeStep() {run(getRandomInt(8)); }

    @Override
    public boolean fight(String opponent) {
        return true;
    }

    @Override
    public String toString() {
        return "1";
    }

}
