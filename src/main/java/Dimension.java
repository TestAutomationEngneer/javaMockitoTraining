public class Dimension {

    public int height;
    public int width;
    public int trunkCapacity;

    public Dimension(int height, int width, int trunkCapacity) {
        this.height = height;
        this.width = width;
        this.trunkCapacity = trunkCapacity;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    @Override
    public String toString() {
        return "height (cm): " + getHeight() + " width (cm): " + getWidth() + " trunk capacity (l): " + getTrunkCapacity();
    }
}
