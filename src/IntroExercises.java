import java.util.ArrayList;

public class IntroExercises {

    public static void main(String args[]) {
        IntroExercises exercises = new IntroExercises();
        exercises.runDemo(8);
    }

    public void runDemo(int n) {

        TriangleExerciser exercise1 = new TriangleExerciser();
        DiamondExerciser exercise2 = new DiamondExerciser();
        FizzBuzzExerciser exercise3 = new FizzBuzzExerciser();
        PrimeFactorsExerciser exercise4 = new PrimeFactorsExerciser();
        ArrayList<Integer> primeFactors;

        System.out.println("Easiest exercise ever");
        exercise1.drawAsterisk();
        System.out.println("Draw a horizontal line");
        exercise1.drawHorizontalLine(n);
        System.out.println("Draw a vertical line");
        exercise1.drawVerticalLine(n);
        System.out.println("Draw a right triangle");
        exercise1.drawRightTriangle(n);

        System.out.println("Isosceles Triangle");
        exercise2.drawIsoscelesTriangle(n);
        System.out.println("Diamond");
        exercise2.drawDiamond(n);
        System.out.println("Diamond with Name");
        exercise2.drawNameDiamond(n, "Jared");

        System.out.println("FizzBuzz Exercise");
        exercise3.FizzBuzz();

        System.out.println("Prime Factors Exercise");
        primeFactors = exercise4.generate(30);
        System.out.println(primeFactors);
    }
}
