package ie.tudublin;

public class Fuel
{
    UI ui;
    private float x;
    private float y;

    public Fuel(UI ui, float x, float y)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
    }

    public void render()
    {
        ui.fill(180);
        ui.stroke(255);
        ui.arc(x, y, 100, 100, ui.radians(0), ui.radians(ui.max), ui.PIE);
    }

    public void update()
    {
        ui.max -= ui.fuelConsumption;
    }

    //Getters and Setters

    /**
     * @return the ui
     */
    public UI getUi() {
        return ui;
    }

    /**
     * @param ui the ui to set
     */
    public void setUi(UI ui) {
        this.ui = ui;
    }

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    //toString Method
    @Override
    public String toString() {
        return "Fuel [ui=" + ui + ", x=" + x + ", y=" + y + "]";
    }
}