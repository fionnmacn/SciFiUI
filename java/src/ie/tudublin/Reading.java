package ie.tudublin;

import processing.core.PApplet;

public class Reading extends Button
{
    private String value = "10";

    public Reading(UI ui, float x, float y, float width, float height, String text, String value)
    {
        super(ui, x, y, width, height, text);
        value = "10";
    }

    public void setState(String newState)
    {
        value = newState;
    }

    public void update()
    {
        ui.stroke(255);
        ui.strokeWeight(2);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.textSize(20);
        //Checks the value of max (fuel level) is greater than 1 and
        //displays the appropriate speed value on the dashboard
        if(ui.max > 1f) {
            if(value == "10") {
                ui.text(value, (ui.width-(ui.width / 7)) - 60, ((ui.height / 7) * 5) + 75);
            }
            if(value == "100") {
                ui.text(value, (ui.width-(ui.width / 7)) - 60, ((ui.height / 7) * 5) + 75);
            }
            if(value == "10000") {
                ui.text(value, (ui.width-(ui.width / 7)) - 60, ((ui.height / 7) * 5) + 75);;
            }
        }
        //This code executes when max drops below 1
        else {
            ui.text("0", (ui.width-(ui.width / 7)) - 60, ((ui.height / 7) * 5) + 75);
        }
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    //toString Method
    @Override
    public String toString() {
        return super.toString() + "Reading [value=" + value + "]";
    }    
}