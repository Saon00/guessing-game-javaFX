package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.util.Random;

public class Controller {

    @FXML
    private TextField playerName;

    @FXML
    private TextField guessNumber;

    @FXML
    private JFXButton submitButton;

    @FXML
    private Label winNumber;

    @FXML
    private Label loseNumber;

    @FXML
    private Label chancesMessage;

    @FXML
    private Label messageLabel;

    int totalChances = 3;
    int randomNumber;

    public void setRandomNumber() {
        randomNumber = new Random().nextInt(10) + 1;
    }

    // Initializing Random Number as Constructor.
    public Controller() {
        setRandomNumber();
    }


    @FXML
    void submitNumber(ActionEvent event) {

        try {
            String plName = playerName.getText();
            String guessNumberString = guessNumber.getText();
            int guessNumberInt = Integer.parseInt(guessNumberString);

            if (randomNumber == guessNumberInt) {
                JOptionPane.showMessageDialog(null, "Congratulations " + plName + ", !! You WIN :)");
                totalChances = 3;
                setRandomNumber();
                setChancesMessage();
                setWinNumber();
                messageLabel.setText(null);
            } else if (guessNumberInt < randomNumber) {
                if (guessNumberInt < 1) {
                    JOptionPane.showMessageDialog(null, plName + ", Try to guess between 1 to 10.");
                } else {
                    totalChances--;
                    messageLabel.setText(plName + ", Guess more Higher");
                    setChancesMessage();
                }

            } else if (guessNumberInt > randomNumber) {
                if (guessNumberInt > 10) {
                    JOptionPane.showMessageDialog(null, plName + ", Try to guess between 1 to 10.");
                } else {
                    totalChances--;
                    messageLabel.setText(plName + ", Guess more Lower");
                    setChancesMessage();
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "INVALID INPUT");
        }
        guessNumber.clear();
        if (totalChances == 0) {
            JOptionPane.showMessageDialog(null, playerName.getText() + ", You Lose. Correct Number was " + randomNumber);
            totalChances = 3;
            setChancesMessage();
            setRandomNumber();
            messageLabel.setText(null);
            setLoseNumber();
        }
    }

    public void setChancesMessage() {
        chancesMessage.setText("You've " + totalChances + " more Chance(s)");
    }


    /* the following part can be done in different way as i used before in "totalChances".
    but i wanted to use some different implementations to check that everything i learned,
    is really useful.
     */
    public void setWinNumber() {
        String wn = winNumber.getText();
        int wnInt = Integer.parseInt(wn);
        wnInt++;
        String wnStr = String.valueOf(wnInt);
        winNumber.setText(wnStr);
    }

    public void setLoseNumber() {
        String ln = loseNumber.getText();
        int lnInt = Integer.parseInt(ln);
        lnInt++;
        String lnStr = String.valueOf(lnInt);
        loseNumber.setText(lnStr);
    }


}
