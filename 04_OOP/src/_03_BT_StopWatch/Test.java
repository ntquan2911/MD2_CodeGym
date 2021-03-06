package _03_BT_StopWatch;

public class Test {
    public static void main(String[] args) {
        long[] array = new long[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round(Math.random() * 5000);
        }

        StopWatch sw = new StopWatch();
        System.out.println("The start time is: " + sw.getStartTime());
        sortArray(array);

        sw.stop();
        System.out.println("The stop time is: " + sw.getEndTime());
        System.out.println("Time for selection sort 100000 number is: " + sw.getElapsedTime() + " millisecond");
    }

    static void sortArray(long[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index_min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index_min] > arr[j]) {
                    index_min = j;
                }
            }
            long temp = arr[index_min];
            arr[index_min] = arr[i];
            arr[i] = temp;
        }
    }
}
