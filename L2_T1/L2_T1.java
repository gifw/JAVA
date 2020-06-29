package L2_T1;

import java.util.Arrays;
import java.util.Scanner;

public class L2_T1 {
    public static void main(String[] args) {
        int counter = 0;
        int s = 0;
        Scanner in = new Scanner(System.in);
        int[] gotArray = {1, 2, 5, 12, 5, 3, 8, 4, 3, 10};
        int[] arrBack = new int[gotArray.length];
        System.out.print("Enter Element to be deleted : ");
        int elem = in.nextInt();
        for (int i = 0; i < gotArray.length; i++){
            if (gotArray[i] != elem) {
                arrBack[s] = gotArray[i];
                s++;
            } else {
                counter++;
            }
        }
        int[] lastArr = Arrays.copyOf(arrBack, arrBack.length - counter);
        for (int h = 0; h < lastArr.length; h++) {
            System.out.print(lastArr[h] + " ");
        }


    }
}
