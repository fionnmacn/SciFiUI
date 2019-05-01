package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button buttonWarp;
    Indicator indicatorWarp;
    int light;

    Button buttonSpeed;
    Reading speedValue;
    String value = "10";

    Fuel fuel;
    float max = 360f;
    float fuelConsumption = 0.05f;

    Star[] stars = new Star[2000];
    boolean[] keys = new boolean[1024];
    float speed;

    Radar radar;

    Console console;

    public void keyPressed()
    {
        keys[keyCode] = true;

        if(key == CODED) {
            //Increases speed and updates value when the 'Up' key is pressed
            if(keyCode == UP) {
                speed = 10f;
                indicatorWarp.setState(0);
                speedValue.setValue("100");
                fuelConsumption = 0.2f;
            }
            
            //Resets speed and updates value when the 'Down' key is pressed
            else if(keyCode == DOWN) {
                speed = 0.3f;
                indicatorWarp.setState(0);
                speedValue.setValue("10");
                fuelConsumption = 0.05f;
            }
        }
        //When 'g' is pressed, speed is set to 60 and the value is updated
        else if(key == 'g' || key == 'G') {
            speed = 60f;
            indicatorWarp.setState(1);
            speedValue.setValue("10000");
            fuelConsumption = 0.6f;
        }
    }
    
    public void keyReleased()
    {
        keys[keyCode] = false;
    }

    public void settings()
    {
        //Sets the display size
        size(1280, 720);
    }

    public void setup()
    {
        //Initialises all the stars
        for (int i = 0; i < stars.length; i++) {
            stars[i] = new Star(this, width, height);
        }
        speed = 0.1f;
        
        //Creates a Button and Indicator object
        buttonWarp = new Button(this, width / 7, (height / 7) * 5, 120, 50, "Warp");
        indicatorWarp = new Indicator(this, width / 7, ((height / 7) * 5) + 50, 120, 50, "", 0);

        //Creates a Button and Reading object
        buttonSpeed = new Button(this, (width-(width / 7)) - 120, (height / 7) * 5, 120, 50, "Speed");
        speedValue = new Reading(this, (width-(width / 7)) - 120, ((height / 7) * 5) + 50, 120, 50, "", value);

        //Creates a Fuel object
        fuel = new Fuel(this, (width / 7) - 95, ((height / 3) * 2) + 82);

        radar = new Radar(this, 0.75f, width - 95, ((height / 3) * 2) + 82, 50);

        //Creates the Console object
        console = new Console(this, width, height);
    }

    public void draw()
    {
        //Sets the background to black
        background(0);

        //Pushes the matrix onto the stack and translates
        pushMatrix();
        translate(width/2, height/2);
        for (int i = 0; i < stars.length; i++) {
            stars[i].update();
            stars[i].render();
        }
        popMatrix();
        
        //Draws the console
        console.render();
        
        buttonWarp.render();
        indicatorWarp.render();
        indicatorWarp.update();

        buttonSpeed.render();
        speedValue.render();
        speedValue.update();

        noFill();
        stroke(255);
        ellipse((width / 7) - 95, ((height / 3) * 2) + 82, 100, 100);
        text("Fuel", (width / 7) - 95, ((height / 3) * 2) + 145);
        fuel.update();
        fuel.render();

        //mc.update();
        //mc.render();

        radar.update();
        radar.render();
        noFill();
        stroke(255);
        ellipse(width - 95, ((height / 3) * 2) + 82, 100, 100);
        fill(255);
        text("Radar", width - 95, ((height / 3) * 2) + 145);


    }
}

