package com.leytonblackler.chromolite.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class GeneralOptionsController implements Initializable {

    @FXML
    private ToggleButton saveButton;

    @FXML
    private ToggleButton loadButton;

    @FXML
    private ToggleButton resetButton;

    @FXML
    private ToggleButton razerButton;

    @FXML
    public ImageView razerLogo;
    private Image[] razerLogoImages = new Image[2];

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        razerLogoImages[0] = new Image(getClass().getClassLoader().getResource("images/razer_logo_light.png").toExternalForm());
        razerLogoImages[1] = new Image(getClass().getClassLoader().getResource("images/razer_logo_dark.png").toExternalForm());
        razerLogo.setImage(razerLogoImages[0]);
    }

    @FXML
    private void saveButtonClicked() {
        //
    }

    @FXML
    private void loadButtonClicked() {
        //
    }

    @FXML
    private void resetButtonClicked() {
        //
    }

    @FXML
    private void razerButtonClicked() {
        System.out.println("razer");
        if (razerButton.selectedProperty().get()) {
            razerLogo.setImage(razerLogoImages[1]);
        } else {
            razerLogo.setImage(razerLogoImages[0]);
        }
    }
}
