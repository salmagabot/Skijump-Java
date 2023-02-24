package entity;

import java.awt.image.BufferedImage;

public class Entity {
	
	public int x, y;
	public int speed;
	public int slide;
	public int jump;
	
	public BufferedImage up1, up2, down1, down2, left1, left2, right1, right2, slide1, jump1;
	public String direction;

	public int spriteCounter = 0;
	public int spriteNum = 1;

}
