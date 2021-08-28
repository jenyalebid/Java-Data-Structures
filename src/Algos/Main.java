package Algos;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Algos!");

        int[] numbers = {7, 6, 5, 4, 3, 2, 1};

        var printArray = new PrintArray(numbers);
        var bubbleArray = new BubbleSort(numbers);
        var selectionArray = new SelectionSort(numbers);
        var insertionArray = new InsertionSort(numbers);


        bubbleArray.sort();
        selectionArray.sort();
        insertionArray.sort();

        bubbleArray.printArray(printArray);
        selectionArray.printArray(printArray);
        insertionArray.printArray(printArray);




//
        //numbers = selectionArray.sort();

    }
}
