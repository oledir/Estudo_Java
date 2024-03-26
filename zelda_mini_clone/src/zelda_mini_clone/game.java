package zelda_mini_clone;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class game extends Canvas implements Runnable, KeyListener{
	public static int WIDTH = 640 , HEIGHT = 480;
	public static int scale = 3;
	public player player;
	public static World world;
	public Blocks block;
	public static List<Inimigo> inimigos = new ArrayList<Inimigo>();
	
	public game() {
		this.addKeyListener(this);
		this.setPreferredSize(new Dimension(WIDTH , HEIGHT ));
		new Spritesheet();
		
		player = new player(32,32);
		world  =  new World();
		block = new Blocks(0,0);
		
		inimigos.add(new Inimigo(32,32));
	}
	
	public void tick() {
		player.tick();
		for(int i=0; i<inimigos.size(); i++) {
			inimigos.get(i).tick();
		}
	}
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g= bs.getDrawGraphics();
		g.setColor(new Color(0,135,13));
		g.fillRect(0,0,WIDTH*scale,HEIGHT*scale);
		player.render(g);
		
		
		world.render(g);
		block.render(g);
		for(int i=0; i<inimigos.size(); i++) {
			inimigos.get(i).render(g);
		}
		bs.show();
		
	}
	
	public static void main(String [] args) {
		game game = new game();
		JFrame frame = new JFrame();
		
		frame.add(game);
		frame.setTitle("Mini-Zelda");
		frame.pack();
		frame.setLocationRelativeTo(null);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		new Thread(game).start();
	}
	public void run() {
		while(true) {
			tick();
			render();
			try {
				Thread.sleep(1000/60);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_LEFT) {
			player.left= true;
		}else if (e.getKeyCode()== KeyEvent.VK_RIGHT) {
			player.right=true;
		}
		if(e.getKeyCode()== KeyEvent.VK_UP) {
			player.up= true;
		}else if (e.getKeyCode()== KeyEvent.VK_DOWN) {
			player.down=true;
		}
	}
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_LEFT) {
			player.left= false;
		}else if (e.getKeyCode()== KeyEvent.VK_RIGHT) {
			player.right=false;
		}
		if(e.getKeyCode() == KeyEvent.VK_Z) {
			player.shoot= true;
		}
		
		
		if(e.getKeyCode()== KeyEvent.VK_UP) {
			player.up= false;
		}else if (e.getKeyCode()== KeyEvent.VK_DOWN) {
			player.down=false;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
