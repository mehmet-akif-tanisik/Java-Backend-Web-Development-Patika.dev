package practices;
import java.util.Arrays;
import java.util.Scanner;

public class MinMaxOfArray {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int[] list ={15,12,788,1,-1,-778,2,0};

        System.out.println("Array--> " + Arrays.toString(list));
        System.out.print("Please enter a number to see min/max close: ");
        int val = keyboard.nextInt();
        minMax(list,val);

    }
    public static void minMax(int[] arr, int val){
        Arrays.sort(arr);
        if (val>=arr[0] && val<=arr[arr.length-1]){
            for (int i=0 ; i<arr.length; i++){
                if (arr[i]<=val && arr[i+1]>=val){
                    System.out.println("Min close: " + arr[i]);
                    System.out.println("Max close: " + arr[i+1]);
                    break;
                }
            }
        } else {
            System.out.println("Value entered out of range!!");
        }
    }
}
