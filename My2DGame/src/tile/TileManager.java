package tile;

import java.awt.Graphics2D;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class TileManager {
	
	GamePanel gp;
	Tile[] tile;
	
	public TileManager(GamePanel gp) {
		
		this.gp = gp;
		
		tile = new Tile[10];
		
		getTileImage();
		
	}
	
	public void getTileImage() {
		
		try {
			
			 tile[0] = new Tile();
			 tile[0].image = ImageIO.read(getClass().getResourceAsStream("/tiles/slope30.png"));
			 
			 tile[1] = new Tile();
			 tile[1].image = ImageIO.read(getClass().getResourceAsStream("/tiles/slope11.png"));
			 
			 tile[2] = new Tile();
			 tile[2].image = ImageIO.read(getClass().getResourceAsStream("/tiles/fall.png"));
	
			 tile[3] = new Tile();
			 tile[3].image = ImageIO.read(getClass().getResourceAsStream("/tiles/bigslope.png"));
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void draw(Graphics2D g2) {
		
		//Inrun row of slope and squares
		g2.drawImage(tile[0].image, 0, 48, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 0, 96, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 0, 144, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 0, 192, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 0, 240, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 0, 288, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 0, 336, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 0, 384, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 0, 432, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 0, 480, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 0, 528, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 0, 576, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 0, 624, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 0, 672, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 0, 720, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 0, 768, gp.tileSize, gp.tileSize, null);
		
		//Inrun row of slope and squares
		g2.drawImage(tile[0].image, 48, 83, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 48, 131, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 48, 144, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 48, 192, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 48, 240, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 48, 288, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 48, 336, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 48, 384, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 48, 432, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 48, 480, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 48, 528, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 48, 576, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 48, 624, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 48, 672, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 48, 720, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 48, 768, gp.tileSize, gp.tileSize, null);
		
		//Inrun row of slope and squares
		g2.drawImage(tile[0].image, 96, 118, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 96, 166, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 96, 192, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 96, 240, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 96, 288, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 96, 336, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 96, 384, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 96, 432, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 96, 480, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 96, 528, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 96, 576, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 96, 624, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 96, 672, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 96, 720, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 96, 768, gp.tileSize, gp.tileSize, null);
		
		//Inrun row of slope and squares
		g2.drawImage(tile[0].image, 144, 153, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 144, 201, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 144, 240, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 144, 288, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 144, 336, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 144, 384, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 144, 432, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 144, 480, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 144, 528, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 144, 576, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 144, 624, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 144, 672, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 144, 720, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 144, 768, gp.tileSize, gp.tileSize, null);
		
		//Inrun row of slope and squares
		g2.drawImage(tile[0].image, 192, 188, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 192, 236, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 192, 240, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 192, 288, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 192, 336, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 192, 384, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 192, 432, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 192, 480, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 192, 528, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 192, 576, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 192, 624, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 192, 672, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 192, 720, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 192, 768, gp.tileSize, gp.tileSize, null);
		
		
		//Inrun row of slope and squares
		g2.drawImage(tile[0].image, 240, 223, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 240, 271, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 240, 288, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 240, 336, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 240, 384, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 240, 432, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 240, 480, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 240, 528, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 240, 576, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 240, 624, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 240, 672, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 240, 720, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 240, 768, gp.tileSize, gp.tileSize, null);
		
		//Inrun row of slope and squares
		g2.drawImage(tile[0].image, 288, 258, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 288, 306, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 288, 336, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 288, 384, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 288, 432, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 288, 480, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 288, 528, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 288, 576, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 288, 624, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 288, 672, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 288, 720, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 288, 768, gp.tileSize, gp.tileSize, null);
		
		//Inrun row of slope and squares
		g2.drawImage(tile[0].image, 336, 293, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 336, 341, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 336, 384, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 336, 432, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 336, 480, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 336, 528, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 336, 576, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 336, 624, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 336, 672, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 336, 720, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 336, 768, gp.tileSize, gp.tileSize, null);
		
		//Inrun row of slope and squares
		g2.drawImage(tile[0].image, 346, 300, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 346, 348, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 346, 384, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 346, 432, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 346, 480, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 346, 528, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 346, 576, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 346, 624, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 346, 672, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 346, 720, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 346, 768, gp.tileSize, gp.tileSize, null);
		
		//Jump row of slope and squares
		g2.drawImage(tile[1].image, 378, 307, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 378, 355, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 378, 384, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 378, 432, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 378, 480, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 378, 528, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 378, 576, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 378, 624, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 378, 672, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 378, 720, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 378, 768, gp.tileSize, gp.tileSize, null);
		
		
		//Landing slope
		g2.drawImage(tile[3].image, 426, 223, gp.bigTileSize, gp.bigTileSize, null);
		g2.drawImage(tile[2].image, 426, 768, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 474, 768, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 522, 768, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 570, 768, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 618, 768, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 666, 768, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 714, 768, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 762, 768, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 810, 768, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 858, 768, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 906, 768, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 954, 768, gp.tileSize, gp.tileSize, null);
		
		g2.drawImage(tile[2].image, 1002, 768, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1050, 768, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1098, 768, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1146, 768, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1194, 768, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1242, 768, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1290, 768, gp.tileSize, gp.tileSize, null);
		
		g2.drawImage(tile[2].image, 1002, 720, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1050, 720, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1098, 720, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1146, 720, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1194, 720, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1242, 720, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1290, 720, gp.tileSize, gp.tileSize, null);
		
		g2.drawImage(tile[2].image, 1002, 678, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1050, 672, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1098, 672, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1146, 672, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1194, 672, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1242, 672, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1290, 672, gp.tileSize, gp.tileSize, null);
		
		g2.drawImage(tile[2].image, 1002, 637, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1050, 637, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1098, 637, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1146, 637, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1194, 637, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1242, 637, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image, 1290, 637, gp.tileSize, gp.tileSize, null);
		
	
	}

}
