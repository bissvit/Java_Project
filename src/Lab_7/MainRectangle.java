package Lab_7;

public class MainRectangle {
    static void main() {
        MovableRectangle rect = new MovableRectangle(10, 10,  1);

        System.out.println(rect);
        rect.moveDown();
        rect.moveDown();
        rect.moveRight();
        System.out.println("После перемещения:");
        System.out.println(rect);
    }
}
