package practices;

import java.util.Arrays;

public class RepeatingEvenNumsArray {

    public static void main(String[] args) {

        int[] list = {3, 7,2,2, 3, 3, 2,4,4, 9,6,7,8,9,7,6, 10, 21, 1, 33, 9, 1};
        int[] duplicate = new int[list.length];

        int startIndex = 0;

        for (int i=0 ; i<list.length; i++){
            for (int j = 0 ; j< list.length ; j++){
                if ( (i!=j) && list[i]%2==0 &&(list[i] == list[j]) ){
                    if (!isFind(duplicate,list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        System.out.println("Array--> " + Arrays.toString(list));
        System.out.print("Duplicated even numbers: ");

        for (int element: duplicate){
            if (element!=0){
                System.out.print(element+", ");
            }
        }
    }

    public static boolean isFind(int[] arr, int val){
        for (int element: arr){
            if (element==val){
                return true;
            }
        }
        return false;
    }
}
