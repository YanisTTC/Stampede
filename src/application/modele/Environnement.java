package application.modele;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Environnement {
	
	final static String CheminMap = "src/application/ressources/map/Map.txt";
	private ArrayList<Integer> map;
	private int X;
	private int Y;
	
	
	public Environnement(){
		chargerMap();
		//System.out.println(mapToString());
	}
	
	
	public void chargerMap() {
		this.map = new ArrayList<>();
		int Y;
		String ligne;
		
		try {
			FileReader c = new FileReader(CheminMap);
			BufferedReader r = new BufferedReader(c);
			
			ligne = r.readLine();
			this.X = ligne.length();
			
			Y=0;
			while(ligne != null) {
				for(int i=0; i<ligne.length(); i++) 
					map.add(Character.getNumericValue(ligne.charAt(i)));
				ligne = r.readLine();
				Y++;
			}
			this.Y = Y;
		} catch (Exception e) {
			System.out.println("Erreur lecture de la Map : \"" + CheminMap + "\"");
			System.out.println(e);
		}
	}

	public String mapToString() {
		String map;
		
		map = "";
		for(int i=0; i<this.map.size(); i++) {
			if(i !=0 && i%X == 0)
				map += ("\n");
			map += (String.valueOf(this.map.get(i)));
		}
		return map;
	}


	public int getX() {
		return X;
	}


	public int getY() {
		return Y;
	}

	public ArrayList<Integer> getMap() {
		return map;
	}
	
	
}
