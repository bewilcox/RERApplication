package fr.rer.controller.main;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

/**
 * Created by Beewy on 26/06/2016.
 */
public class MainController {

    private Logger logger = LoggerFactory.getLogger(MainController.class);


    @FXML private TextField txtName;
    @FXML private TextField txtPhone;
    @FXML private TextField txtEmail;



    public void initialize() {
    }


    @PostConstruct
    public void init() {

    }

}
