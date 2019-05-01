package ie.tudublin;

public class Console
{
    UI ui;
    private float width;
    private float height;

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
        ui.fill(50, 50, 75);
        ui.triangle(0, height / 2, 0, (height / 3) * 2, width / 7, (height / 3) * 2);
        ui.triangle(width, height / 2, width, (height / 3) * 2, width-(width / 7), (height / 3) * 2);
        ui.rect(0, (height / 3) * 2, width, height);

        ui.stroke(220);
        ui.strokeWeight(3);
        ui.line(0, height / 2, width / 7, (height / 3) * 2);
        ui.line(width / 7, (height / 3) * 2, width-(width / 7), (height / 3) * 2);
        ui.line(width-(width / 7), (height / 3) * 2, width, height / 2);

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

    //toString Method
    @Override
    public String toString() {
        return "Console [height=" + height + ", ui=" + ui + ", width=" + width + "]";
    }
}