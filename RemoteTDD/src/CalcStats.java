import java.util.Arrays;

public class CalcStats {

    private static int[] arrayInt;
    private static int minValue;
    private static int maxValue;
    private static double averageValue;

    public CalcStats(int[] input){
        arrayInt = input.clone();
        setMin();
        setMax();
        setAverageValue();
    }

    public static int min(int[] arr) {
        return 1;
    }

    public static int getMin() {
        return minValue;
    }

    private static void setMin() {
        int mini = arrayInt[0];

        if (arrayInt.length > 1){
            for (int i = 1; i < arrayInt.length; i++){
                if (arrayInt[i] < mini){
                    mini = arrayInt[i];
                }
            }
        }
        minValue = mini;
    }

    public static int getMax() {
        return maxValue;
    }

    private static void setMax() {
        int max = arrayInt[0];
        if (arrayInt.length == 1)
            maxValue = max;
        else {
            for (int i = 1; i < arrayInt.length; i++) {
                if (arrayInt[i] > max) {
                    max = arrayInt[i];
                }
            }
            maxValue = max;
        }
    }

    public static int countValues() {return arrayInt.length;}

    public static void setAverageValue() {
        int sum = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            sum += arrayInt[i];
        }
        averageValue = sum / arrayInt.length;
    }

    public static double getAverageValue() { return averageValue;}

}
