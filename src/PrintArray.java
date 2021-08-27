public class PrintArray {

    private int[] array;

    public PrintArray(int[] array) {

        this.array = array;

        System.out.println("The Given array is:");
        for (int j : this.array) System.out.print(j + " ");
        System.out.println();
    }

    public void print(String SortType) {

        System.out.println("The " + SortType + " Method:");

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        System.out.println();
    }
}
