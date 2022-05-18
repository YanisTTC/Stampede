package application.controleur;


import java.net.URL;
import java.util.ResourceBundle;

import application.modele.Environnement;
import application.vue.CarteVue;
import application.vue.JoueurVue;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.util.Duration;

public class ControleurVueJeu implements Initializable{
	
	private Environnement env;
	private CarteVue map;
	private JoueurVue joueurV;
	

	
    @FXML
    private TilePane panneauJeu;
    @FXML
    private Pane paneCentral;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
    	this.env = new Environnement();

    	this.map = new CarteVue(env, panneauJeu, 56, 31);
    	this.joueurV = new JoueurVue(paneCentral);
    	
    	
	}

	




}
