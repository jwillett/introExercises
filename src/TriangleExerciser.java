/**
 * Created by Jared on 5/06/2017.
 */
public class TriangleExerciser {
    public void drawAsterisk() {
        System.out.println('*');
    }

    public void drawHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print('*');
        }
        System.out.println();
    }

    public void drawVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println('*');
        }
    }

    public void drawRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
