/**
 * Created by Jared on 5/06/2017.
 */
public class DiamondExerciser {

    // Draw spaces and asterisks appropriate for line i of a diamond exercise
    // of "size" n
    private void drawDiamondLine(int i, int n) {
        // number of spaces preceding: (n-1) - i
        for (int j = 0; j < (n - i - 1); j++) {
            System.out.print(' ');
        }

        // number of stars on line: num = 1 + i*2
        for (int j = 0; j < (i*2 + 1); j++) {
            System.out.print('*');
        }

        System.out.println();
    }

    public void drawIsoscelesTriangle(int n) {

        for (int i = 0; i < n; i++) {
            drawDiamondLine(i, n);
        }

    }

    public void drawDiamond(int n) {

        drawIsoscelesTriangle(n);

        for (int i = n - 2; i >= 0; i--) {
            drawDiamondLine(i, n);
        }

    }

    public void drawNameDiamond(int n, String name) {
        for (int i = 0; i < n - 1; i++) {
            drawDiamondLine(i, n);
        }

        System.out.println(name);

        for (int i = n - 2; i >= 0; i--) {
            drawDiamondLine(i, n);
        }
    }
}
