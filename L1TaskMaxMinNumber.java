public class L1TaskMaxMinNumber {
    public static void main(String[] args) {
        int[] array = new int[10];
        int maxNumber = -1, minNumber = 101;
        double counter = 0;

        for (int i = 0; i < array.length; i++) {
            int a = 0;
            int b = 100;
            array[i] = a + (int) (Math.random() * b);
            counter += array[i];
            if(maxNumber <= array[i]) {
                maxNumber = array[i];
            }
            if(minNumber >= array[i]) {
                minNumber = array[i];
            }
            System.out.println(array[i]);
        }
        System.out.println(" максимальное число: " + maxNumber);
        System.out.println(" минимальное число: " + minNumber);
        System.out.println(" среднее число: " + counter / array.length);
    }
}
