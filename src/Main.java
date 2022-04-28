import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a1 = {100, 200, 300, 400, 500};
        int[] a2 = {150, 250, 750, 1000, 5000};
        for (int x : mergeArrays(a1, a2)) {
            System.out.println(x);
        }
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] stackedArray = new int[a1.length + a2.length];
        int count = 0;
        for (int i = 0; i < a1.length; i++) {
            stackedArray[i] = a1[i];
            count++;
        }
        for (int j = 0; j < a2.length; j++) {
            stackedArray[count++] = a2[j];
        }
        Arrays.sort(stackedArray);
        return stackedArray;
    }
}


