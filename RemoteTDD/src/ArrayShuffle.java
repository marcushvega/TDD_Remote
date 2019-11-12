

public class ArrayShuffle
{
    public static int[] createArray(int min, int max) {
        int[] array = new int[max-1];
        array[0] = 1;
        array[1] = 2;
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
}
