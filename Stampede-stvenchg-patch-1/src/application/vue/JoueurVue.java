package application.vue;

import java.io.File;
import java.net.URL;

import javafx.beans.property.IntegerProperty;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class JoueurVue {
	
	final static String CheminRelatifTilesJoueur = "../ressources/sprites/";
	final static String ExtentionTiles = ".png";
	
	private Image[] tilesJoueur;
	private ImageView personageVue;
	private Pane paneCentral;
	
	private IntegerProperty Xproperty;
	private IntegerProperty Yproperty;
	
	public JoueurVue(Pane paneCentral) {

		this.paneCentral = paneCentral;
		creerJoueur();
	}
	
	private void creerJoueur() {
		chargerTilesRam();
		personageVue = new ImageView(tilesJoueur[0]);
		personageVue.autosize();
		paneCentral.getChildren().add(personageVue);
	}
	
	private void chargerTilesRam() {
		URL chemin = getClass().getResource(CheminRelatifTilesJoueur);
		this.tilesJoueur = new Image[new File(chemin.getFile()).listFiles().length];
		for(int i=0; i<tilesJoueur.length; i++) 
			tilesJoueur[i] = new Image(chemin.toString() + i + ExtentionTiles);
	}
}

