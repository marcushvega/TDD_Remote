import java.util.Arrays;

public class CombinedNumber {
    private int[] inputArray;
    private int finalNumber;

    public CombinedNumber(int[] input){
        inputArray = input.clone();
        setFinalNumber();
    }

    public void setFinalNumber(){
        Arrays.sort(inputArray);
        finalNumber = 0;
        String string = String.valueOf(finalNumber);
        for (int i = inputArray.length-1; i > -1; i--){
            string += String.valueOf(inputArray[i]);
        }
        finalNumber = Integer.parseInt(string);
    }

    public int getCombinedNumber(){
        return finalNumber;
    }
}
