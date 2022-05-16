package application.controleur;

import java.net.URL;
import java.util.ResourceBundle;
import application.modele.Environnement;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Controleur implements Initializable {
	
	final static int NbTiles = 3;
	final static String CheminTiles = "/application/ressources/tiles/";
	final static String ExtentionTiles = ".png";
	
	private Image[] tiles;
	private Environnement env;
	
    @FXML
    private TilePane panneauJeu;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		chargerTuilesRam();
		this.env = new Environnement();
		afficherMap();
		
		
	}
	
	private void afficherMap() {
		for(int i=0; i<env.getMap().size(); i++) {
			panneauJeu.getChildren().add(new ImageView(tiles[env.getMap().get(i)]));
			//tiles[env.getMap().get(i)])
			//new Image(CheminTiles + env.getMap().get(i) + ExtentionTiles))
		}
	}
	
	private void chargerTuilesRam() {
		tiles = new Image[NbTiles];
		for (int i=0; i<NbTiles; i++) {
			tiles[i] = new Image(CheminTiles + i + ExtentionTiles);
		}
	}

}
