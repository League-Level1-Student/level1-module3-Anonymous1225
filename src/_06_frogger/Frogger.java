package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
	static final int WIDTH = 810;
	static final int HEIGHT = 600;
	private static final int SPACE = 0;
	int x = 360;
	int y = 540;
	Cat sam;
	Cat sim;

	@Override
	public void settings() {
		size(810, 600);
	}

	@Override
	public void setup() {
		sam = new Cat(0, 400, 90, 6);
		sim = new Cat(0, 600, 90 ,6);
	}

	public void keyPressed() {
		if (key == CODED) {
			if (keyCode == UP) {
				// Frog Y position goes up
				y -= 10;
			} else if (keyCode == DOWN) {
				y += 10;
				// Frog Y position goes down
			} else if (keyCode == RIGHT) {
				// Frog X position goes right
				x += 10;
			} else if (keyCode == LEFT) {
				// Frog X position goes left
				x -= 10;
			}
			inside();
			System.out.println(x);
		}
	}

	public void inside() {
		if (x >= 765) {
			x = 765;
			keyCode=SPACE;
		}
		if (x <= 0) {
			x = 0;
		}
		if (y >= 540) {
			y = 540;
		}
		if (y <= 0) {
			y = 0;
		}
	}

	@Override
	public void draw() {
		background(0, 210, 255);
		fill(0, 20, 255);
		rect(x, y, 45, 60);
		keyPressed();
		sam.display();
		sam.move();
		sam.doit();
		sim.display();
		sim.move();
		sim.doit();

	}

	public class Cat {
		int catX;
		int catY;
		int size;
		int speed;

		public Cat(int catX, int catY, int size, int speed) {
			this.catX = catX;
			this.catY = catY;
			this.size = size;
			this.speed = speed;

			
		}
		void doit(){
		if (catX > 800) {
			catX=0;
		}
		}
		void display() {
			fill(255, 255, 240);
			rect(catX, catY, size, 50);
		}

		void move() {
			catX += speed;
		}
	}

	static public void main(String[] args) {
		PApplet.main(Frogger.class.getName());
	}
}
