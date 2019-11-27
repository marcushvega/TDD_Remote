import java.util.Arrays;

public class CombinedNumber {
    private int[] inputArray;

    public CombinedNumber(int[] input){
        inputArray = input.clone();
    }

    public int getCombinedNumber() {
        return inputArray[0];
    }
}
