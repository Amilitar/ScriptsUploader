package com.sibhtc.scriptsuploader.controllers;

import com.sibhtc.scriptsuploader.entities.classes.Configuration;
import com.sibhtc.scriptsuploader.models.MainModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * User: nikpodrivnik
 * Date: 28/10/15
 */
public class MainController implements Initializable {
    private MainModel mainModel;

    @FXML
    private MenuBar menuBar;

    @FXML
    private Accordion configurationNames;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        fileMenu.getItems().add(new MenuItem("Test"));
        menuBar.getMenus().add(fileMenu);

        mainModel = new MainModel();

        LoadConfigurations();
    }

    private void LoadConfigurations(){
        configurationNames.getPanes().clear();
        for (Configuration configuration: mainModel.getConfigurations()){
            configurationNames.getPanes().add(new TitledPane(configuration.getName(), null));
        }
    }
}
