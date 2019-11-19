import java.util.Random;

public class ArrayShuffle
{
    public static int[] createArray(int min, int max) {
        int[] array = new int[6];
        for(int i = 0; i < 6; i++)
            array[i] = i+1;
        return array;
    }

    public static boolean equalArrays(int[] expected, int[] actual){
        for(int i = 0; i< actual.length; i++){
            if(actual[i] != expected[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean checkValue(int min, int max, int testVal){
        if (min <= testVal && testVal < max){
            return true;
        }
        return false;
    }

    public static boolean randomNumbers(int min, int max) {
        int[] array = createArray(min, max);
        for (int i: array)
            i = (int) (Math.ceil(Math.random() * (max - 2) + min));

        for (int i = 0; i < array.length; i++) {
            if(!checkValue(min, max, array[i]))
                return false;
        }
        return true;
    }
}
