public class BubbleSort extends BaseSort implements Sort{



    //private int size;
    private int[] numbers;
    private PrintArray printArray;



    public BubbleSort(int[] numbers) {
        super("Bubble   Sort");
        this.numbers = numbers;
    }

    @Override
    public void sort() {

        int temp;
        for (int i = 0; i <= numbers.length - 2; i++) {

            for (int j = 0; j <= numbers.length - 2 - i; j++) {

                if (numbers[j] > numbers[j + 1]) {

                        temp = numbers[j + 1];
                        numbers[j + 1] = numbers[j];
                        numbers[j] = temp;
                        //System.out.println(numbers.length);
                }
            }
        }
    }


}
