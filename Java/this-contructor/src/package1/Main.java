package package1;

public class Main {

    private int x, y;
    private int width, height;
        
    public Main() {
        this(0, 0, 1, 1);
    }
    public Main(int width, int height) {
        this(0, 0, width, height);
    }
    public Main(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
