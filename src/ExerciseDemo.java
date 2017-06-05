/**
 * Created by Jared on 5/06/2017.
 */
public class ExerciseDemo {

    public void runDemo(int n) {
        TriangleExerciser exercise1 = new TriangleExerciser();
        System.out.println("Easiest exercise ever");
        exercise1.drawAsterisk();
        System.out.println("Draw a horizontal line");
        exercise1.drawHorizontalLine(n);
        System.out.println("Draw a vertical line");
        exercise1.drawVerticalLine(n);
        System.out.println("Draw a right triangle");
        exercise1.drawRightTriangle(n);
    }
}
