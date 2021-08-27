public class SelectionSort extends BaseSort implements Sort{

    private int[] numbers;
    private PrintArray printArray;

    public SelectionSort(int[] numbers) {
        super("Selection Sort");
        this.numbers = numbers;
    }

    @Override
    public void sort() {

        int minIndex, temp;
        // iterate through the whole array
        for (int i = 0; i <= numbers.length - 2; i++) {

            minIndex = i;
            // starting from second element of array, iterate whole array until found the lowest value
            for(int j = i + 1; j <= numbers.length - 1; j++) {

                // if any consecutive number in array lower than the current number, store it in minIndex
                if (numbers[j] < numbers[minIndex])
                    minIndex = j;
            }
            temp = numbers[minIndex]; // store value of the lowest number in array in temp
            numbers[minIndex] = numbers[i]; // replace the lowest number in array with current position number
            numbers[i] = temp; // replace current position number with the lowest number
        }
    }
}
