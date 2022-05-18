package application.vue;

import java.io.File;
import java.net.URL;

import application.modele.Environnement;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;

public class CarteVue {
	
	final static String CheminRelatifTilesMap = "../ressources/tiles/";
	final static String ExtentionTiles = ".png";
	
	
	private Image[] tabTilesMap;
	private Environnement env;
	private int hauteur;
	private int largeur;
	private TilePane panneauJeu;
	
	public CarteVue(Environnement env, TilePane panneauJeu, int largeur, int hauteur) {
		this.panneauJeu = panneauJeu;
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.env = env;
		creerMap();
	}
	
	private void creerMap() {
		chargerTilesRam();
		for(int i=0; i<env.getMap().size(); i++)
			panneauJeu.getChildren().add(new ImageView(tabTilesMap[env.getMap().get(i)]));
	}
	
	private void chargerTilesRam() {
		URL chemin = getClass().getResource(CheminRelatifTilesMap);
		this.tabTilesMap = new Image[new File(chemin.getFile()).listFiles().length];
		for(int i=0; i<tabTilesMap.length; i++) 
			tabTilesMap[i] = new Image(chemin.toString() + i + ExtentionTiles);	
	}

}
