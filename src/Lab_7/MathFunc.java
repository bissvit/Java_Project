package Lab_7;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double value, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= value;
        }
        return result;
    }

    @Override
    public double complex(double deistv, double mnim) {
        return Math.sqrt(deistv*deistv + mnim*mnim);
    }

    public double length(double r) {
        return MathCalculable.pi * r * r;
    }
}
