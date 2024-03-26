package zelda_mini_clone;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {
	public static BufferedImage spritesheet;
	public static BufferedImage tileWall;
	public static BufferedImage[] player_front;
	public static BufferedImage[] inimigo_front;
	
	public Spritesheet() {
		try {
		spritesheet = ImageIO.read(getClass().getResource("/aula05-spritesheet.png"));
		}catch (IOException e) {
			e.printStackTrace();
		}
		player_front= new BufferedImage[2];
		player_front[0]= Spritesheet.getSprite(3, 12, 16, 16);
		player_front[1]= Spritesheet.getSprite(21, 12, 16, 16);
		inimigo_front= new BufferedImage[2];
		inimigo_front[0]= Spritesheet.getSprite(152, 216, 16, 16);
		inimigo_front[1]= Spritesheet.getSprite(169, 216, 16, 16);
		tileWall = Spritesheet.getSprite(277, 218, 16, 16);
	}
	
	public static BufferedImage getSprite(int x, int y, int width, int height ) {
		return spritesheet.getSubimage(x, y, width, height);
	}
}
