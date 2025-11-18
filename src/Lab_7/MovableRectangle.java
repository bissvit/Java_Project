package Lab_7;

public class MovableRectangle implements Movable{
    private int x;
    private int y;
    private int step;

    public MovableRectangle(int x, int y, int step) {
        this.x = x;
        this.y = y;
        this.step = step;
    }

    @Override
    public void moveUp() {
        y += step;
    }

    @Override
    public void moveDown() {
        y -= step;
    }

    @Override
    public void moveLeft() {
        x -= step;
    }

    @Override
    public void moveRight() {
        x += step;
    }

    public String toString() {
        return "Координаты: x = " + x + ", y = " + y;
    }
}
