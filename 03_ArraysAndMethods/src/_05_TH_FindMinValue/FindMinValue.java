package _05_TH_FindMinValue;

public class FindMinValue {
    public static void main(String[] args) {
        int[] myArray = {-1, 2, 3, 4, 5, 6};
        int index = minValue(myArray);
        System.out.println("The smallest element in array is: " + myArray[index]);
    }

    public static int minValue(int[] myArray) {
        int index = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < myArray[index]) {
                index = i;
            }
        }
        return index;
    }
}
