/* CRITTERS GUI Critter4.java
 * EE422C Project 5 submission by
 * Nicholas Taylor
 * Fall 2020
 */

package assignment5;

import assignment5.Critter.TestCritter;
import javafx.scene.paint.Color;

import java.util.List;

/**
 * Monk, always walks. if in an encounter they look around for an empty spot to walk to and
 * not fight, otherwise Monk only fights when fully surrounded with no way out.
 */
public class Critter4 extends Critter {

    @Override
    public void doTimeStep() {walk(getRandomInt(8)); }

    @Override
    public boolean fight(String opponent) {
        for(int direction = 0; direction < 8; direction++){
            if(look(direction, false) == null){
                walk(direction);
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "4";
    }

    @Override
    public CritterShape viewShape() { return CritterShape.TRIANGLE; }

    @Override
    public javafx.scene.paint.Color viewColor() { return Color.YELLOW; }

}