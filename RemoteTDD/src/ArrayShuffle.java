

public class ArrayShuffle
{
    public static int[] createArray(int min, int max) {
        int[] array = new int[max-1];
        for(int i = 0; i < max - min; i++)
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
}
