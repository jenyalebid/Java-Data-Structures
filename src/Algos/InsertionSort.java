package Algos;

public class InsertionSort extends BaseSort implements Sort{

    private int[] numbers;
    private PrintArray printArray;

    public InsertionSort(int[] numbers) {
        super("Insertion Algos.Sort");
        this.numbers = numbers;
    }

    @Override
    public void sort() {

        int j, current;
        for ( int i = 0; i <= numbers.length - 1; i ++) {

            current = numbers[i];

            j = i - 1;
            while (j >= 0 && numbers[j] > current) {

                numbers[j + 1] = numbers[j];
                j = j - 1;
            }

            numbers[j + 1] = current;
        }
    }
}
