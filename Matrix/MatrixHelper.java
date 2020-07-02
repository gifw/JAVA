package Matrix;

public class MatrixHelper {
    public static boolean isMagic(int[] sumsArray) {
        for (int value : sumsArray) {
            if (sumsArray[0] != value) {
                return false;
            }
        }
        return true;
    }
}
