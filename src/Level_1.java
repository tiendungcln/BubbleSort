import java.util.Arrays;

public class Level_1 {
    // - Sắp xếp tăng dần
    // [5, 1, 4, 2]
    // => [1, 2, 4, 5]
    // - Sắp xếp giảm dần
    // [5,1,4,2]
    // => [5,4,2,1]

    public static void bubbleSortAscending(int[] arr){

        // Nếu Bubble Sort chuẩn thì chạy đủ n - 1 lần sẽ luôn sort xong
        // Trên đó n = 4 phần tử nên n - 1 = 3 lần là for sẽ chạy 3 lần
        for (int i = 0; i < arr.length - 1; i++){

            for (int j = 0; j < arr.length - 1 - i; j++){

                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSortDescending(int[]arr){

        for (int i = 0; i < arr.length - 1; i++){

            for (int j = 0; j < arr.length - 1 - i; j++){

                if (arr[j] < arr[j + 1]){

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args){

        int[] arr1 = {5, 1, 4, 2};
        int[] arr2 = {5, 1, 4, 2};

        bubbleSortAscending(arr1);
        bubbleSortDescending(arr2);

    }
}
