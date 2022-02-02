/* CRITTERS GUI Main.java
 * EE422C Project 5 submission by
 * Nicholas Taylor
 * Fall 2020
 */

package assignment5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.List;

import static assignment5.Critter.*;
import static java.lang.Integer.parseInt;

public class Main extends Application {
    public GridPane world;
    public Button create;
    public TextField numCritText;
    public TextField createName;


    public Button timeStepButton;
    public TextField timeStepsTxt;

    public TextField statsName;
    public Button runStatButton;

    public Button seedButton;
    public TextField seedTxt;

    public Button quit;
    public TextField statOutBox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene1 = new Scene(root, 800, 600);
        primaryStage.setTitle("Critters");
        primaryStage.setScene(scene1);
        primaryStage.show();

    }


    public void callCreateCritter(MouseEvent mouseEvent) throws InvalidCritterException {
        String className = createName.getText();
        String stringNum = numCritText.getText();
        int numCreate = parseInt(stringNum);

        for(int i = 0; i < numCreate; i++){
            Critter.createCritter(className);
        }
        Critter.displayWorld(world);
    }

    public void completeSteps(MouseEvent mouseEvent) {
        int numTimeSteps = parseInt(timeStepsTxt.getText());
        for(int i = 0; i < numTimeSteps; i++){
            Critter.worldTimeStep();
        }
        Critter.displayWorld(world);
    }

    public void displayStats(MouseEvent mouseEvent) throws InvalidCritterException {
        String className = statsName.getText();
        List<Critter> toRunStat = getInstances(className);
        String stats = Critter.runStats(toRunStat);
        statOutBox.setText(stats);
    }

    public void callSetSeed(MouseEvent mouseEvent) {
        int seed = parseInt(seedButton.getText());
        Critter.setSeed(seed);
    }

    public void quitProgram(MouseEvent mouseEvent) {
        System.exit(0);
    }

}