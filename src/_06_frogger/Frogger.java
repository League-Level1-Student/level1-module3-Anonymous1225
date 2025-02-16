package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    int x=270;
	int y=550;
    @Override
    public void settings() {
        size(800,600);
    }

    @Override
    public void setup() {

    }
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
                //Frog Y position goes up
            	y-=30;
            }
            else if(keyCode == DOWN)
            {
            	y+=30;
                //Frog Y position goes down 
            }
            else if(keyCode == RIGHT)
            {
                //Frog X position goes right
            	x+=30;
            }
            else if(keyCode == LEFT)
            {
                //Frog X position goes left
            	x-=30;
            }
        }
    }
    @Override
    public void draw() {
    	background(0,210,255);
    	fill(0,205,255);
    	
    	
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
