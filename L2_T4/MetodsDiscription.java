package L2_T4;

import java.util.Arrays;

public class MetodsDiscription {

        static int arr[] = new int[10];

        public void creatArray() {
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + ", ");
        }
    }

        public void add(int number) {
        int[] newArray = Arrays.copyOf(arr, arr.length + 1);
        newArray[newArray.length - 1] = number;
        System.out.print("so you add " + number + ", you new array is:   ");
        for (int element : newArray) {
            System.out.print(element + ", ");
        }
        System.out.println();
        arr = newArray;
    }

        public int get(int index) {
        System.out.print("\n index " + index + " is ");
        return arr[index];
    }

    }
