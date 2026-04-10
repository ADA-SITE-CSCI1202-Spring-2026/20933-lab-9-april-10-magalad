public class GenericNumeric<T extends Number> {

    private T number;

    public GenericNumeric(T number) {
        this.number = number;
    }

    // b) return reciprocal (1 / number)
    public double reciprocal() {
        return 1.0 / number.doubleValue();
    }

    // c) return fractional part
    public double fractional() {
        return number.doubleValue() % 1;
    }

    // d) check absolute equality between two GenericNumeric objects
    public boolean absEqual(GenericNumeric<?> other) {

        double val1 = Math.abs(this.number.doubleValue());
        double val2 = Math.abs(other.number.doubleValue());

        return val1 == val2;
    }

    // main method to test everything
    public static void main(String[] args) {

        GenericNumeric<Double> num1 = new GenericNumeric<>(9.76);
        GenericNumeric<Float> num2 = new GenericNumeric<>(-0.76f);

        System.out.println("Reciprocal: " + num1.reciprocal());
        System.out.println("Fractional: " + num1.fractional());

        System.out.println("Absolute equal? " + num1.absEqual(num2));
    }
}