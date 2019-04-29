package ie.tudublin;


public class Console
{
    UI ui;
    public float width;
    public float height;

    public Console(UI ui, float width, float height)
    {
        this.ui = ui;
        this.width = width;
        this.height = height;
    }

    public void render()
    {
        ui.pushMatrix();
        ui.noStroke();

        

        ui.popMatrix();
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
     * @return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(float width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
    }
}