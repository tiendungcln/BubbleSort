import java.util.Arrays;

public class Level_1_1 {
    // - In mảng sau mỗi vòng ngoài
    // Sau vòng 1: ...
    // Sau vòng 2: ...
    // - Đếm số lần swap
    // Số lần swap: 4

    public static void bubbleSortAscending(int[] arr){

        int count = 0;

        for (int i = 0; i < arr.length - 1; i++){

            for (int j = 0; j < arr.length - 1 - i; j++){

                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }

            }

            System.out.println("Sau vòng " + (i + 1) + ": " + Arrays.toString(arr));

        }

        System.out.println("Số lần swap: " + count);

    }

    public static void main(String[] args){

        int[] arr = {5, 1, 4, 2};

        bubbleSortAscending(arr);

    }

}
