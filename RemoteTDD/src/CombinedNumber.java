import java.util.Arrays;

public class CombinedNumber {
    private int[] inputArray;
    private int finalNumber;

    public CombinedNumber(int[] input){
        inputArray = input.clone();
        setFinalNumber();
    }

    public void setFinalNumber(){
        finalNumber = 0;
        String string = String.valueOf(finalNumber);
        for (int i = 0; i < inputArray.length; i++){
            string += String.valueOf(inputArray[i]);
        }
        finalNumber = Integer.parseInt(string);
    }

    public int getCombinedNumber(){
        return finalNumber;
    }
}
