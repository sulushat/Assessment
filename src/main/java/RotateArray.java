import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = {1,2};

        int positionsToRotate = 2;
        int negativeToRotate= -2;
        int positions= 10;

      //  int[] rotatedArray = rotateArray(array, negativeToRotate);
       // int[] rotatedArray2 = rotateArray(array, positionsToRotate);
        int[] rotatedArray3 = rotateArray(array, positions);
        //System.out.println(Arrays.toString(rotatedArray2));
        System.out.println(Arrays.toString(rotatedArray3));
        //System.out.println(Arrays.toString(rotateArray(array2,positions)));
    }


            public static int[] rotateArray(int[] arr, int positions) {
                if (positions < 0) {
                    throw new IllegalArgumentException("Number of positions to rotate must be non-negative.");
                }

                int n = arr.length;
                if (n == 0) {
                    return arr;
                }

                int newPosition = positions % n;

                int[] rotatedArray = new int[n];

                for (int i = 0; i < n; i++) {
                    rotatedArray[i] = arr[(i + newPosition) % n];
                }

                return rotatedArray;
            }

        }




