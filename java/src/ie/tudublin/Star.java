package ie.tudublin;

public class Star
{
    UI ui;
    private float x;
    private float y;
    private float z;
    private float pz;
    private float width;
    private float height;

    public Star(UI ui, float width, float height) {
        this.ui = ui;
        this.width = width;
        this.height = height;
        x = ui.random(-width / 2, width / 2);
        y = ui.random(-height /2, height / 2);
        z = ui.random(width / 2);
        pz = z;
    }

    public void update() {
        if (ui.max > 1) {
            z -= ui.speed;
            if(z < 1) {
                z = width / 2;
                x = ui.random(-width/2, width/2);
                y = ui.random(-height/2, height/2);
                pz = z;
            }
        }
    }

    public void render() {
        ui.fill(255);
        ui.noStroke();
        float sx = ui.map(x / z, 0, 1, 0, width/2);
        float sy = ui.map(y / z, 0, 1 , 0 , height/2);
        float r = ui.map(z, 0, width/2, 5, 0);
        ui.ellipse(sx, sy, r, r);
        
        float px = ui.map(x / pz, 0, 1, 0, width/2);
        float py = ui.map(y / pz, 0, 1, 0, height/2);
        pz = z;
        ui.stroke(255);
        ui.line(px, py, sx, sy);
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

    /**
     * @return the z
     */
    public float getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(float z) {
        this.z = z;
    }

    /**
     * @return the pz
     */
    public float getPz() {
        return pz;
    }

    /**
     * @param pz the pz to set
     */
    public void setPz(float pz) {
        this.pz = pz;
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
        return "Star [height=" + height + ", pz=" + pz + ", ui=" + ui + ", width=" + width + ", x=" + x + ", y=" + y + ", z=" + z + "]";
    }
}