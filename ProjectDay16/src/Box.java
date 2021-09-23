public class Box {
    private int length, width, height;

    public void intialize(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    public void display() {
        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("height = " + height);
    }

    public int getvolume() {
        return length * width * height;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int l) {
        length = l;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int w) {
        width = w;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int h) {
        height = h;
    }
}
