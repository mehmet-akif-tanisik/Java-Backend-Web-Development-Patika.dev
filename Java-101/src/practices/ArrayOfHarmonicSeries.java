package practices;
import java.util.Arrays;

public class ArrayOfHarmonicSeries {

    public static void main(String[] args) {

        double[] numbers = {2, 3.4, 5.3, 2.1};
        System.out.println("Arr --->"+Arrays.toString(numbers));
        System.out.printf("Harmonic average: %.3f", harmonic(numbers));
    }
    public static double harmonic(double[] arr){
        double sum = 0;
        for (double v : arr) sum += 1 / v;
        return arr.length / sum;
    }

}
