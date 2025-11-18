package Lab_2;

public class BallTest {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0);
        System.out.println(ball);

        ball.move(11, 5);
        System.out.println("Мяч переместился: " + ball);

        ball.setXY(5, 2);
        System.out.println("Новые координаты: " + ball);
    }
}