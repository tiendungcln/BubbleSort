import java.util.Arrays;

public class Level_1_2 {
    // Kiểm tra mảng đã sorted chưa
    // Nếu sorted rồi:
    // break;

    public static void optimizedBubbleSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++){

            boolean swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++){

                if (arr[j] > arr[j + 1]){

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;

                }

            }

            if (swapped){
                System.out.println("Sau vòng " + (i + 1) + ": " + Arrays.toString(arr));
            }else{
                System.out.println("Mảng đã sorted từ trước vòng " + (i + 1));
                break;
            }

        }

    }

    public static void main(String[] args){

        int[] arr = {1, 2 , 6, 7, 9};
        optimizedBubbleSort(arr);

    }


}
