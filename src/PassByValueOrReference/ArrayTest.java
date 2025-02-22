package PassByValueOrReference;

import java.util.Arrays;

public class ArrayTest {
    static void reassignArray(int[] arr) {
        int[] test = arr.clone();
        System.out.println("Clone: " + Arrays.toString(test));
        arr[0] = test[4];
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Trước khi gọi phương thức: " + numbers[0]);

        reassignArray(numbers);

        System.out.println("Sau khi gọi phương thức: " + numbers[0]);
    }
}
