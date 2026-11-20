public class CompileTimePolyMorphism {
    public int add(int first, int second) {
        return first + second;
    }

    public int add(int first, int second, int third) {
        return first + second + third;
    }

    public double add(double first, double second) {
        return first + second;
    }

    public static void main(String[] args) {
        CompileTimePolyMorphism calculator = new CompileTimePolyMorphism();

        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.add(10, 20, 30));
        System.out.println(calculator.add(10.5, 20.5));
    }
}
