package _06_frogger;

import java.awt.event.KeyEvent;

import processing.core.PApplet;

public class Frogger extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int x = 360;
	int y = 540;
	int b = 0;
	Cat sam1;
	Cat sam2;
	Cat sam3;
	Cat sam4;
	Cat sim1;
	Cat sim2;
	Cat sim3;
	Cat sim4;
	Cat som1;
	Cat som2;
	Cat som3;
	Cat som4;
	Cat sem1;
	Cat sem2;
	Cat sem3;
	Cat sem4;
	

	@Override
	public void settings() {
		size(810, 600);
	}

	@Override
	public void setup() {
		sam1 = new Cat(0, 420, 80, 2);
		sam2 = new Cat(200, 420, 80, 2);
		sam3 = new Cat(400, 420, 80, 2);
		sam4 = new Cat(600, 420, 80, 2);
		sim1 = new Cat(0, 300, 80, 2);
		sim2 = new Cat(200, 300, 80, 2);
		sim3 = new Cat(400, 300, 80, 2);
		sim4 = new Cat(600, 300, 80, 2);
		som1 = new Cat(0, 180, 80, 2);
		som2 = new Cat(200, 180, 80, 2);
		som3 = new Cat(400, 180, 80, 2);
		som4 = new Cat(600, 180, 80, 2);
		sem1 = new Cat(0, 60, 80, 2);
		sem2 = new Cat(200, 60, 80, 2);
		sem3 = new Cat(400, 60, 80, 2);
		sem4 = new Cat(600, 60, 80, 2);
	}

	public void keyPressed() {
		System.out.println(keyCode);
		if (key == CODED) {   //TODO::: FIX WASD!!!
			if (keyCode == UP || keyCode == KeyEvent.VK_W ) {
				// Frog Y position goes up
				y -= 30;
			} else if (keyCode == DOWN || key == 's' || key == 'S') {
				y += 30;
				// Frog Y position goes down
			} else if (keyCode == RIGHT|| key == 'd' || key == 'D') {
				// Frog X position goes right
				x += 30;
			} else if (keyCode == LEFT|| key == 'a' || key == 'A') {
				// Frog X position goes left
				x -= 30;
			}
			inside();
		}
	}

	public void inside() {
		if (x >= 765) {
			x = 765;
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
		rect(x, y, 40, 60);
		sam1.display();
		sam1.move();
		sam1.tp();
		sam1.overlap();
		sam2.display();
		sam2.move();
		sam2.tp();
		sam2.overlap();
		sam3.display();
		sam3.move();
		sam3.tp();
		sam3.overlap();
		sam4.display();
		sam4.move();
		sam4.tp();
		sam4.overlap();
		sim1.display();
		sim1.move();
		sim1.tp();
		sim1.overlap();
		sim2.display();
		sim2.move();
		sim2.tp();
		sim2.overlap();
		sim3.display();
		sim3.move();
		sim3.tp();
		sim3.overlap();
		sim4.display();
		sim4.move();
		sim4.tp();
		sim4.overlap();
		som1.display();
		som1.move();
		som1.tp();
		som1.overlap();
		som2.display();
		som2.move();
		som2.tp();
		som2.overlap();
		som3.display();
		som3.move();
		som3.tp();
		som3.overlap();
		som4.display();
		som4.move();
		som4.tp();
		som4.overlap();
		sem1.display();
		sem1.move();
		sem1.tp();
		sem1.overlap();
		sem2.display();
		sem2.move();
		sem2.tp();
		sem2.overlap();
		sem3.display();
		sem3.move();
		sem3.tp();
		sem3.overlap();
		sem4.display();
		sem4.move();
		sem4.tp();
		sem4.overlap();
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
		void tp(){
		if (catX > 800) {
			catX=0-size;
		}
		if (x>catX || x<catX+size) {
			
		}
		}
		void overlap() {
			if (x<catX+size && x+40>catX && y<catY+60 && y+60>catY) {
				System.out.println("true");
				x=360;
				y=540;
			}
		}
		void display() {
			fill(255, 255, 240);
			rect(catX, catY, size, 60);
			fill(40,32,12);
			rect(catX+60,catY+10,20,40);
		}

		void move() {
			catX += speed;
		}
	}

	static public void main(String[] args) {
		PApplet.main(Frogger.class.getName());
	}
}
