public class Colour {
    float red_value;
    float green_value;
    float blue_value;

    public Colour(float red, float green, float blue) {
        if ((red < 0.0f || red > 1.0f) ||
            (green < 0.0f || green > 1.0f) ||
            (blue < 0.0f || blue > 1.0f)) {
            throw new IllegalArgumentException("RGB values must be in the range [0.0 - 1.0]");
        }
        this.red_value = red;
        this.green_value = green;
        this.blue_value = blue;
    }

    public Colour(int rgb) {
        this.red_value = ((rgb >> 16) & 0xff) / 255f;
        this.green_value = ((rgb >> 8) & 0xff) /255f;
        this.blue_value = (rgb & 0xff) / 255f;
    }

    public float getRed() { return this.red_value; }
    public float getGreen() { return this.green_value; }
    public float getBlue() { return this.blue_value; }
}
