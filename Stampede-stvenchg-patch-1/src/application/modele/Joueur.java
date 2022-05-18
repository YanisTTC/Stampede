package application.modele;

public class Joueur {

	private int X;
	private int Y;
	private int vitesseD;
	private int vie;
	private Environnement env;
	
	public Joueur(Environnement env) {
		this.env = env;
		this.X = env.getLargeur()/2;
		this.Y = env.getHauteur()/2;
		this.vie = 12;
		this.vitesseD = 5;
	}
	
	public void deplacerDroite() {
		this.X += this.vitesseD;
	}
	
	public void deplacerGauche() {
		this.X -= this.vitesseD;
	}
	
	public int getVie() {
		return this.vie;
	}
	
	public int vitesseD() {
		return this.vitesseD;
	}
	
}
