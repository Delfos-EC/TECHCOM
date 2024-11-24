package application;
import javafx.animation.Animation.Status;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.util.Duration;
import utils.Utils;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
/**
 * Clase de la ventana de juegos.
 * Maneja la lógica y  de los juegos.
 * @author Franklin C.
 * @version 1.0
 */
public class juegos {
    /**
     * Objeto obsoleto
     */
    @FXML
    private Button creditos;

    /**
     * Objeto obsoleto
     */
    @FXML
    private Button salir,exit;

    /**
     * Objeto obsoleto
     */
    @FXML
    private Button jugar;

    /**
     * Objeto obsoleto
     */
    @FXML
    private Button deepfake;

    /**
     * Objeto obsoleto
     */
    @FXML
    private Button clonacion_de_voz;

    /**
     * Metodo de cierre
     */
    @FXML
    void salir(){
        System.exit(0);
    }

}
