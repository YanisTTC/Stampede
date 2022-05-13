package fr.game.stampede.modele;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TileMaps {
	private static final int HEIGHT = 0;

	private void constructionMap() {
		InputStream is = getClass().getResourceAsStream("/tiles/TileMap.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line;
		String[] tabLine;
		for (int i = 0; i < HEIGHT; i++) {
			try {
				line = br.readLine();
			}
		}
	}
}
