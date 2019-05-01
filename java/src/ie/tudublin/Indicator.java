package ie.tudublin;

public class Indicator extends Button
{
    private int light = 0;

    public Indicator(UI ui, float x, float y, float width, float height, String text, int state)
    {
        super(ui, x, y, width, height, text);
        light = state;
    }

    //Used to set the value for light
    public void setState(int newState)
    {
        light = newState;
    }

    public void update()
    {
        ui.noStroke();
        if(light == 0) {
            ui.fill(205, 0, 0);
        }

        //If the light varible is set to 1 and the 'max' (remainging fuel) variable
        //is greater than 2, the indicator will show green, otherwise remain red 
        if(light == 1) {
            if(ui.max < 1f) {
                ui.fill(205, 0, 0);
            }
            else {
                ui.fill(0, 205, 0);
            }
        }
        ui.ellipse((ui.width / 7) + 60, ((ui.height / 7) * 5) + 75, 20, 20);
    }

    //toString Method
    @Override
    public String toString() {
        return super.toString() + "Indicator [light=" + light + "]";
    }
}