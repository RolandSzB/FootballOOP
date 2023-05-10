package football;

import java.util.Random;

public class Minge {
	
	private int x;
	private int y;
	
	public Minge(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void suteaza() throws Exception {
        Random random = new Random();

        int newX = this.x + random.nextInt(5) - 2;
        int newY = this.y + random.nextInt(5) - 2;

        if (newY == 0 || newY == 50) {
            throw new Exception("Out");
        }

        if ((this.x == 0 && newY >= 20 && newY <= 30) || (this.x == 100 && newY >= 20 && newY <= 30)) {
            throw new Exception("Gol");
        }

        if ((this.x == 0 || this.x == 100) && (newY < 20 || newY > 30)) {
            throw new Exception("Corner");
        }
        this.x = newX;
        this.y = newY;
    }
	

}
